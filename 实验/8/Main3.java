import java.util.ArrayList;
import java.util.List;
public class Main3{
  public static void main (String[] args) {
    Storage s = new Storage();
    Printer printer = new Printer ("读数", s, 10);
    Counter counter = new Counter ("计数", s);
    counter.start();
    printer.start();
  }
}
class Storage {
  private List<Integer> list = null;
  private int index = 0;
  public Storage() {
    list = new ArrayList<Integer>();
  }
  public  synchronized void setNum (int num) {
    list.add (num);
  }
  public   synchronized int getNum() {
    if (index == list.size() )
      return -1;
    return list.get (index++);
  }
}
class Counter extends Thread {
  Storage s;
  public Counter() {
  }
  public Counter (String str) {
    super (str);
  }
  public  Counter (String str, Storage s) {
    super (str);
    this.s = s;
  }
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      synchronized (this) {
        int temp = i + 1;
        s.setNum (temp);
        System.out.println ("Counter写入" + temp);
        try {
          sleep (100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
class Printer extends  Thread {
  Storage s;
  private int len = 10;
  public Printer() {
  }
  public Printer (String str) {
    super (str);
  }
  public Printer (String str, Storage s, int len) {
    super (str);
    this.s = s;
    this.len = len;
  }
  public void run() {
    for (int i = 0; i < 10; i++) {
      synchronized (this) {
        System.out.println ("Printer输出:" + s.getNum() );
        try {
          sleep (100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
