package socket.socket3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		//--- �ͻ���-----
		// �ͻ��� ��������IP���˿�
		Socket socket = new Socket(InetAddress.getLocalHost(), 5678);
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();

		Scanner in = new Scanner(is);// ��
		PrintWriter out = new PrintWriter(os, true);// д
		System.out.println("----------�ͻ���-----------");
		// ��д
		String sr, sw;
		Scanner input = new Scanner(System.in);
		while(true){
			sr = in.nextLine();//����������Ϣ
			System.out.println("������:"+sr);
			System.out.print("--�ͻ���--��");
			sw = input.next();
			out.println(sw);//д�������
			if(sw.equals("end")){
				break;
			}
		}
		socket.close();
	}

}
