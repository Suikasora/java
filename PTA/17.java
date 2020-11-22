import java.util.*;
public class Main {
  public static void main (String[] args) {
    Student []stu = new Student[1];
    String s;
    Scanner sc = new Scanner (System.in);
    s = sc.next();
    int score = sc.nextInt();
    if (s.equals ("Undergraduate") )
      stu[0] = new Undergaduate ("", "", score);
    else
      stu[0] = new Postgraduate ("", "", score);
    stu[0].print();
  }
}
abstract class Student {
  String name;
  String sClass;
  int score;
  public void setName (String name) {
    this.name = name;
  }
  public void setsClass (String sClass) {
    this.sClass = sClass;
  }
  public void setScore (int score) {
    this.score = score;
  }
  public String getName() {
    return name;
  }
  public String getsClass() {
    return sClass;
  }
  public int getScore() {
    return score;
  }
  public void print() {}
  public Student (String name, String sClass, int score) {
    this.name = name;
    this.sClass = sClass;
    this.score = score;
  }
}
class Undergaduate extends Student {
  public void print() {
    System.out.print ("课程等级为：");
    if (score >= 80)
      System.out.println ("优秀");
    else if (score >= 70)
      System.out.println ("良好");
    else if (score >= 60)
      System.out.println ("一般");
    else if (score >= 50)
      System.out.println ("及格");
    else
      System.out.println ("不及格");
  }
  public Undergaduate (String name,  String sClass, int score) {
    super (name,  sClass, score);
  }
}
class Postgraduate extends Student {
  public void print() {
    System.out.print ("课程等级为：");
    if (score >= 90)
      System.out.println ("优秀");
    else if (score >= 80)
      System.out.println ("良好");
    else if (score >= 70)
      System.out.println ("一般");
    else if (score >= 60)
      System.out.println ("及格");
    else
      System.out.println ("不及格");
  }
  public Postgraduate (String name, String sClass, int score) {
    super (name,  sClass, score);
  }
}
