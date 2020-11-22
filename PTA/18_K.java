import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    String s = sc.next();
    int num = sc.nextInt();
		School school ;
    if (s.equals ("College") )
			school =new College(num);
    else
			school = new Ordinary(num);
    school.print();
  }
}
abstract class School {
  int num;
  public School (int num) {
    this.num = num;
  }
  public void print() {}
}
class Ordinary extends School{
  public Ordinary (int num) {
    super (num);
  }
  public void print() {
    System.out.print ("对应职位为：");
    if (num >= 8000 && num <=10000)
      System.out.println ("教授");
    else if (num >= 7000)
      System.out.println ("副教授");
    else if (num >= 6000)
      System.out.println ("讲师");
    else if (num >= 5000)
      System.out.println ("安保");
    else
      System.out.println ("其它");
  }
}
class College extends School{
  public College (int num) {
    super (num);
  }
  public void print() {
    System.out.print ("对应职位为：");
    if (num >= 9000)
      System.out.println ("教授");
    else if (num >= 8000)
      System.out.println ("副教授");
    else if (num >= 7000)
      System.out.println ("讲师");
    else if (num >= 6000)
      System.out.println ("安保");
    else
      System.out.println ("其它");
  }
}
