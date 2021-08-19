package _4_Class_and_object.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String disPlay(){
        return "Rectangle  has width: "+this.width+ " and height: "+this.height;
    }
    public static class  Test{
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = scanner.nextDouble();
            System.out.print("Enter the height:");
            double height = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(width, height);


            System.out.println(rectangle.disPlay());
            System.out.println("Area is: "+rectangle.getArea());
            System.out.println("Perimeter is: "+rectangle.getPerimeter());

        }
    }



}
