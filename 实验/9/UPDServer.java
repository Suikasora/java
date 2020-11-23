import java.net.*;
public class UPDServer {
  public static void main (String args[]) {
    byte[] receiveData = new byte[1024];
    byte[] sendData;
    try {
      System.out.println ("�������ڵȴ��������ݰ�...");
      DatagramSocket socket = new DatagramSocket (9876);
      DatagramPacket receivePacket = new DatagramPacket (receiveData, receiveData.length);
      socket.receive (receivePacket); //���տͻ��˴���İ�
      String sentence = new String (receivePacket.getData(), 0, receivePacket.getLength() ); //ת��Ϊ�ַ���
      System.out.println ("�ͻ���˵��" + sentence);
      InetAddress IPAddress = receivePacket.getAddress();
      int port = receivePacket.getPort();//��ȡ�ͻ��˵Ķ˿�
      String capitalizedSentence = sentence.toUpperCase();//�����յ����ַ���ת��Ϊ��д
      sendData = capitalizedSentence.getBytes(); //ת��Ϊbyte��
      DatagramPacket sendPacket = new DatagramPacket (sendData, sendData.length, IPAddress, port);
      socket.send (sendPacket);
    } catch (Exception e) {
      System.out.println (e);
    }
  }
}
