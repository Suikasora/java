import java.util.Scanner;
import java.text.DecimalFormat;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n;
		n = Integer.valueOf(s.next());
		float ans=0;
		float a = 2,b = 1;
		for (int i = 0; i < n; i++) {
			ans = ans + a/b;
			float t = a;
			a += b;
			b = t;
		}
		System.out.println(new DecimalFormat("0.000000").format(ans));
 /*   String ansStr = String.format("%.6f",ans);*/
		/*System.out.println(ansStr);*/

	}
}

