package _15_xu_ly_ngoai_le_va_amp_debug.bai_tap.su_dung_lop_Illegal_triangle_exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String e){
        super(e);
    }
    public IllegalTriangleException(){
        super("Canh nho hon 0:");
    }
}
