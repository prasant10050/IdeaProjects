package com.lambda.classes;

import java.util.function.Function;

public class DefaultAndStaticFunction {
    public static void main(String[] args) {
        //Create two function
        Function<Double,Double> squareOne=x->x*x;
        Function<Double,Double> addOne=x->x+1;

        Function<Double,Double> squareAddOne=squareOne.andThen(addOne);
        Function<Double,Double> addSquareOne=squareOne.compose(addOne);

        Function<Double,Double> identity=Function.identity();
        Double num=5d;
        System.out.println("Square and then add one ->"+squareAddOne.apply(num));
        System.out.println("Add one and then square ->"+addSquareOne.apply(num));
        System.out.println("Identity ->"+identity.apply(num));
    }
}
