package com.person.personal.classes;

import com.address.primary.classess.PrimaryAddress;
import com.address.secondary.classes.SecondaryAddress;

public class PersonInfo {
    enum GENDER{
        MALE,FEMALE;
    }
    String firstName;
    String lastName;
    int age;
    PrimaryAddress primaryAddress;
    SecondaryAddress seconadryAddress;

    public PersonInfo() {
        primaryAddress=new PrimaryAddress();
        seconadryAddress=new SecondaryAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonInfo(PrimaryAddress primaryAddress, SecondaryAddress seconadryAddress) {
        this.primaryAddress = primaryAddress;
        this.seconadryAddress = seconadryAddress;
    }

    public PrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }

    public SecondaryAddress getSeconadryAddress() {
        return seconadryAddress;
    }

    public void setPrimaryAddress(PrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public void setSeconadryAddress(SecondaryAddress seconadryAddress) {
        this.seconadryAddress = seconadryAddress;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", primaryAddress=" + primaryAddress +
                ", seconadryAddress=" + seconadryAddress +
                '}';
    }
}
