package com.lambda.classes;

import com.lambda.interfaces.Adder;
import com.lambda.interfaces.Joiner;

public class AdderMapperUtil_Copy {
    public void test(Adder adder){
        double x=100,y=200;
        double add = adder.add(x, y);
        System.out.println("X ="+x+", Y ="+y+", Add ="+add);
    }
    public void test(Joiner joiner){
        String x="Dear",y="Java";
        String join = joiner.join(x, y);
        System.out.println("X ="+x+", Y ="+y+", Join ="+join);
    }
}
