import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int a, b;
    try {
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.println ( (b % a) );
    } catch (InputMismatchException e1) {
      System.out.println ("请输入整型数！ ");
    } catch (NumberFormatException e2) {
      System.out.println ("请输入整型数！ ");
    } catch (ArithmeticException e3) {
      System.out.println ("除数不可为0！");
    }
    finally{
      System.out.println ("总会被执行！");
    }
  }
}

