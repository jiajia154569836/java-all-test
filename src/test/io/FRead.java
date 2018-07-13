package io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FRead {
    public static void main(String args[]) throws IOException
    {
        char c;
        // 使用 System.in 创建 BufferedReader
        FileReader br = new FileReader(new File("E:/a.txt"));
        System.out.println("输入字符, 按下 'd' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'd');
    }
}