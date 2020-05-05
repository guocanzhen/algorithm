package com.canzhen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferHandle {
    public static void main(String[] args) throws IOException {
        try {
//            文件缓冲写入
            FileWriter fileWriter = new FileWriter("E:\\Download\\bufferHandle.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String str = "几覅搜到女方家阿德Sooi覅就发达四哦。。";
            bufferedWriter.write(str,0,str.length());
//            换行
            bufferedWriter.newLine();
            str = "1111111111111...";
            bufferedWriter.write(str,0,str.length());
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
//            文件缓冲读取
            FileReader fileReader = new FileReader("E:\\Download\\bufferHandle.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            str = bufferedReader.readLine();
            System.out.println(str);
            char[] c = new char[1024];
            int len;
            while ((len = bufferedReader.read(c)) > 0){
                System.out.println(new String(c,0,len));
            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
