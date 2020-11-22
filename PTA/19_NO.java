import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    String a = "小鸟", b = "小狗";
    String s;
    while (sc.hasNext() ) {
			s=sc.next();
		String ss[] = s.split("小");
      System.out.println ("一只动物正在叫");
      System.out.println ("小" + ss[1] + "正在" + ss[1] + "叫");
    }
  }
}
