import java.io.*;
import java.net.*;
import java.util.Scanner;
public class UPDClient {
  public static void main (String args[]) {
    Scanner scan = new Scanner (System.in);
    try {
      BufferedReader inFromUser = new BufferedReader (new InputStreamReader (System.in) );
      DatagramSocket socket = new DatagramSocket();
      InetAddress IPAddress = InetAddress.getByName ("127.0.0.1"); //ip地址
      byte[] sendData;
      byte[] receiveData = new byte[1024];
      System.out.print ("输入要发送的字符串：");
      String sentence = inFromUser.readLine();//存放输入的句子
      sendData = sentence.getBytes(); //转换为byte类型
      DatagramPacket sendPacket = new DatagramPacket (sendData, sendData.length, IPAddress, 9876); //发送包
      socket.send (sendPacket);
      DatagramPacket receivePacket = new DatagramPacket (receiveData, receiveData.length); //接收包
      socket.receive (receivePacket);
      String modifiedSentence = new String (receivePacket.getData(), 0, receivePacket.getLength() ); //把接收到的数据转换为字符串
      System.out.println ("服务器端返回的信息：" + modifiedSentence);
    } catch (Exception e) {
      System.out.println (e);
    }
  }
}
