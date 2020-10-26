import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    int a[] = new int[100];
    int i = 0, j;
    do {
      a[i] = s.nextInt();
      i++;
    } while (a[i - 1] != -1);
    System.out.println ("你输入的数组为：");
    for ( j = 0; j < i - 1 - 1; j++)
      System.out.print (a[j] + "   ");
    System.out.println (a[j]);
    System.out.println ("数组逆序输出为：");
    for ( j = i - 2; j >= 0 + 1; j = j - 1)
      System.out.print (a[j] + "   ");
    System.out.print (a[j]);
  }
}
