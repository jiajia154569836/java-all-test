package socket.socket3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		//--- ������-----
		ServerSocket server = new ServerSocket(5678);
		// ����Ա socket
		Socket socket = server.accept();
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		Scanner in = new Scanner(is);// ��
		PrintWriter out = new PrintWriter(os, true);// д
		
		System.out.println("------------������-------");
		//��д
		String sr, sw;
		Scanner input = new Scanner(System.in);
		out.println("���ӷ������ɹ���");//////////
		while(true){
			sr = in.nextLine();//���ͻ���
			System.out.println("�ͻ��ˣ�"+sr);
			System.out.print("--������--��");
			sw = input.next();
			out.println(sw);//д��ͻ���
			if(sw.equals("end")){
				break;
			}
		}
		socket.close();
	}

}
