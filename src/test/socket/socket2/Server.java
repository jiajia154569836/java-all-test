package socket.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
class ServerThread implements Runnable{
	Socket socket;
	ServerThread(Socket socket){
		this.socket = socket;
	}
	public void run(){
		//����
		try {
			InputStream is  = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			Scanner in = new Scanner(is);
			PrintWriter out = new PrintWriter(os,true);
			//д
			out.println("���ӿͻ��˳ɹ���");
			out.println("end");//����
			//��
			String sr;
			while(true){
				sr = in.nextLine();
				System.out.println("�ͻ���˵��"+sr);
				if(sr.equals("end")){
					break;
				}
			}
			in.close();
			out.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Server {
	public static void main(String[] args) throws IOException {
		//������
		ServerSocket server = new ServerSocket(5678);
		while(true){
			//����Ա  socket 
			Socket socket = server.accept();
			ServerThread st =new ServerThread(socket);
			Thread t = new Thread(st);
			t.start();
		}
		
		
	}

}
