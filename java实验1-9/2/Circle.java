import java.util.Scanner;
public class Circle{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int i,j,k,m,n;
		n = Integer.valueOf(s.next());
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = i+1;
		}
		i = 0;k = 0;m = 0;
		while( m < n-1 ){
			if ( a[i] != 0 ) {
				k++;
			}
			if ( k == 3 ) {
				a[i] = 0;
				k = 0;
				m ++;
			}
			i++;
			if (i == n) {
				i = 0;
			}
		}
		i = 0;
		while( a[i] == 0 ){
			i++;
		}
		System.out.println(a[i]);
	}
}
