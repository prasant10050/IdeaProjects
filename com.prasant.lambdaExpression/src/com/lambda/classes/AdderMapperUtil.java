package com.lambda.classes;

import com.lambda.interfaces.Adder;
import com.lambda.interfaces.Joiner;

public class AdderMapperUtil {
    public void testAddeer(Adder adder){
        double x=20;
        double y=40;
        double add = adder.add(x, y);
        System.out.println("Sum ="+add);
    }
    public void testJoiner(Joiner joiner){
        String x="My",y="Journey!!";
        String join = joiner.join(x, y);
        System.out.println("Join ="+join);
    }
}
