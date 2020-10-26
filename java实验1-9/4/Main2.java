public class Main2 {
  public static void main (String[] args) {
    Student []stu = new Student[10];
    stu[0] = new Undergaduate ("王", "101", 80);
    stu[1] = new Undergaduate ("刘", "101", 50);
    stu[2] = new Undergaduate ("若", "101", 30);
    stu[3] = new Undergaduate ("法", "102", 75);
    stu[4] = new Undergaduate ("阿", "102", 55);
    stu[5] = new Postgraduate ("柔", "501", 95);
    stu[6] = new Postgraduate ("区", "503", 49);
    stu[7] = new Postgraduate ("身", "502", 85);
    stu[8] = new Postgraduate ("谁", "503", 75);
    stu[9] = new Postgraduate ("先", "505", 65);
    System.out.println ("类型  姓名  班级  成绩");
		for(Student i:stu)
			i.print();
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
    System.out.print ("本科生");
    System.out.print ("  " + name);
    System.out.print ("  " + sClass);
    System.out.print ("  ");
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
    System.out.print ("研究生");
    System.out.print ("  " + name);
    System.out.print ("  " + sClass);
    System.out.print ("  ");
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
