package _7_Abstract_class_va_interface.bai_tap.Risizeable;

import java.util.Random;

public class Rectangle extends Shape implements Risizeable{
    private  double width = 1.0;
    private  double lenght = 1.0;

    public Rectangle(){

    }
    public Rectangle( double width , double lenght){
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle( double width, double lenght, String color , boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return  width* this.lenght;
    }
    public double getPerimeter(){
        return 2 * ( width + this.lenght);
    }

    @Override
    public String toString() {
        return " A Retangle with width =" + getWidth()+ " and lenght ="+ getLenght() +", " +
                "Which is a subclass of" + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println(" Trước khi kích tước của Retangle :"+ percent);
        Random random = new Random();
        int x =1 + random.nextInt(100);
        percent += x;
        System.out.println(" Sau khi kích thước của Retangle ;" + percent);
    }
}
