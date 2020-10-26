import java.util.Arrays;
public class Main {
  public static void main (String[] args) {
    Person teacher = new Teacher ("Jason", 28, "男", 10000, "外国语学院");
    Student stu[] = new Student[5];
    for (int i = 0; i < 5; i++)
      stu[i] = new Student();
    stu[0].setName ("张三");
    stu[0].setAge (18);
    stu[0].setGender ("男");
    stu[0].setScore (new int[] {120, 130, 144, 110, 125});
    stu[0].setGrade ("软工2018级");
    stu[1].setName ("李四");
    stu[1].setAge (19);
    stu[1].setGender ("男");
    stu[1].setScore (new int[] {112, 123, 122, 144, 125});
    stu[1].setGrade ("软工2018级");
    System.out.println (teacher.toString() );
    for (int i = 0; i < 5; i++)
      System.out.println (stu[i].toString() );
  }
}
class Person {
  private String name;// 姓名
  private int age;// 年龄
  private String gender;// 性别
  public Person (String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  void setName (String name) {
    this.name = name;
  }
  void setAge (int age) {
    this.age = age;
  }
  void setGender (String gender) {
    this.gender = gender;
  }
  public String toString() {
    return "name=" + name + ", age=" + age + ", gender=" + gender + ", ";
  }
}
class Teacher extends Person {
  private float salary;// 薪酬
  private String department;// 部门
  public Teacher (String name, int age, String gender, float salary, String department) {
    super (name, age, gender);
    this.salary = salary;
    this.department = department;
  }
  public String toString() {
    return "Teacher: " + super.toString() + "salary=" + salary + ", department=" + department ;
  }
}
class Student extends Person {
  private int[] score;// 成绩
  private String grade;// 年级
  public Student (String name, int age, String gender) {
    super (name, age, gender);
  }
  void setName (String name) {
    super.setName (name);
  }
  void setAge (int age) {
    super.setAge (age);
  }
  void setGender (String gender) {
    super.setGender (gender);
  }

  void setScore (int [] a) {
    this.score = a;
  }
  void setGrade (String grade) {
    this.grade = grade;
  }
  public String toString() {
    return "Student: " + super.toString() + "score=" + Arrays.toString (score) + ", grade=" + grade;
  }
}
