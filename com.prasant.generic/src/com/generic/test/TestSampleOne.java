package com.generic.test;

import com.generic.classes.SampleOne;
import com.generic.classes.SampleOneUtils;

import javax.print.attribute.standard.NumberUp;

public class TestSampleOne {
    public static void main(String[] args) {
        SampleOne<String> stringSampleOne=new SampleOne<>();
        stringSampleOne.setRef("Hello World!!");
        /*System.out.println(stringSampleOne);
        System.out.println(stringSampleOne.getRef());
        */
        SampleOne<Integer> integerSampleOne=new SampleOne<>();
        integerSampleOne.setRef(new Integer(299));
        /*SampleOne<?> unKnownSampleOne=new SampleOne<Double>();
        unKnownSampleOne.setRef(new Double(33.45d)); // Error */
        SampleOneUtils sampleOneUtils=new SampleOneUtils();
        /*sampleOneUtils.printDetails(integerSampleOne);
        sampleOneUtils.printDetails(stringSampleOne);
        */

        SampleOne<?> unKnownSampleOne=new SampleOne<String>();
        /*String string=unKnownSampleOne.getRef(); //Compile Time Error
        Object ref = unKnownSampleOne.getRef();   //Ok
        unKnownSampleOne.setRef("hello");       //Compile Time Error
        unKnownSampleOne.setRef(null);            //OK
        sampleOneUtils.printDetails(null);  //RuntimeError */
        sampleOneUtils.printDetails(integerSampleOne);
        double sum = SampleOneUtils.sum(new SampleOne<Integer>(new Integer(78)), new SampleOne<Integer>(new Integer(90)));

        SampleOne<Integer> num1=new SampleOne<>();
        num1.setRef(34);
        SampleOne<Integer> num2=new SampleOne<>();
        num2.setRef(30);

        SampleOne<? extends Number> n1=num1;
        SampleOne<? extends Number> n2=num2;
        double sum1 = SampleOneUtils.sum(n1, n2);

        long add = SampleOneUtils.add(num1,num2);
        System.out.println("Sum ->"+sum1+" Add ->"+add);


        SampleOneUtils.copyUtil(num1,num2);
        SampleOneUtils.copy(stringSampleOne,new SampleOne<>());


    }
}
