import java.util.*;
public class Main {
  public static void main (String[] args) {
    //输入
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine();
    int max = sc.nextInt();
    if (str.length() < 1)
      System.out.println (0);
    //计数
    HashMap<Byte, Integer> map = new HashMap<Byte, Integer>();
    byte[] bytes = str.getBytes();
    for (int i = 0; i < bytes.length; i++) {
      if (map.containsKey (bytes[i]) )
        map.put (bytes[i], map.get (bytes[i]) + 1);
      else
        map.put (bytes[i], 1);
    }
    //System.out.println(map);
    int size = map.size();
    int[] score = new int[size];
    int i = 0;
    Set<Byte> bytesKey = map.keySet();
    for (Byte aByte : bytesKey) {
      score[i] = map.get (aByte);
      i++;
    }
    //重拍
    if (max != 0) {
      Arrays.sort (score);
      //System.out.println(Arrays.toString(score));
      //剔除
      while (max > 0) {
        int scoreSize = score.length - 1;
        int last = score[scoreSize];
        for (i = scoreSize; i >= 0; i++) {
          if (scoreSize >= 0 && score[scoreSize] == last && max > 0) {
            score[scoreSize]--;
            scoreSize--;
            max--;
          } else
            break;
        }
      }
    }
    //重算
    int sum = 0;
    for (int scoreOnce : score)
      sum = sum + (scoreOnce * scoreOnce);
    System.out.println (sum);
  }
  //
  ////import java.util.*;
//public class Main {
  //public static void main (String[] args) {
  ////输入
  //Scanner sc = new Scanner (System.in);
  //String str = sc.nextLine();
  //int max = sc.nextInt();
  //if (str.length() < 1)
  //System.out.println (0);
  ////计数
  //HashMap<Byte, Integer> map = new HashMap<Byte, Integer>();
  //byte[] bytes = str.getBytes();
  //for (int i = 0; i < bytes.length; i++) {
  //if (map.containsKey (bytes[i]) )
  //map.put (bytes[i], map.get (bytes[i]) + 1);
  //else
  //map.put (bytes[i], 1);
  //}
  ////System.out.println(map);
  //int size = map.size();
  //int[] score = new int[size];
  //int i = 0;
  //Set<Byte> bytesKey = map.keySet();
  //for (Byte aByte : bytesKey) {
  //score[i] = map.get (aByte);
  //i++;
  //}
  ////重拍
  //if (max != 0) {
  //Arrays.sort (score);
  ////System.out.println(Arrays.toString(score));
  ////剔除
  //while (max > 0) {
  //int scoreSize = score.length - 1;
  //int last = score[scoreSize];
  //for (i = scoreSize; i >= 0; i++) {
  //if (scoreSize >= 0 && score[scoreSize] == last && max > 0) {
  //score[scoreSize]--;
  //scoreSize--;
  //max--;
  //} else
  //break;
  //}
  //}
  //}
  ////重算
  //int sum = 0;
  //for (int scoreOnce : score)
  //sum = sum + (scoreOnce * scoreOnce);
  //System.out.println (sum);
  //}
//}
}
