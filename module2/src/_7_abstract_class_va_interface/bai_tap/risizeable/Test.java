package _7_abstract_class_va_interface.bai_tap.risizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(4);

        System.out.println(" Dien tich cac hinh ban dau :");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println(((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println(((Rectangle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println(((Square) shape).getArea());
            }
        }

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.random()*100);
            } else if (shape instanceof Rectangle) {
               ((Rectangle) shape).resize(Math.random()*100);
            } else if (shape instanceof Square) {
                ((Square) shape).resize(Math.random()*100);
            }

        }
        for (Shape shape : shapes){
            System.out.println(shape);
        }

    }
}




