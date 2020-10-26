import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		int i,a[];  //变量的声明
	    a=new int[10]; //声明数组长度
	    Scanner s=new Scanner(System.in);
	    for(i=0;i<=9;i++)  //for循环，实现输入10个数字 
	    {
		    a[i]=s.nextInt();   		
	    }
	    for(i=0;i<=8;i++)  //9次for循环对每个数字执行以下语句
	    {
	        for(int j=0;j<=8-i;j++)  //for循环从第一个数字开始，将相邻数字进行如下操作，与相邻数字比较，调换或不调换
		    {
		    	
		       int temp;  //声明变量
		       if(a[j]>a[j+1])   //if语句判断，如果满足条件，执行以下语句，将相邻的两个数字调换
		       {
		   	     temp=a[j];  //将a[j]的值赋给temp
		   	     a[j]=a[j+1];  //将a[j+1]的值赋给a[j]
		     	 a[j+1]=temp;  //将temp的值赋给a[j+1]
		       }	
		    }
	    }
	    for(i=0;i<9;i++)  //for循环，依次输出结果
	    {
		    System.out.print(a[i]+" ");  //输出结果
	    }
			System.out.print(a[9]);
	}
}
