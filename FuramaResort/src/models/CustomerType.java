package models;
//Diamond, Platinium, Gold, Silver, Member
public class CustomerType {
    private String customerType;
    private String diamond ;
    private String platinum;
    private String gold;
    private String silver;
    private String member;

    public CustomerType(String customerType, String diamond, String platinum, String gold, String silver, String member) {
        this.customerType = customerType;
        this.diamond = diamond;
        this.platinum = platinum;
        this.gold = gold;
        this.silver = silver;
        this.member = member;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getDiamond() {
        return diamond;
    }

    public void setDiamond(String diamond) {
        this.diamond = diamond;
    }

    public String getPlatinum() {
        return platinum;
    }

    public void setPlatinum(String platinum) {
        this.platinum = platinum;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }
}
