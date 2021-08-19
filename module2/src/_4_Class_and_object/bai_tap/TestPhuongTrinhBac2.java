package _4_Class_and_object.bai_tap;

import java.util.Scanner;

public class TestPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap so a cua phuong trinh bac 2 :");
        double a = scanner.nextDouble();
        System.out.print(" Nhap so b cua phuong trinh bac 2:");
        double b = scanner.nextDouble();
        System.out.print(" Nhap so c cua phuong trinh bac 2:");
        double c = scanner.nextDouble();
        PhuongTrinhBac2 TestPhuongTrinhBac2 = new PhuongTrinhBac2(a, b,c);
        TestPhuongTrinhBac2.GiaiPhuongTrinh();
    }
}
