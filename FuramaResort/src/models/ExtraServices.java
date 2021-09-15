package models;

public class ExtraServices {
    private String extraServicesName;

    public ExtraServices(String extraServicesName) {
        this.extraServicesName = extraServicesName;
    }

    public String getExtraServicesName() {
        return extraServicesName;
    }

    public void setExtraServicesName(String extraServicesName) {
        this.extraServicesName = extraServicesName;
    }

    @Override
    public String toString() {
        return "ExtraServices{" +
                "extraServicesName='" + extraServicesName + '\'' +
                '}';
    }
}
