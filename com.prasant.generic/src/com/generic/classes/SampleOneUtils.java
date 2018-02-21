package com.generic.classes;

public class SampleOneUtils {
    public void printDetails(SampleOne<?> sampleOne){
        System.out.println(sampleOne);
        Object ref = sampleOne.getRef();
        String classname=null;
        if(ref!=null){
            classname=ref.getClass().getName();
        }
        System.out.println("Class name :"+classname);
        System.out.println("Ref name :"+ref);
    }

    //Upper Bound
    public static double sum(SampleOne<? extends Number> n1,SampleOne<? extends Number> n2){
        Number num1=n1.getRef();
        Number num2=n2.getRef();
        double sum=num1.doubleValue()+num2.doubleValue();
        return sum;
    }

    public static long add(SampleOne<?> n1,SampleOne<?> n2){
        Object num1=n1.getRef();
        Object num2=n2.getRef();
        long sum=Long.parseLong(num1.toString())+Long.parseLong(num2.toString());
        return sum;
    }

    public static <T> void copyUtil(SampleOne<T> src,SampleOne<T> dest){
        System.out.println("Value of Source & Destination -> "+src.getRef()+" , "+dest.getRef());
        T source=src.getRef();
        dest.setRef(source);
        System.out.println("After copy, Value of Source & Destination -> "+dest.getRef()+" , "+dest.getRef());
    }

    //Lower Bound
    public static <T> void copy(SampleOne<T> src,SampleOne<? super T> dest){
        T source=src.getRef();
        dest.setRef(source);
        System.out.println("Copy into Destination ->"+dest.getRef());
    }
}
