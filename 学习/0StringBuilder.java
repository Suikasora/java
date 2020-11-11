import java.lang.*;
public class StringBuilder{
	public static void main(String[] args){
		StringBuilder builder = new StringBuilder();
		String str = "art";
		builder.append(str);

		String completedString = builder.toString();
		System.out.println(completedString);
	}
}
