import java.net.*;
public class UPDServer {
  public static void main (String args[]) {
    byte[] receiveData = new byte[1024];
    byte[] sendData;
    try {
      System.out.println ("服务器在等待接收数据包...");
      DatagramSocket socket = new DatagramSocket (9876);
      DatagramPacket receivePacket = new DatagramPacket (receiveData, receiveData.length);
      socket.receive (receivePacket); //接收客户端传入的包
      String sentence = new String (receivePacket.getData(), 0, receivePacket.getLength() ); //转换为字符串
      System.out.println ("客户端说：" + sentence);
      InetAddress IPAddress = receivePacket.getAddress();
      int port = receivePacket.getPort();//获取客户端的端口
      String capitalizedSentence = sentence.toUpperCase();//将接收到的字符串转换为大写
      sendData = capitalizedSentence.getBytes(); //转换为byte型
      DatagramPacket sendPacket = new DatagramPacket (sendData, sendData.length, IPAddress, port);
      socket.send (sendPacket);
    } catch (Exception e) {
      System.out.println (e);
    }
  }
}
