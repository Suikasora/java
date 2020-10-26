import java.util.*;
/*public class Exception {*/
//public static void main(String[] args) {
//int i = 12 / 0;
//System.out.println("out:" + i);
//}
/*}*/
public class Exception {
  public static void main(String[] args) {

    //String str = null;
    ////String str = "hello";

    //try {
    //if (str.equals("hello"))
    //System.out.println("hello java");
    //} catch(NullPointerException e) {
    //System.out.println("hello NullPointerException!");
    //}

    //嵌套try
    try {
      try {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());
        double result = num1 / num2;
        System.out.println("result = " + result);
      } catch(NumberFormatException e) {
        System.out.println("数字格式转换异常");
      }
    } catch(ArithmeticException e) {
      System.out.println("0做除数无意义");
    }
    finally{
      System.out.println("END@");
    }
  }
	private void withdraw(int amount) throws BalanceNotEnoughException {
		if (balance < amount) {
			throw new BalanceNotEnoughException();
		}
		balance -= balance;
	}
	class BalanceNotEnoughException extends Exception{
		public BalanceNotEnoughException(String message){
			super(message);
		}
		public BalanceNotEnoughException(){
			this("余额不足");
		}
	}
}

