package _6_Ke_thua.bai_tap.bai1_lop_cricle_va_lop_cylinder;

public class Cylinder extends Cricle {
    private double height=1.0;
    public Cylinder(){

    }
    public Cylinder (double height){
        this.height=height;
    }
    public Cylinder(double height, double radius,String color){
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return super.toString()+" has height="+ getHeight()+" and volume="+getVolume();
    }
}
