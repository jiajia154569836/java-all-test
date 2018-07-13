package io;

import java.io.*;

public class BRInput {
    public static void main(String args[]) throws IOException
    {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(new File("E:/a.txt")));
        System.out.println("输入字符, 按下 'd' 键退出。");
        // 读取字符
        do {
            //字节流中没有按行读取
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'd');
    }
}