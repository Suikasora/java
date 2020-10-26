import java.util.Scanner;
import java.text.DecimalFormat;

abstract class shape {// 抽象类
  /* 抽象方法 求面积 */
  public abstract double getArea( );

  /* 抽象方法 求周长 */
  public abstract double getPerimeter( );
}
class Rectangle extends shape {
  private double x;
  private double y;

  Rectangle (double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double getArea() {
    return x * y;
  }
  public double getPerimeter() {
    return 2 * (x + y);
  }
}
public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    DecimalFormat d = new DecimalFormat ("#.##");
    double xx = input.nextDouble( );
    double yy = input.nextDouble( );
    shape c = new  Rectangle (xx, yy);
    System.out.println (d.format (c.getArea() ) );
    System.out.println (d.format (c.getPerimeter() ) );
    input.close();
  }
}
