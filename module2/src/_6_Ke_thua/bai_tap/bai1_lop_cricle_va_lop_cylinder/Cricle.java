package _6_Ke_thua.bai_tap.bai1_lop_cricle_va_lop_cylinder;

public class Cricle {
    private double radius = 1.0;
    private String color = " green";

    public Cricle(){

    }
    public Cricle(double radius, String color){
        this.radius = radius;
        this.color=color;
    }

    public Cricle(int i) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius * this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return " A Cricle with radius ="+getRadius()+"and color of "+ getColor();
    }
}
