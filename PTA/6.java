import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int[][] a = new int[][] {{100, 2, 3,}, {4, 5, 6}, {17, 8, 9}};
    int i = 0;
    int j = 0;
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++)
        a[i][j] = sc.nextInt();
    }
    matrSum (a);
  }
  private static void matrSum (int[][] a) {
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < a[i].length; j++) {
        if (i == j) sum1 += a[i][j];
        if (j == a.length - i - 1) sum2 += a[i][j];
      }
		System.out.println("输入的3 * 3 矩阵是:");
		for (int i=0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("对角线之和是："+sum1);
		

  }
}
