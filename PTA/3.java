public class Main{
	public static void main (String[] args) {
		System.out.println ("5! = "+fact (5) );
	}
	private static long fact (int n) {
		if (n == 1)
			return 1;
		else
			return fact (n - 1) * n;
	}
}
