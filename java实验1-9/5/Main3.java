import java.util.*;
public class Main3 {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    double a, b;
    try {
      System.out.print ("请输入被除数：");
      a = sc.nextDouble();
      System.out.print ("请输入除数：");
      b = sc.nextDouble();
      if (b == 0)
        throw new EX ("异常：除数不能为0！");
      else
        System.out.print ( (a / b) );
    } catch (EX e) {
      System.out.println (e.getMessage() );
    }
  }
}
class EX extends Exception {
  public EX (String message) {
    super (message);
  }
}
