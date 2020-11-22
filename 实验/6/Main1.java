import java.util.*;
public class Main1{
  public static void main (String[] args) {
    //1) 创建一个只能容纳String对象名为names的ArrayList集合
    ArrayList<String> names = new ArrayList<String>();
    //2）按顺序往集合中添加字符串对象
    names.add ("张三");
    names.add ("李四");
    names.add ("王五");
    names.add ("马六");
    names.add ("赵七");
    //3）对集合进行遍历，分别打印集合中的每个元素的位置与内容
    for (String i : names)  //for-each语句遍历集合元素
      System.out.println ("位置" + names.indexOf (i) + "处的元素为: " + i);
    //4）首先打印集合的大小，然后删除集合中的第3个元素，并显示删除元素的内容
    //   然后再打印目前集合中第3个元素的内容，并再次打印集合的大小。
    System.out.println ("集合大小:" + names.size() );              //集合大小
    System.out.println ("集合中的第三个元素为:" + names.get (2) ); //集合中的第三个元素
    names.remove (names.get (3 - 1) );                             //删除集合中的第三个元素
    System.out.println ("删除元素后集合大小:" + names.size() );    //删除元素后集合大小
    System.out.println ("集合中的第三个元素为:" + names.get (3 - 1) ); //删除元素后,集合中的第三个元素
  }
}
