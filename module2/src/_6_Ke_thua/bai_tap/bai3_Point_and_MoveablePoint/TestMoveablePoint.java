package _6_Ke_thua.bai_tap.bai3_Point_and_MoveablePoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint.toString());
        moveablePoint.setSpeed(3, 4);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
