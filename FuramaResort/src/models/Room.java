package models;

public class Room extends Facility {
    private ExtraServices extraServices;

    public Room(String id, String servicesName, double areUse, double rentalCost, int numberOfPeople, String rentalType, ExtraServices extraServices) {
        super(id, servicesName, areUse, rentalCost, numberOfPeople, rentalType);
        this.extraServices = extraServices;
    }

    public ExtraServices getExtraServices() {
        return extraServices;
    }

    public void setExtraServices(ExtraServices extraServices) {
        this.extraServices = extraServices;
    }
}
