package _7_abstract_class_va_interface.thuc_hanh.bai3_interface_comparator_edible;

import _6_Ke_thua.thuc_hanh.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CricleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator =  new CricleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

    }
}
