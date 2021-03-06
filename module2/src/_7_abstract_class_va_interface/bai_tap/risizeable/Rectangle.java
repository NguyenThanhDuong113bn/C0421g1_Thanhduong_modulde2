package _7_abstract_class_va_interface.bai_tap.risizeable;

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
        this.setWidth(this.getWidth() * Math.sqrt(1 + percent / 100));
        this.setLenght((this.getWidth() * Math.sqrt(1 + percent / 100)) * this.getLenght() / this.getWidth());


    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,3);
        rectangle.resize(10);
        System.out.println(rectangle);
    }
}

