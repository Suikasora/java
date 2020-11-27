import java.util.ArrayList;
class Storage {
  ArrayList<Integer> num = new ArrayList<Integer>();
  public void setNum (int num) {
    this.num.add (num);
  }
  public int getNum (int index) {
    return num.get (index);
  }
}
class Counter extends Thread {
  Storage s = new Storage();
  int num = 0;
  public Counter() {}
  public Counter (String str, Storage s) {
    super (str);
    this.s = s;
  }
  public void run() {
    synchronized (s) {
      while (true) {
        try {
          s.notify();
          System.out.println ("Counter–¥»Î" + num);
          s.setNum (num);
          num++;
          s.wait();
          Thread.sleep (1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
class Printer extends Thread {
  Storage s = new Storage();
  int count = 0;
  public Printer() {}
  public Printer (String str, Storage s) {
    super (str);
    this.s = s;
  }
  public void run() {
    synchronized (s) {
      while (true) {
        if (count < s.num.size() ) {
          System.out.println ("Printer ‰≥ˆ" + s.getNum (count) );
          count++;
          try {
            s.notify();
            s.wait();
            Thread.sleep (1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
public class Main2 {
  public static void main (String[] args) {
    Storage s = new Storage();
    Counter coun = new Counter ("Counter", s);
    Printer prin = new Printer ("Printer", s);
    coun.start();
    prin.start();
  }
}
