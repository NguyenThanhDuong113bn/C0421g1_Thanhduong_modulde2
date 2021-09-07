package _15_xu_ly_ngoai_le_va_amp_debug.bai_tap.su_dung_lop_Illegal_triangle_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        double a; double b ; double c;
        Scanner scanner = new Scanner( System.in);
        System.out.println(" Nhập cạnh a :");
        a = scanner.nextDouble();
        System.out.println(" Nhập cạnh b :");
        b = scanner.nextDouble();
        System.out.println(" Nhập cạnh c:");
        c = scanner.nextDouble();
        try {
            Triangle triangle = new Triangle(a, b ,c);
            System.out.println(triangle);
        }catch (IllegalTriangleException e){
            System.out.println(e);
        }



    }
}
