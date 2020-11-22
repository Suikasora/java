import java.util.*;
public class arrayList {
  public static void main (String[] args) {
    arrayList = new ArrarList<String> (4);
    System.out.println (arrayList.size() );
    arrayList.add ("first");
    arrayList.add ("second");
    arrayList.add ("third");
    arrayList.add ("forth");
    Iterator <String> iterator = arrayList.iterator();
    int i = 0;
    while (iterator.hasNext() ) {
      String str = iterator.next();
      i++;
      System.out.println (str);
      if (i % 3 == 0)
        iterator.remove();
    }
    System.out.println ("删除后的长度:" + arrayList.size() );
  }
}
