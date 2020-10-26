import java.util.*;
public class Main{
	public static void main(String[] args){
		String name0,name1;
		Scanner sc = new Scanner(System.in);
		name0="小明";
		name1=sc.next();
		if (!name0.equals(name1)) {
			System.out.println("小明改名为："+name1);
		}
		else{
			System.out.println("改名失败");
		}
	}
}
