import java.util.*;
import java.nio.file.Paths;
public class myfile{
	public static void main(String[] args) {
		Scanner in = new Scanner(Paths.get("myfile.txt"),"UTF-8");
		String str;
		str = in.nextLine();
		System.out.println(str);
	}
}
