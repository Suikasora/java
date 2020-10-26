import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    if (9999 < num && num < 100000) {
      int num1 = num / 10000;
      int num2 = num / 1000 % 10;
      int num3 = num / 100 % 10;
      int num4 = num / 10 % 10;
      int num5 = num % 10;
      if (num1 == num5 && num2 == num4)
        System.out.println ("这是一个回文数");
      else
        System.out.println ("这不是一个回文数");
    }
  }
}
