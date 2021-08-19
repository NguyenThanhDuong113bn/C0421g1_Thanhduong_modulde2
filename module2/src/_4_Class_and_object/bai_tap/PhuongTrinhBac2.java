package _4_Class_and_object.bai_tap;

public class PhuongTrinhBac2 {
    public double a;
    public double b;
    public double c;
    public PhuongTrinhBac2(){

    }

    public PhuongTrinhBac2 (double a, double b, double c){
        this.a = a;
        this.b= b;
        this.c=c;
    }
    public double getA (){
        return  a;
    }
    public void setA (double a){
        this.a = a;
    }
    public double getB (){
        return  b;
    }
    public  void  setB ( double b){
        this.b = b;

    }
    public  double getC (){
        return b;
    }
    public void  setC ( double c){
        this.c = c;

    }
    public double denTa(){
        double denTa = b*b -4*a*c;
        return denTa ;
    }
    public double nghiem1 (){
        double x1 = ( -b + Math.sqrt(denTa()))/ (2*a);
        return  x1;
    }
    public  double nghiem2 (){
        double x2 = (- b - Math.sqrt(denTa()))/ (2*a);
        return  x2;
    }
    public  double nghiemKep (){
        double x = ( -b / (2*a));
        return  x;
    }
     public  void  GiaiPhuongTrinh (){
        if (denTa() > 0){
            System.out.println("Phuong trinh co 2 nghiem x1 = "+nghiem1()+" x2 = "+ nghiem2());
        }
        else  if (denTa() == 0){
            System.out.println("Phuong trinh co nghiem kep x =" +nghiemKep());
        }
        else {
            System.out.println(" Phuong trinh vo nghiem");
        }

     }


}
