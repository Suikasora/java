import java.util.*;
public class Main2{
  Map map = new HashMap();
  public er(String s) {
    for(int i = 0;i<s.length();++i)
      add(s.charAt(i),i);
  }
  public void add(char c,int a) {
    Character key = new Character(c); //获取key
    List L = (List)map.get(key); //通过key找到value
    //如果List为空,将key和l的映射放到Map中
    if(L == null) {
      L=new ArrayList();
      map.put(key, L);
    }
    L.add(new Integer(a));  //把字符位置添加到List中
  }
  public static void main(String[] args) {
    StringBuffer b = new StringBuffer();
    for(int i = 0;i<args.length;++i) {
      b.append(args[i]); //将字符添加到StringBuffer中
    }
    er er = new er(b.toString());
    System.out.println(er.map); //输出结果
  }
}
