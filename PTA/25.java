import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    TreeMap h = new TreeMap();
		while (sc.hasNext() )
			h.put (sc.next(), sc.next() );
		//h.put("name","001");
		Set<Map.Entry<String,String>> entrySet=h.entrySet();
		for (Map.Entry<String,String> entry : entrySet) {
			System.out.print(entry.getKey()+"---");
			System.out.println(entry.getValue());
		}
  }
}
