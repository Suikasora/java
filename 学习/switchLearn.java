import java.util.*;
public class switchLearn{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice){
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			default:
				System.out.println("exit");
				break;
		}
	}
}
