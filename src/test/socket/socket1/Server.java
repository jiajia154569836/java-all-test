package socket.socket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		//������
		ServerSocket server = new ServerSocket(5678);
		
		while(true){
			//����Ա  socket 
			Socket socket = server.accept();
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
		}
		
		
	}

}
