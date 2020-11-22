import java.util.LinkedList;
public class Main2{
  public static void main (String[] args) {
    Storage s = new Storage();
    Printer printer = new Printer ("读数", s);
    Counter counter = new Counter ("计数", s);
    counter.start();
    printer.start();
  }
}
class Storage {
  private int num;
  public Storage() {
  }
  public void Storage (int num) {
    this.num = num;
  }
  public  void setNum (int num) {
    this.num = num;
  }
  public   int getNum() {
    return this.num;
  }
}
class Counter extends Thread {
  Storage s;
  public Counter() {
  }
  public Counter (String str) {
    super (str);
  }
  public Counter (String str, Storage s) {
    super (str);
    this.s = s;
  }
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      int temp = i + 1;
      s.setNum (temp);
      System.out.println ("Counter写入" + temp);
    }
  }
}
class Printer extends  Thread {
  Storage s;
  public Printer() {}
  public  Printer (String str) {
    super (str);
  }
  public Printer (String str, Storage s) {
    super (str);
    this.s = s;
  }
  public void run() {
    for (int i = 0 ; i < 10; i++)
      System.out.println ("Printer输出:" + s.getNum() );
  }
}
