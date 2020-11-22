import java.io.*;
public class Main1 {

  public static void main (String[] args) {
    FileReader reader = null;
    FileWriter writer = null;
    try {
      //创建文件输入输出流
      reader = new FileReader (args[0]);
      writer = new FileWriter (args[1]);
      int flag = 0;
      //从输入流读取内容使用输出流输出
      while ( (flag = reader.read() ) != -1)
        writer.write (flag);
      System.out.println ("文本复制成功!");
    } catch (IOException e) {
      e.printStackTrace();
    }
    finally {
      if (reader != null) {
        try {
          reader.close(); //关闭文件输入
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (writer != null) {
        try {
          writer.close(); //关闭文件输入
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
