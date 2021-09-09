package _bai16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("D:\\C0421g1_Thanhduong_modulde2\\module2\\src\\_bai16_io_text_file\\bai_tap\\copy_file_text\\source.txt"));
            outStream = new FileOutputStream(new File("D:\\C0421g1_Thanhduong_modulde2\\module2\\src\\_bai16_io_text_file\\bai_tap\\copy_file_text\\dest.txt"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("Sao chep thanh cong!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }

}


