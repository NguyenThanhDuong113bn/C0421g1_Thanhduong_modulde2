package _4_Class_and_object.bai_tap;

import java.util.Scanner;

public class TestPTBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap so a cua phuong trinh bac 2 :");
        double a = scanner.nextDouble();
        System.out.print(" Nhap so b cua phuong trinh bac 2:");
        double b = scanner.nextDouble();
        System.out.print(" Nhap so c cua phuong trinh bac 2:");
        double c = scanner.nextDouble();
        PTBac2 TestPhuongTrinhBac2 = new PTBac2(a, b,c);
        TestPhuongTrinhBac2.GiaiPhuongTrinh();
    }
}
