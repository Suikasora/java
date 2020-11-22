import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    double a, b;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (b == 0)
      System.out.println ("除数不能为0！");
    else
      System.out.println ( (a / b) );
  }
}

