import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
    String s = scanner.nextLine();
    String[] split = s.split ("");

    //LinkedHashSet<String> strings = new LinkedHashSet<>();
    //for (int i = 0; i < split.length; i++)
      //strings.add (split[i]);
			
    //List<String> keyList = new ArrayList<String>(strings.values());
    //String[] strs = strings.toArray(new String[strings.size()]);
    //Arrays.sort(strs);
    //strings = new LinkedHashSet<String>();
    //Collections.addAll(strings,strs);

    //TreeSet<String> treeSet = new TreeSet<String>();
    //treeSet.addAll (strings);
		List<String> listParagraph = new ArrayList<String> ();
    for (int i = 0; i < split.length; i++)
      listParagraph.add (split[i]);
		Collections.sort(listParagraph);
    System.out.println (listParagraph);
  }
}
