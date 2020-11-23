import java.util.*;
class Storage {
	ArrayList<Integer> number=new ArrayList<Integer>();
	public void setNum(int num) {
		this.number.add(num);
	}
	public int getNum(int index) {
		return number.get(index);
	}
}
class Counter extends Thread{
	Storage s=new Storage();
	int num=0;
	public Counter(String str,Storage s) {
		super(str);
		this.s=s;
	}
	public void run() 
	{
		while(true) {
			try
			{
				System.out.println("Counter–¥»Î"+num);
				s.setNum(num);
				num++;
				Thread.sleep(1000);
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
class Printer extends Thread{
	Storage s=new Storage();
	int count=0;
	public Printer(String str,Storage s) 
	{
		super(str);
		this.s=s;
	}
	public void run() {
		while(true) 
		{
			if(count<s.number.size())
			{
				System.out.println("Printer ‰≥ˆ"+s.getNum(count));
				count++;
				try 
				{
					Thread.sleep(1000);
				}catch(Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
public class threadTwo 
{
	public static void main(String[] args) 
	{
		Storage se=new Storage();
		Counter count=new Counter("Counter",se);
		Printer print=new Printer("Printer",se);
		count.start();
		print.start();
	}
}
