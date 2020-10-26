import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    String[] a = new String[100];
    a[0] = sc.next();
    int i;
    for (i = 1; i <= 3; i++)
      a[i] = sc.next();
    System.out.print ("课程 《" + a[0] + "》的指定教材为：");
    for (i = 1; i <= 2; i++)
      System.out.print (a[i] + ",");
    System.out.print (a[i]);
  }
}
