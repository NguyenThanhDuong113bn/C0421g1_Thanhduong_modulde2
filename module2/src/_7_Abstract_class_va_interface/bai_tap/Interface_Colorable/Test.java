package _7_Abstract_class_va_interface.bai_tap.Interface_Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(6.5, 7.0);
        shapes[1] = new Rectangle(9.5, 5.0);
        shapes[2] = new Square(5.5);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(shape);
                square.howToColor();
            } else {
                System.out.println(shape);
            }

        }

    }
}
