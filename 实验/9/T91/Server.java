package T91;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
  public static void main (String[] args) throws IOException {
    Server testserver = new Server();
    ServerSocket server = null;
    try {
      server = new ServerSocket (8080);   //建立服务端套接字
    } catch (Exception ee) {
      ee.printStackTrace();
    }

    try {
      System.out.println ("服务已启动...等待客户端输入数据");
      Socket start =  server.accept();
      String line = "";
      double a[] = new double[3];
      BufferedReader in = new BufferedReader (new InputStreamReader (start.getInputStream() ) );
//            DataOutputStream out = new DataOutputStream(start.getOutputStream());
      System.out.println ("从客户端接收三角形的三边...");
      for (int i = 0; i < a.length; i++) {
        line = in.readLine();
        a[i] = Double.parseDouble (line);
      }
      double temp;
      temp = testserver.Result (a);
      System.out.println ("三角形面积是" + temp);
//           out.writeBytes(String.valueOf(temp)+'\n');
//           System.out.println("已返回结果");
      in.close(); //关闭读取流
//            out.close();
      start.close();
      server.close();
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
  public double Result (double a[]) {
    double area = 0;
    double temp = 0;
    double a1 = 0;
    double a2 = 0;
    double a3 = 0;
    a1 = a[0];
    a2 = a[1];
    a3 = a[2];
    temp = (a1 + a2 + a3) / 2;
    area = Math.sqrt (temp * (temp - a1) * (temp - a2) * (temp - a3) );
    return area;
  }
}
