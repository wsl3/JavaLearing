package com.annotate;


import java.lang.annotation.*;

@Documented
@Inherited  //子类可以继承
@Target({ElementType.TYPE}) //注解对象
@Retention(RetentionPolicy.RUNTIME) //注解存在时间
public @interface DescriptionAnnocation {

    String Desc() default "这是函数描述的注解";
    String Author() default "wsl";
}
