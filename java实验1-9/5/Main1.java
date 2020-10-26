import java.util.*;
public class Main1 {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int a, b;
    try {
      System.out.print ("请输入被除数：");
      a = sc.nextInt();
      System.out.print ("请输入除数：");
      b = sc.nextInt();
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
