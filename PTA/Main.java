import javax.swing.JOptionPane;
import java.util.*;
public class Main {

  private String reorder (String str) {
    public reorder (String str) {
      StringBuffer stringBuffer = new StringBuffer (str);
      return stringBuffer.reverse();
    }
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println (reorder (sc.nextLine() ) );
  }
}

import javax.swing.JOptionPane;
public class ReverseString {
  public static void reverseString (String str) {
    StringBuffer stringBuffer = new StringBuffer (str);
    System.out.print (stringBuffer.reverse() );
  }
  public static void main (String args[]) {
    String originalString;
    originalString = JOptionPane.showInputDialog ( "Please input a String: " );
    reverseString (originalString);
  }
}
