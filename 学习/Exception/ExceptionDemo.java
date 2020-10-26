public class ExceptionDemo {
  public static void main(String[] args) {
    fun(0);
    fun(1);
    fun(2);
    fun(3);
  }
  static void fun(int i ) {
    System.out.println("调用：fun(" + i + ")");
    try {
      if (i == 0)
        System.out.println("no ex");
      if (i == 1) {
        int a = 0;
        int b = 10;
        b /= a;
      }
      if (i == 2) {
        int m[] = new int[5];
        m[5] = 10;
      }
      if (i == 3) {
        String str = "56u";
        int n = Integer.parseInt(str);
      }
    } catch(ArithmeticException e) {
      System.out.println("ex1" + e);
    } catch(Exception e) {
      System.out.println("ex3" + e);
    }
    finally{
      System.out.println("ok");
    }
  }
}
