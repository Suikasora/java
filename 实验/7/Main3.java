import java.io.*;
public class Main3{
  public static void main (String[] args) {
    String txt1 = args[0];
    String txt2 = args[1];
    String s = null;
    try {
      BufferedWriter out = new BufferedWriter (new FileWriter (txt1, true) );
      BufferedReader br1 = new BufferedReader (new FileReader (txt2) );
      out.newLine();//提前换行，追加在后面
      while ( (s = br1.readLine() ) != null) { //写入文件
        out.write (s);
        out.newLine();
        System.out.println ("内容:" + s);
      }
      br1.close();
      out.flush();
      out.close();
    } catch (IOException e) {
      System.out.println (e.toString() );
    }
  }

}
