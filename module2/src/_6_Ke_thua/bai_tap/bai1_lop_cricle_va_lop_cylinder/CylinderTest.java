package _6_Ke_thua.bai_tap.bai1_lop_cricle_va_lop_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);

        cylinder= new Cylinder(5.5,3.3,"green");
        System.out.println(cylinder);
    }
}
