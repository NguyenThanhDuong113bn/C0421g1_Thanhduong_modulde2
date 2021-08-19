package _4_Class_and_object.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = 1;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public int getFAST() {
        return FAST;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getSLOW() {
        return SLOW;
    }

    public String getSpeed() {
        String speedStr = "";
        if (this.speed == getSLOW()){
            speedStr = "SLOW";
        }else if (this.speed == getMEDIUM()){
            speedStr = "MEDIUM";
        }
        else if (this.speed == getFAST()){
            speedStr = "FAST";
        }
        return speedStr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getOn(){
        String status = "";
        if (on){
            status = "Turning ON";
        }else {
            status = "Turning OFF";
        }
        return status;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String Fan1() {
        String fan1 = "Speed: " + getSpeed() +". Radius: " + getRadius() + ". Color: " + getColor() + ". Status: " + getOn();
        return fan1;
    }

}
