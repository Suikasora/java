package T91;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
  public static void main (String[] args) {
    try {
      Socket socket = new Socket ("127.0.0.1", 8080);
      BufferedReader in = new BufferedReader (new InputStreamReader (System.in) );
      PrintWriter out = new PrintWriter (socket.getOutputStream() );
//            BufferedReader serverin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      System.out.println ("客户端:");
      System.out.println ("请输入三条边:");
      String readline = "";
      for (int i = 0; i < 3; i++) {
        out.flush();
        readline = in.readLine();
        out.println (readline);
      }
//           System.out.println("三角形面积为:"+serverin.readLine());
      out.close();
//           serverin.close();
      socket.close();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
