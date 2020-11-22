import java.util.*;
public class Main2 {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    double a, b;
    try {
      System.out.print ("请输入被除数：");
      a = sc.nextDouble();
      System.out.print ("请输入除数：");
      b = sc.nextDouble();
      System.out.print ( (a / b) );
    } catch (ArithmeticException e) {
      System.out.println ("除数为0异常!");
    } catch (InputMismatchException e) {
      System.out.println ("数字格式异常!");
    } catch (Exception e) {
      System.out.println ("通用型异常!");
    }
  }
}
