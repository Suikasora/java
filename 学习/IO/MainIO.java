import java.io.*;
import java.util.*;
public class MainIO {
  public static void main (String[] args) {
    FileReader reader = null;
    FileWriter writer = null;
    try {
      reader = new FileReader (args[0]);
      writer = new FileWriter (args[1]);
      int a;
      while ( (a = reader.read() ) != -1)
        writer.write (a);
    } catch (Exception e) {
      e.printStackTrace();
    }
    finally{
      try {
        reader.close();
        writer.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
