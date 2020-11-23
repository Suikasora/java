import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client 
{
	public static void main(String args[]) 
{
		int[] Triangle=new int[3];
		Scanner scan=new Scanner(System.in);
		Socket socket=null;
		DataInputStream input=null;
		DataOutputStream output=null;
		System.out.println("输入边A：");
		Triangle[0]=scan.nextInt();
		System.out.println("输入边B：");
		Triangle[1]=scan.nextInt();
		System.out.println("输入边C：");
		Triangle[2]=scan.nextInt();
		try 
		{
			socket=new Socket("127.0.0.1",8080);//接入端口
			input=new DataInputStream(socket.getInputStream());//接收数据
			output=new DataOutputStream(socket.getOutputStream());//发送数据
			for(int i=0; i<3; i++) 
			{
				output.writeInt(Triangle[i]);
				Thread.sleep(1000);
			}
			double result=input.readDouble();//读取信息
			System.out.println("三角形面积："+result);
		}
		catch(Exception e) 
		{
			System.out.println("连接失败！");
		}
}
}
