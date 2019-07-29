package com.Reflect;

//java反射


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws ClassNotFoundException {
	    // write your code here
        Foo foo1 = new Foo();

        //所有的类都是java.lang.Class的实例对象
        //获取该实例对象
        Class c1 = Foo.class;

        Class c2 = foo1.getClass();

        Class c3 = null;
        try {
            c3 = Class.forName("com.Reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Foo foo2 = (Foo)c3.newInstance();
            foo2.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);

        System.out.println("****************");
        Method[] ms = c1.getDeclaredMethods();
        Field[] fs = c1.getDeclaredFields();

        System.out.println("Foo类的属性");
        for(Field f: fs){
            Class fm = f.getType();
            System.out.println("属性名:\t"+f.getName()+"\t类型:"+fm.getName()+"\t声明:\t"+f);
        }

        System.out.println("Foo类的方法:");
        for(Method m: ms){
            Class rm = m.getReturnType(); // 返回值类型
            System.out.println("方法名:\t"+m.getName()+"\t返回值类型:"+rm.getName()+"\t声明:\t"+m);
        }

        System.out.println("方法执行:");
        try {
            ms[0].invoke(foo1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Foo{

    private String name = "wwsl";

    void print(){
        System.out.println("Foo().print()");

    }
}
