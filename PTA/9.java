import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int n, s = 0;
    final int M = 3;
    n = sc.nextInt();
    for (int i = 2; i <= n; ++i)
      s = (s + M) % i;
    System.out.println ("原排在第" + (s + 1) + "位的人留下了。");
  }
}
