package _7_Abstract_class_va_interface.bai_tap.Risizeable;

import java.util.Random;

public class Cricle extends Shape implements Risizeable{
    private double radius = 1.0;

    public Cricle(){

    }
    public Cricle(double radius){
        this.radius=radius;
    }

    public Cricle(double radius, String color, boolean filled ){
        super( color , filled);
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius* Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return " A Cricle with radius =" + getRadius()+", Which is a subclass of"+super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Trước khi tăng kích thước của Circle: "+percent);
        Random rnd = new Random();
        int x = 1 + rnd.nextInt(100);
        percent += x;
        System.out.println("Sau khi tăng kích thước của Cirle: "+percent);

    }
}
