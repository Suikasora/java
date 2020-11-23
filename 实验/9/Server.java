import java.io.*;
import java.net.*;
public class Server 
{
	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		int[] Triangle=new int[3];
		ServerSocket serversocket=null;
		try 
		{
			serversocket = new ServerSocket(8080);//端口接入
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		try 
		{
			System.out.println("等待客户端连接");
			Socket socket=serversocket.accept();//等待客户端请求连接
			DataInputStream input = new DataInputStream(socket.getInputStream());//接收数据
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());//发送数据
			for(int i=0; i<3; i++) 
			{
				Triangle[i]=input.readInt();//传入接收的数据
				Thread.sleep(1000);
			}
			output.writeDouble(Result(Triangle));
			output.flush();
			socket.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
        }
}

	public static double Result(int []A) 
	{
		double ans=0;
		double p=(A[0]+A[1]+A[2])/2;
		try 
		{
			ans=Math.sqrt(p*(p-A[0])*(p-A[1])*(p-A[2]));
		}
		catch(Exception e) 
		{
			System.out.println("输入数据有误！");
		}finally
		{
			return ans;
		}
	}
}


