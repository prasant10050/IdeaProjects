package com.module.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultTest1 {
    String name();
    int age() default 18;
    double salary() default 10000.00;
    String[] address() default {"New Delhi","Kolkata"};
}
