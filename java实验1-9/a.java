import java.util.Scanner;
public class a{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = Integer.valueOf(s.next());
		int b = Integer.valueOf(s.next());
		int c = Integer.valueOf(s.next());
		System.out.println((a+b+c)/3);
		Scanner.close();
	}
}
