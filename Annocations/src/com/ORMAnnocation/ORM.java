/*
    创建一个简单的ORM，调用查询的时候可以打印出sql语句
    用到注解和反射
*/
package com.ORMAnnocation;

import java.lang.reflect.Field;

public class ORM {


    public static void main(String[] args){
        System.out.println("Hello, ORM!");

        Query q = new Query();

        FilterUser f = new FilterUser();
        f.setId(10);
        f.setName("wsl");
        f.setEmail("123@qq.com, werk@qq.com");
        System.out.println(q.query(f));

        FilterBook f1 = new FilterBook();
        f1.setAuthor("小明");
        f1.setTitle("java学习");
        f1.setPrice(1024);
        System.out.println(q.query(f1));
    }
}
