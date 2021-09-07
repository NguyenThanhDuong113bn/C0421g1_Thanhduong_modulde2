package _15_xu_ly_ngoai_le_va_amp_debug.bai_tap.su_dung_lop_Illegal_triangle_exception;

public class Triangle {
    double a;
    double  b;
    double c;

    public Triangle(double a, double b, double c) throws  IllegalTriangleException{
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException(" Ngoại lệ !!Các cạnh tam giác không thể âm:");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Ngoại lệ!!! Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        }
        public Triangle(){

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
