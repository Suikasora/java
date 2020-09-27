import java.util.Scanner;
public class gcd{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a,b,ans;
		System.out.println("请输入两个数：");
		a = Integer.valueOf(s.next());
		b = Integer.valueOf(s.next());
		if (a > b)
			ans = gcd(a,b);
		else
			ans = gcd(b,a);
		System.out.println("最大公约数：" + ans);
		System.out.println("最小公倍数：" + a*b/ans);
	}
	public static int gcd(int a,int b){
		return (a%b != 0)?gcd(b,a%b):b;
	}
}

