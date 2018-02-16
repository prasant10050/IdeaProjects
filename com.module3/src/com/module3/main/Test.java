package com.module3.main;

import com.address.primary.classess.PrimaryAddress;
import com.address.secondary.classes.SecondaryAddress;
import com.person.personal.classes.PersonInfo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String firstName,lastName;
        int age=0;
        int pinCode=0;
        String houseNo;
        String street;
        String cross;
        String city;
        String state;

        System.out.println("Enter first name");
        firstName=scan.nextLine();
        System.out.println("Enter last name");
        lastName=scan.nextLine();
        System.out.println("Enter age");
        age=scan.nextInt();scan.nextLine();
        System.out.println("Enter house number");
        houseNo=scan.nextLine();
        System.out.println("Enter cross");
        cross=scan.nextLine();
        System.out.println("Enter street");
        street=scan.nextLine();
        System.out.println("Enter city");
        city=scan.nextLine();
        System.out.println("Enter state");
        state=scan.nextLine();
        System.out.println("Enter pin code");
        pinCode=scan.nextInt();scan.nextLine();

        PersonInfo personInfo=new PersonInfo();
        PrimaryAddress primaryAddress=personInfo.getPrimaryAddress();
        //SecondaryAddress secondaryAddress=personInfo.getSeconadryAddress();

        personInfo.setFirstName(firstName);
        personInfo.setLastName(lastName);
        personInfo.setAge(age);
        primaryAddress.setHouseNo(houseNo);
        primaryAddress.setCross(cross);
        primaryAddress.setStreet(street);
        primaryAddress.setCity(city);
        primaryAddress.setState(state);
        primaryAddress.setPincode(pinCode);
        personInfo.setPrimaryAddress(primaryAddress);

        System.out.println("Name ->"+personInfo.getFirstName()+" "+personInfo.getLastName());
        System.out.println("Age ->"+personInfo.getAge());
        System.out.println("Primary Address ->"+personInfo.getPrimaryAddress());
    }
}
