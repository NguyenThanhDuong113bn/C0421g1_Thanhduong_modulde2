package _7_Abstract_class_va_interface.bai_tap.Risizeable;

import java.util.Random;

public class Square extends Rectangle {
    public Square (){

    }
    public Square( double side){
        super( side, side);
    }
    public Square( double side,  String color, boolean filled){
        super( side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLenght(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLenght(double lenght) {
        setSide(lenght);
    }

    @Override
    public void resize(double percent) {
        System.out.println(" Trước khi tăng kích thước của Square : "+ percent);
        Random random =new Random();
        int x =1 + random.nextInt(100);
        percent += x;
        System.out.println(" Sau khi tăng kích thước của Square :"+ percent);
    }
}
