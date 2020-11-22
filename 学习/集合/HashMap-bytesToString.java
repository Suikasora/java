import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine();
    HashMap<Byte, Integer> map = new HashMap<Byte, Integer>();
    byte[] bytes = str.getBytes();
    for (int i = 0; i < bytes.length; i++ ) {
      if (map.containsKey (bytes[i]) )
        map.put (bytes[i], map.get (bytes[i]) + 1);
      else
        map.put (bytes[i], 1);
    }
		for (byte i : map.keySet()) {
			String tempStr = new String(new byte[] {i});
			System.out.println(tempStr+"="+map.get(i));
		}
  }
}
