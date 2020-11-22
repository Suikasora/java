import java.io.*;

public class FileCopy {
  public static void main (String[] args) {
    String InFile;
    String OutFile;
    InFile = args[0];
    OutFile = args[1];
    try {
      //创建对象
      BufferedReader In = new BufferedReader (new FileReader (InFile) );
      BufferedWriter Out = new BufferedWriter (new FileWriter (OutFile) );
      String line;
      //按行循环读取文件，写入新文件中并打印在屏幕上
      while ( (line = In.readLine() ) != null) {
        Out.write (line);
        Out.write ("\n");
        System.out.println (line);
      }
      Out.flush(); //清理缓存
      In.close();  //关闭输入流
      Out.close(); //关闭输出流
    } catch (IOException e) {
      System.out.println ("发生IO异常!");
      e.printStackTrace();
    }
  }
}
