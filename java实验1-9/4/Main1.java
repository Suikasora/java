public class Main1 {
  public static void main (String[] args) {
    Student s = new Student(2,"ming","男",2008,8,8,750,"舞蹈","舞蹈特修班");
    Teacher t = new Teacher(1,"tea","女",1999,9,9,"人事部","实习生",2000);
		s.check();
		System.out.println();
		t.check();
  }
}
class Person {
  private int num;
  private String name;
  private String sex;
  private int birthYear, birthMonth, birthDay;
  public void setNum (int num) {
    this.num = num;
  }
  public void setName (String name) {
    this.name = name;
  }
  public void setSex (String sex) {
    this.sex = sex;
  }
  public void setbirth (int y, int m, int d) {
    this.birthYear = y;
    this.birthMonth = m;
    this.birthDay = d;
  }
  public int getNum() {
    return num;
  }
  public String getSex() {
    return sex;
  }
  public String getName() {
    return name;
  }
  public int getBirthYear() {
    return birthYear;
  }
  public int  getBirthMonth() {
    return birthMonth;
  }
  public int  getbirthDay() {
    return birthDay;
  }
  public void check() {
    System.out.println ("编号：" + num);
    System.out.println ("姓名：" + name);
    System.out.println ("性别：" + sex);
    System.out.println ("出生日期：" + birthYear + "年" + birthMonth + "月" + birthDay + "日");
  }
  public Person (int num,
                 String name,
                 String sex,
                 int birthYear,
                 int birthMonth,
                 int birthDay) {
    this.num = num;
    this.name = name;
    this.sex = sex;
    this.birthYear = birthYear;
    this.birthMonth = birthMonth;
    this.birthDay = birthDay;
  }
}
class Teacher extends Person {
  private String department, title;
  private int salary;
  public String getDepartment() {
    return department;
  }
  public String getTitle() {
    return title;
  }
  public int getSalary() {
    return salary;
  }
  public void setDepartment (String department) {
    this.department = department;
  }
  public void setTitle (String title) {
    this.title = title;
  }
  public void setSalary (int salary) {
    this.salary = salary;
  }
  public void check() {
    System.out.println ("编号：" + getNum() );
    System.out.println ("姓名：" + getName() );
    System.out.println ("性别：" + getSex() );
    System.out.println ("出生日期：" + getBirthYear() + "年" + getBirthMonth() + "月" + getbirthDay() + "日");
    System.out.println ("部门：" + department);
    System.out.println ("职称：" + title);
    System.out.println ("薪资：" + salary);
  }
  public Teacher (int num,
                  String name,
                  String sex,
                  int birthYear,
                  int birthMonth,
                  int birthDay,
                  String department,
                  String title,
                  int salary) {
    super (num, name, sex, birthYear, birthMonth, birthDay);
    this.department = department;
    this.title = title;
    this.salary = salary;
  }
}
class Student extends Person {
  private String field, sClass;
  private int score;
  public void setScore (int score) {
    this.score = score;
  }
  public void setField (String field) {
    this.field = field;
  }
  public void setSClass (String sClass) {
    this.sClass = sClass;
  }
  public int getScore() {
    return score;
  }
  public String getField() {
    return field;
  }
  public String getSClass() {
    return sClass;
  }
  public void check() {
    System.out.println ("编号：" + getNum() );
    System.out.println ("姓名：" + getName() );
    System.out.println ("性别：" + getSex() );
    System.out.println ("出生日期：" + getBirthYear() + "年" + getBirthMonth() + "月" + getbirthDay() + "日");
    System.out.println ("高考分数：" + score);
    System.out.println ("专业：" + field);
    System.out.println ("班级：" + sClass);
  }
  public Student (int num,
                  String name,
                  String sex,
                  int birthYear,
                  int birthMonth,
                  int birthDay,
                  int score,
                  String field,
                  String sClass) {
    super (num, name, sex, birthYear, birthMonth, birthDay);
    this.score = score;
    this.field = field;
    this.sClass = sClass;
  }
}
