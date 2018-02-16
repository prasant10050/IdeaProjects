package com.address.primary.classess;

public class PrimaryAddress {
    String HouseNo;
    String Street;
    String Cross;
    String City;
    String State;
    int pincode;

    public PrimaryAddress(String houseNo, String street, String cross, String city, String state, int pincode) {
        HouseNo = houseNo;
        Street = street;
        Cross = cross;
        City = city;
        State = state;
        this.pincode = pincode;
    }

    public PrimaryAddress() {
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(String houseNo) {
        HouseNo = houseNo;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCross() {
        return Cross;
    }

    public void setCross(String cross) {
        Cross = cross;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "PrimaryAddress{" +
                "HouseNo='" + HouseNo + '\'' +
                ", Street='" + Street + '\'' +
                ", Cross='" + Cross + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
