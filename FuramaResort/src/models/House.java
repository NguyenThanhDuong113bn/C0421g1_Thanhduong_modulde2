package models;

public class House extends Facility {
    private String standardRoom;
    private int numberOfFloors;

    public House(String id, String servicesName, double areUse, double rentalCost, int numberOfPeople, String rentalType, String standardRoom, int numberOfFloors) {
        super(id, servicesName, areUse, rentalCost, numberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
