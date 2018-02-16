package com.address.secondary.classes;

public class SecondaryAddress implements Cloneable {
    String HouseNo;
    String Street;
    String Cross;
    String City;
    String State;
    int pincode;

    public SecondaryAddress() {
    }

    public SecondaryAddress(String houseNo, String street, String cross, String city, String state, int pincode) {
        HouseNo = houseNo;
        Street = street;
        Cross = cross;
        City = city;
        State = state;
        this.pincode = pincode;
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SecondaryAddress{" +
                "HouseNo='" + HouseNo + '\'' +
                ", Street='" + Street + '\'' +
                ", Cross='" + Cross + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
