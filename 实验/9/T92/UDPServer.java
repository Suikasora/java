package T92;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args){
        byte[] revive = new byte[1024];
        byte[] send ;
        try{
            System.out.println("服务已启动，正在等待接收数据包...");
            DatagramSocket socket = new DatagramSocket(4470);   //建立数据报套接字
            DatagramPacket receivePacket = new DatagramPacket(revive,revive.length);    //建立接收数据包
            socket.receive(receivePacket);  //从receivePacket接收数据
            String str = new String(receivePacket.getData(),0,receivePacket.getLength());
            System.out.println("客户端说:"+str);
            InetAddress IP = receivePacket.getAddress();    //获取地址
            int port = receivePacket.getPort();
            String s = str.toUpperCase();   //转换为大写
            send = s.getBytes();
            DatagramPacket sendTo = new DatagramPacket(send,send.length,IP,port);
            socket.send(sendTo);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
