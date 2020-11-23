import java.io.*;
import java.net.*;
import java.util.Scanner;
public class UPDClient {
  public static void main (String args[]) {
    Scanner scan = new Scanner (System.in);
    try {
      BufferedReader inFromUser = new BufferedReader (new InputStreamReader (System.in) );
      DatagramSocket socket = new DatagramSocket();
      InetAddress IPAddress = InetAddress.getByName ("127.0.0.1"); //ip��ַ
      byte[] sendData;
      byte[] receiveData = new byte[1024];
      System.out.print ("����Ҫ���͵��ַ�����");
      String sentence = inFromUser.readLine();//�������ľ���
      sendData = sentence.getBytes(); //ת��Ϊbyte����
      DatagramPacket sendPacket = new DatagramPacket (sendData, sendData.length, IPAddress, 9876); //���Ͱ�
      socket.send (sendPacket);
      DatagramPacket receivePacket = new DatagramPacket (receiveData, receiveData.length); //���հ�
      socket.receive (receivePacket);
      String modifiedSentence = new String (receivePacket.getData(), 0, receivePacket.getLength() ); //�ѽ��յ�������ת��Ϊ�ַ���
      System.out.println ("�������˷��ص���Ϣ��" + modifiedSentence);
    } catch (Exception e) {
      System.out.println (e);
    }
  }
}
