package _bai16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {

        {
            try {
                FileWriter fileWriter = new FileWriter("src/_bai16_io_text_file/bai_tap/copy_file_text/source.txt");
                fileWriter.write("Hello!");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


            try {
                File file = new File("src/_bai16_io_text_file/bai_tap/copy_file_text/source.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                FileWriter fileWriter1 = new FileWriter("D:\\C0421g1_Thanhduong_modulde2\\module2\\src\\_bai16_io_text_file\\bai_tap\\copy_file_text\\target.txt");
                while ((line = bufferedReader.readLine()) != null) {
                    fileWriter1.write(line);
                }
                fileWriter1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}


