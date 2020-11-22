public class Main1 {
  public static void main (String[] args) {
    Ring ring1 = new Ring (5, 8, "red");
    System.out.println ("圆环的内半径：" + ring1.getInnerRadius() );
    System.out.println ("圆环的外半径：" + ring1.getOuterRadius() );
    System.out.println ("圆环的颜色：" + ring1.getColor() );
    System.out.println ("圆环的面积：" + ring1.getArea() );
    Ring ring2 = new Ring (5, 8, "red");
    ring2.setInnerRadius (6);
    ring2.setOuterRadius (10);
    ring2.setColor ("blue");
    System.out.println ("圆环的内半径：" + ring2.getInnerRadius() );
    System.out.println ("圆环的外半径：" + ring2.getOuterRadius() );
    System.out.println ("圆环的颜色：" + ring2.getColor() );
    System.out.println ("圆环的面积：" + ring2.getArea() );
    System.out.println ("圆环的个数：" + ring2.getNum() );
  }
}

class Ring {
  private double innerRadius;
  private double outerRadius;
  public String color;
  public static double PI = 3.1415926;
  public static int num = 0;

  public Ring (double iRadius, double oRadius, String c) {
    this.innerRadius = iRadius;
    this.outerRadius = oRadius;
    this.color = c;
    num++;
  }
  public double getInnerRadius() {
    return innerRadius;
  }
  public void setInnerRadius (double innerRadius) {
    this.innerRadius = innerRadius;
  }
  public double getOuterRadius() {
    return outerRadius;
  }
  public void setOuterRadius (double outerRadius) {
    this.outerRadius = outerRadius ;
  }
  public String getColor() {
    return color;
  }
  public void setColor (String color) {
    this.color = color;
  }
  public double getArea() {
    return PI * (getOuterRadius() * getOuterRadius() - getInnerRadius() * getInnerRadius() );
  }
  public double getInCircle() {
    return 2 * PI * getInnerRadius();
  }
  public double getOutCircle() {
    return 2 * PI * getOuterRadius();
  }
  //static
  public static void setPI (double pi) {
    PI = pi;
  }
  public static int getNum() {
    return num;
  }
}
