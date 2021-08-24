package _5_Access_modifier.thuc_hanh.bai1_StaticMethod;

public class Students {
    private int rollno ;
    private String name ;
    private static String college = "BBDIT";

    //constructor khoi tao bien
    Students (int r, String n) {
        rollno =  r;
        name = n;
    }
    // dung phuong thuc static de thay doi gia tri cua bien static
    static void change (){
        college = " CODEGYMS";
    }
    // phuong thuc hien thi gia tri
    void  display (){
        System.out.println( rollno +" " + name + " "+ college);
    }
}
