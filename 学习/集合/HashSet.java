import java.util.*;
public class HashSet {
  public static void main (String[] args) {
    HashSet<String> hashSet = new HashSet<String>();
    hashSet.add ("first");
    System.out.println (hashSet);
    for (String str : hashSet)
      System.out.println (str);
  }
}
