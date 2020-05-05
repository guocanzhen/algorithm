package com.canzhen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileHandle {
    public static void main(String[] args) throws Exception {
        try {
//            文件写入
            OutputStream out = new FileOutputStream("E:\\Download\\filehandle.txt");
            String content = "file output and input ....";
            out.write(content.getBytes());
            out.close();
//            文件获取
            InputStream in = new FileInputStream("E:\\Download\\filehandle.txt");
            byte[] b = new byte[1024];
            int len ;
            while ((len = in.read(b)) > 0){
                System.out.println(new String(b,0,len));
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
