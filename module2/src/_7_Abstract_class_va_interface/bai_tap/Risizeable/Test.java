package _7_Abstract_class_va_interface.bai_tap.Risizeable;

import _6_Ke_thua.thuc_hanh.Circle;

public class Test  {
    public static void main(String[] args) {
        Cricle cricle = new Cricle(3.5);
        System.out.println(" Before resize :" + cricle.getRadius());
        cricle.resize(35);
        System.out.println("After resize :" + cricle.getRadius());

        //////////

        Rectangle rectangle = new Rectangle( 4.5 , 3.5);
        System.out.println(" Before resize : \nLenght :"+ rectangle.getLenght()+ " Width:"+rectangle.getWidth() );
        rectangle.resize(40);
        System.out.println(" After resize : Lenght :" + rectangle.getLenght() + " Width:"+rectangle.getWidth() );

        ////
         Square square = new Square(5);
        System.out.println(" Before resize :" + square.getSide());
        square.resize(50);
        System.out.println(" After resize :" + square.getSide());
        //////
        /////

         Shape[] shapes = new Shape[3];
         shapes[0] = new Cricle(5);
         shapes[1] = new Rectangle(8,5);
         shapes[2] = new Square(6);
         double percent = (double) Math.round(Math.random()*100+1);
        System.out.println(" Before Resize :");

        for (Shape shape : shapes){
            System.out.println(shape);
        }
        for (Shape shape : shapes){
            if (shape instanceof Cricle){
                Cricle circle1 = (Cricle) shapes[0];
                circle1.resize(percent);
            }
            if (shape instanceof Rectangle){
                Rectangle rectangle1 =(Rectangle) shape;
                rectangle.resize(percent);
            }
            if (shape instanceof Square){
                Square square1 = (Square) shape;
                square.resize(percent);
            }
        }

        System.out.println("After resize with percent: "+percent);
        for (Shape shape : shapes){
            System.out.println(shape);
        }


    }


    }

