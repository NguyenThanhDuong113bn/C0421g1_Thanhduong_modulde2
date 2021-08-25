package _6_Ke_thua.bai_tap.bai2_lop_point_2D_va_lop_point_3D;

public class Point2D {
    private float x;
    private float y ;

    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x= x ;
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float X, float Y){
        this.x = x;
        this.y= y;

    }
    public float[] getXY(){
        float [] array = new float[2];
        array[0]= getX();
        array[1]= getY();
        return array;
    }

    @Override
    public String toString() {
        return "Point2D has ("+getX()+","+getY()+")";
    }
}
