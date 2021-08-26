package _7_abstract_class_va_interface.bai_tap.risizeable;

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
    public void resize(double percent) {
        this.setSide(this.getSide() * Math.sqrt(1 + percent / 100));
    }
}
