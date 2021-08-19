package _4_Class_and_object.bai_tap;

public class StopWatch {
    long startTime;
    long stopTime;

    public long Start(){
        this.startTime = System.currentTimeMillis();
        return this.startTime;

    }
    public long Stop(){
        this.stopTime = System.currentTimeMillis();
        return this.stopTime;
    }

    public long getStartTime() {
        return this.stopTime - this.startTime;
    }
}
