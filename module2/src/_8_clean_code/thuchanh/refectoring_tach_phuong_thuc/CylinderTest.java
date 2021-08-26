package _8_clean_code.thuchanh.refectoring_tach_phuong_thuc;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter height: ");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println(Cylinder.getVolume(radius, height));
    }
}
