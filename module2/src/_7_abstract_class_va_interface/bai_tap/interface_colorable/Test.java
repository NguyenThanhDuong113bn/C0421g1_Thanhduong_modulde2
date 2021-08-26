package _7_abstract_class_va_interface.bai_tap.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10,20);
        shapes[2]= new Square(30);

        for (Shape shape: shapes){


            if( shape instanceof Circle){
                System.out.println(((Circle)shape).getArea());
            }else if(shape instanceof Rectangle){
                System.out.println(((Rectangle)shape).getArea());
            }else if (shape instanceof Colorable){
                ((Colorable)shape).howToColor();
            }

        }



    }
}
