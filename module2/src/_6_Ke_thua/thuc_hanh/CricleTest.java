package _6_Ke_thua.thuc_hanh;

public class CricleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle= new Circle(4.5," blue ", false);
        System.out.println(circle);
    }
}
