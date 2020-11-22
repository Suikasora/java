public class Main1 {
  public static void main (String[] args) {
    Thread t1 = new MyThread ("thread 1"); //创建三个线程
    Thread t2 = new MyThread ("thread 2");
    Thread t3 = new MyThread ("thread 3");
    t1.start();//调用start()方法启动这三个线程
    t2.start();
    t3.start();
  }
}
class MyThread extends Thread {
  public MyThread (String str) {
    super (str);
  }
  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println ("The thread is:" + Thread.currentThread().getName() );
      try {
        Thread.sleep ( (int) (Math.random() * 1000) );
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
