package com.lambda.classes;

import java.util.function.Predicate;

public class PredicateFunction {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanThen=x->x>=10;
        Predicate<Integer> divisbleByThree=x->x%3==0;
        Predicate<Integer> divisbleByFive=x->x%5==0;
        Predicate<Integer> isEqualToTen = Predicate.isEqual(10);

        Predicate<Integer> lesserThanOrEqualToTen=greaterThanThen.negate();
        Predicate<Integer> divisbleByFiveAndThree = divisbleByFive.and(divisbleByThree);
        Predicate<Integer> divisbleByFiveOrThree = divisbleByThree.or(divisbleByFive);

        int num=10;
        System.out.println(greaterThanThen.test(num));
        System.out.println(divisbleByFive.test(num));
        System.out.println(divisbleByThree.test(num));
        System.out.println(isEqualToTen.test(num));
        System.out.println(lesserThanOrEqualToTen.test(num));
        System.out.println(divisbleByFiveAndThree.test(num));
        System.out.println(divisbleByFiveOrThree.test(num));
    }
}
