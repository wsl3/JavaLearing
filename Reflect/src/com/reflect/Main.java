package com.reflect;

//java反射


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
            c3 = Class.forName("com.reflect.Foo");
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
    }
}

class Foo{

    void print(){
        System.out.println("Foo().print()");
    }
}
