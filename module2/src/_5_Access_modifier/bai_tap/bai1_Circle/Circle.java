package _5_Access_modifier.bai_tap.bai1_Circle;

public class Circle {
    private double radius ;
    private String color ;

   public Circle (){
       radius = 1.0;
       color = "red";

    }

     Circle(double radius, String blue, boolean b) {
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
