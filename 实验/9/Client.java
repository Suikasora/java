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
		System.out.println("�����A��");
		Triangle[0]=scan.nextInt();
		System.out.println("�����B��");
		Triangle[1]=scan.nextInt();
		System.out.println("�����C��");
		Triangle[2]=scan.nextInt();
		try 
		{
			socket=new Socket("127.0.0.1",8080);//����˿�
			input=new DataInputStream(socket.getInputStream());//��������
			output=new DataOutputStream(socket.getOutputStream());//��������
			for(int i=0; i<3; i++) 
			{
				output.writeInt(Triangle[i]);
				Thread.sleep(1000);
			}
			double result=input.readDouble();//��ȡ��Ϣ
			System.out.println("�����������"+result);
		}
		catch(Exception e) 
		{
			System.out.println("����ʧ�ܣ�");
		}
}
}
