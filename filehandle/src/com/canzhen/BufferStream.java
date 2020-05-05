package com.canzhen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferStream {
    public static void main(String[] args) throws Exception {
        try {
//            文件缓冲写入
            OutputStream outputStream = new FileOutputStream("E:\\Download\\bufferstream.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            String str = "福建傲斯蒂芬斯柯达积分拿到搜你姐夫。。。";
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            outputStream.close();
            InputStream inputStream = new FileInputStream("E:\\Download\\bufferstream.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] b = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(b)) > 0){
                System.out.println(new String(b,0,len));
            }
            bufferedInputStream.close();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
