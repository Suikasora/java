import java.util.*;
public class string{
	public static void main(String[] args){
		String str1 = "abcde";
		String str2 = str1.substring(0,3);
		System.out.println(str2);
		str1 = str2.substring(0,1) + "end";
		System.out.println(str1);
		if( "hello".equalsIgnoreCase("HELLO") )
			System.out.println("equal");
		Scanner in = new Scanner(System.in);

		System.out.printf("%tc",new Date());
	}
}
