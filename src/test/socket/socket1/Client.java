package socket.socket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//�ͻ���                                             ��������IP���˿�
		Socket socket = new Socket(InetAddress.getLocalHost(),5678);
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		Scanner in = new Scanner(is);//��
		PrintWriter out = new PrintWriter(os,true);//д
		
		//������������Ϣ
		String sr,sw;
		while(true){
			sr = in.nextLine();
			System.out.println("������˵��"+sr);
			if(sr.equals("end")){
				break;//������
			}
		}
		//д
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.print("�ͻ���˵��");
			sw = input.next();//��ÿ���̨����
			out.println(sw);//д��������
			if(sw.equals("end")){
				break;
			}
		}
		in.close();
		out.close();
		socket.close();//�ͻ��˹ر�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
