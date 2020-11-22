import java.io.*;
public class Main2{
  public static void main (String[] args) {
    String in1Path = args[0];
    String in2Path = args[1];
    String toPath = args[2];
    try {
      BufferedReader br1 = new BufferedReader (new FileReader (in1Path) );
      BufferedReader br2 = new BufferedReader (new FileReader (in2Path) );
      BufferedWriter out = new BufferedWriter (new FileWriter (toPath) );
      String s = null;
      while ( (s = br1.readLine() ) != null) { //写入文件一
        out.write (s);
        out.newLine();
        System.out.println ("内容:" + s);
      }
      br1.close();
      System.out.println ("写入文件一结束");
      while ( (s = br2.readLine() ) != null) { //写入文件二
        out.write (s);
        out.newLine();
        System.out.println ("内容:" + s);
      }
      br2.close();
      System.out.println ("写入文件二结束");
      out.flush();
      out.close();
    } catch (IOException e) {
      System.out.println (e.toString() );
    }
  }

}
