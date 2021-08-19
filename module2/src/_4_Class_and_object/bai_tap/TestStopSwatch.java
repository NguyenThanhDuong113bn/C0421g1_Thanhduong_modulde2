package _4_Class_and_object.bai_tap;

public class TestStopSwatch {
    public static void main(String[] args) {
        StopWatch stopWatch =new StopWatch();
        stopWatch.Start();
        int a = 0 ;
        for ( int x = 0 ; x < 100000000; x++){
            for (int y = 0; y < 100000000 ; y++){
                a +=-1;
            }
        }
        System.out.println("aaaaaaa");
        stopWatch.Stop();
        System.out.println(stopWatch.getStartTime());
    }
    }

