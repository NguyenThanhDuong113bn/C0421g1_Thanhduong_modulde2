package _5_Access_modifier.thuc_hanh.bai1_StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Students.change (); //goi phuong thuc thay doi
        // tao object
        Students s1 = new Students(111, " Hoang");
        Students s2 = new Students(222, " Khanh ");
        Students s3 = new Students(333, " Nam");
        // goi Method hien thi
        s1.display();
        s2.display();
        s3.display();
    }
}
