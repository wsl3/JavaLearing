package com.ORMAnnocation;

//创建 Table 注解，表明一个类对应的数据库表


import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {

    String value();
}
