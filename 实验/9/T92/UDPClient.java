package T92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        try {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));  //数据报输入
        DatagramSocket socket = new DatagramSocket();   //建立数据报套接字
        InetAddress IP = InetAddress.getByName("127.0.0.1");
        byte[] send;
        byte[] receive = new byte[1024];
        System.out.println("请输入向服务端发送的字符串");
        String str = buf.readLine();        //从数据包提取返回的数据
        send = str.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(send,send.length,IP,4470);
        socket.send(sendPacket);
        DatagramPacket receivePacket = new DatagramPacket(receive,receive.length);
        socket.receive(receivePacket);
        String s = new String(receivePacket.getData(),0,receivePacket.getLength());
        System.out.println("服务器返回的信息:"+s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
