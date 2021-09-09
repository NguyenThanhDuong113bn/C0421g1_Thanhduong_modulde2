package _17_binary_file_va_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("D:\\C0421g1_Thanhduong_modulde2\\module2\\src\\_17_binary_file_va_serialization\\bai_tap\\copy_file_nhi_phan\\source.txt");
            outputStream = new FileOutputStream("D:\\C0421g1_Thanhduong_modulde2\\module2\\src\\_17_binary_file_va_serialization\\bai_tap\\copy_file_nhi_phan\\destination.txt");

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }

    }
}
