package _8_clean_code.thuchanh.refectoring_tach_phuong_thuc;

public class Cylinder {
    private double baseArea;

    public static double getVolume(int radius, int height){
        double baseArea =getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    public static double getPerimeter(int radius){
        return 2*Math.PI * radius;

    }
    public static double getBaseArea(int radius){
        return Math.PI * radius * radius;
    }
}
