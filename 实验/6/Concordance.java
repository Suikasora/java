import java.util.*;
public class Concordance {
  @SuppressWarnings ("rawtypes")
  public Map<Character, List> m = new HashMap<Character, List>();
  public Concordance (String s) { //遍历
    for (int i = 0; i < s.length(); i++)
      addEntry (s.charAt (i), i);
  }
  void addEntry (char c, int pos) {
    Character key = new Character (c);
    @SuppressWarnings ("unchecked")
    List<Integer> l = (List<Integer>) m.get (key);
    if (l == null) {
      l = new ArrayList<Integer>();
      m.put (key, l);
    }
    l.add (new Integer (pos) );
  }
  public static void main (String args[]) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < args.length; i++)
      sb.append (args[i]);
    Concordance  con = new Concordance (sb.toString() );
    System.out.println (con.m);
  }
}
