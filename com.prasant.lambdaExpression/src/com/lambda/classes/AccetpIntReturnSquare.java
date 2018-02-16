package com.lambda.classes;

import java.util.function.*;

public class AccetpIntReturnSquare {
    public static void main(String[] args) {
        Function<Integer,Integer> square1= x->x*x;
        IntFunction<Long> square2=x->(long)x*x;
        ToDoubleFunction<Integer> square3=x->x*x;
        UnaryOperator<Integer> square4=x->x*x;
        System.out.println(square4.apply(5));
    }
}
