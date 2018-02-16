package com.lambda.test;

import com.lambda.classes.AdderMapperUtil;
import com.lambda.classes.AdderMapperUtil_Copy;
import com.lambda.interfaces.Adder;
import com.lambda.interfaces.Joiner;

public class AdderMapperTest {
    public static void main(String[] args) {
        Adder adder=(x,y)->x+y;
        Joiner joiner=(x,y)->x+y;

        double add = adder.add(30, 20);
        String hello = joiner.join("Hello", "World!!");
        System.out.println(add+" , "+hello);

        AdderMapperUtil util=new AdderMapperUtil();
        util.testAddeer((x,y)->x+y);
        util.testJoiner((x,y)->x+y);

        util.testJoiner((x,y)->{
            StringBuilder sbf=new StringBuilder(x);
            StringBuilder sbs=new StringBuilder(y);
            sbs.reverse().append(" , ").append(sbf.reverse());
            return sbs.toString();
        });

        AdderMapperUtil_Copy util_copy=new AdderMapperUtil_Copy();
        //util_copy.test((x,y)->x+y); Compile time error..Three ways solved this problem

        //Method 1->type of parameters in the lambda expression resolved the issue
        util_copy.test((double x,double y)->x+y);

        //Method 2->use a cast
        util_copy.test((Adder) (x,y)->x+y);

        //Method 3->assigned to a variable of type Adder and the variable is passed to the test() method.
        Adder adder1=(x,y)->x+y;
        util_copy.test(adder1);
    }
}
