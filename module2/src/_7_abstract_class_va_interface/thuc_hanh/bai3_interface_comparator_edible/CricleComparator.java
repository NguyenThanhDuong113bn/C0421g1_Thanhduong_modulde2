package _7_abstract_class_va_interface.thuc_hanh.bai3_interface_comparator_edible;

import _6_Ke_thua.bai_tap.bai1_lop_cricle_va_lop_cylinder.Cricle;

import java.util.Comparator;

public class CricleComparator implements Comparator<Cricle> {
    @Override
    public int compare(Cricle o1, Cricle o2) {
        if(o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
