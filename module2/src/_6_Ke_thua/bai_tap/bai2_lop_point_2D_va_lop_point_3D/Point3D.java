package _6_Ke_thua.bai_tap.bai2_lop_point_2D_va_lop_point_3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D (){

    }
    public Point3D(float x, float y , float z){
        super(x, y);
        this.z= z;

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x , y);
        this.z = z;

    }
    public float [] getXYZ(){
        float[] array =new float[3];
        array[0]= getX();
        array[1]=getY();
        array[2]=getZ();
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY()) + ", speed = "  + Arrays.toString(getXYZ());
    }


   }



