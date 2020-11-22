import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine();
    String[] arr = str.split (",");
    int num = sc.nextInt();
    try {
      System.out.println (arr[num]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println ("下标越界！");
    }
  }
}
