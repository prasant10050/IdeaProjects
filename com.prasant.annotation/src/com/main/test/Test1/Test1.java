package com.main.test.Test1;

import com.module.annotation.DefaultTest1;

import java.lang.reflect.Method;

public class Test1 {
    @DefaultTest1(name="Prashant",age=20,address="Asansol",salary = 12000.00)
    public void getDetails(){

        try {
            Class<? extends Test1> test1=this.getClass();
            Method method=test1.getMethod("getDetails",new Class[]{String.class});
            DefaultTest1 defaultTest1 = method.getAnnotation(DefaultTest1.class);
            System.out.println("Name=" + defaultTest1.name() + ",Age=" + defaultTest1.age() + ",Salary" + defaultTest1.salary());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (SecurityException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Test1 test1=new Test1();
        test1.getDetails();

    }

}
