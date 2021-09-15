package models;

public class Room extends Facility {
    private ExtraServices extraServices;

    public Room(String id, String servicesName, String areUse, String rentalCost, String numberOfPeople, String rentalType, ExtraServices extraServices) {
        super(id, servicesName, areUse, rentalCost, numberOfPeople, rentalType);
        this.extraServices = extraServices;
    }

    public ExtraServices getExtraServices() {
        return extraServices;
    }

    public void setExtraServices(ExtraServices extraServices) {
        this.extraServices = extraServices;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "extraServices=" + extraServices +
                '}';
    }

    @Override
    public String getNumberOfFloors() {
        return null;
    }

    @Override
    public String getStandardRoom() {
        return null;
    }
}
