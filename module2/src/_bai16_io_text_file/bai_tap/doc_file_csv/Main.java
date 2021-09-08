package _bai16_io_text_file.bai_tap.doc_file_csv;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String Comma_Delimiter =","; // phan chia bang dau phay

    public static void main(String[] args)  {
        BufferedReader bufferedReader = null;
        try {
            String line;
           bufferedReader= new BufferedReader(new FileReader("D:\\C0421g1_Thanhduong_modulde2\\module2\\src\\_bai16_io_text_file\\bai_tap\\doc_file_csv\\countries.csv"));
            //doc tep trong java tung dong
           while ((line =bufferedReader.readLine())!= null){
                printContry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null);
                    bufferedReader.close();
                }catch (IOException crunchifyException){
                crunchifyException.printStackTrace();
            }
        }

    }

    private static List<String> parseCsvLine(String csvLine) {
        List<String> result  = new ArrayList<String>();
        if (csvLine != null){
            String[] splitData = csvLine.split(Comma_Delimiter);
            for (int i = 0; i < splitData.length; i++){
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void printContry(List<String> country) {
        System.out.println(" Country[id = "+ country.get(0) + ", code =" +country.get(1)
                            +", name =" + country.get(2) +"]");

    }
}
