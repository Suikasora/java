import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    double a = sc.nextInt();
    if (a < 0)
      System.out.println ("输入的数不能为负！");
    else
      System.out.println (Math.sqrt (a) );
  }
}
