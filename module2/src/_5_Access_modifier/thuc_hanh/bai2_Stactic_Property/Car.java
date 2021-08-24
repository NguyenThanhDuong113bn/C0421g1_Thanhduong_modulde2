package _5_Access_modifier.thuc_hanh.bai2_Stactic_Property;

public class Car {
    private  String name ;
    private String engine;
    public static int numberOfCar ;

    public Car ( String name , String engine){
        this.name= name ;
        this.engine= engine;
        numberOfCar ++;
    }

}
