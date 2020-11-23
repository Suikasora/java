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
			serversocket = new ServerSocket(8080);//�˿ڽ���
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		try 
		{
			System.out.println("�ȴ��ͻ�������");
			Socket socket=serversocket.accept();//�ȴ��ͻ�����������
			DataInputStream input = new DataInputStream(socket.getInputStream());//��������
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());//��������
			for(int i=0; i<3; i++) 
			{
				Triangle[i]=input.readInt();//������յ�����
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
			System.out.println("������������");
		}finally
		{
			return ans;
		}
	}
}


