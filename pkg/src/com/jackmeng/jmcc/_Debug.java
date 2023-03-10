package com.jackmeng.jmcc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented @Target({ ElementType.CONSTRUCTOR,
    ElementType.METHOD }) @Retention(RetentionPolicy.CLASS) public @interface _Debug {
  String message() default "";
}
