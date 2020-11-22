import java.io.*;
import java.net.*;
public class Main1{
  public static void main (String[] args) {
    try {
      Socket socket = new Socket (InetAddress.getByName (null), 10); //Socket
      BufferedReader read = new BufferedReader (new InputStreamReader (System.in) ); //BufferedReader
      PrintWriter PW = new PrintWriter (socket.getOutputStream() );
      System.out.println ("从Server接收三角形的三条边发送到服务器:");
      System.out.println ("请输入3条边:");
      for (int i = 0; i < 3; i++) {
        PW.flush();
        PW.println (read.readLine() );
      }
      PW.close();
      socket.close();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
class Server {
  public static void main (String args[]) {
    Server tcp = new Server();
    double a[] = new double[3];
    try {
      ServerSocket server = new ServerSocket (10); //ServerSocket
      Socket client = server.accept(); //Socket
      BufferedReader BR = new BufferedReader (new InputStreamReader
                                              (client.getInputStream() ) ); //读取流
      System.out.println ("从Client接收三角形的三条边:");
      String readline = "";
      for (int i = 0; i < 3; i++) {
        readline = BR.readLine();
        a[i] = Double.valueOf (readline);
      }
      System.out.println ("三角形的面积是:" + tcp.jiusan (a) );
      BR.close();//关闭读取流
      client.close();//关闭Socket
      server.close();//关闭ServerSocket
    } catch (IOException e) {
      e.printStackTrace();
    };
  }
  public double jiusan (double a[]) { //计算三角形面积的方法
    double area = 0.0;
    double temp = 0.0;
    double aside = a[0];
    double bside = a[1];
    double cside = a[2];
    temp = a[0] + a[1] + a[2];
    temp = temp / 2;
    area = Math.sqrt (temp * (temp - aside) * (temp - bside) * (temp - cside) );
    return area;
  }
}
