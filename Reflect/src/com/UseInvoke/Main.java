package com.UseInvoke;

// Method.invoke(Obj, params)的使用
// 反射的本质


import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //使用类方法的invoke方法

        Student s = new Student();
        //获取类类型, 3种方法
        Class c1 = Student.class;
//        Class c2 = s.getClass();
//        try {
//            Class c3 = Class.forName("com.UseInvoke.Student");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //获取print方法
        try {
            Method m = c1.getMethod("print", int.class, int.class);
//          c1.getMethod("print", new Class[]{int.class, int.class});
            m.invoke(s, 10, 20);
//          m.invoke(s, new Object[]{10,20});

            Method m2 = c1.getMethod("print", String.class, String.class);
            Object res = m2.invoke(s, "Hello", "world");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("================");
        List<Integer> tes = new ArrayList<Integer>();
        tes.add(1);
        tes.add(2);
//      error  tes.add("hello");
        Class cl = tes.getClass();
        try {
            Method ml = cl.getMethod("add", Object.class);
            ml.invoke(tes, "Hello, Reflect!");
            for(Object obj: tes){
                System.out.println(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



//测试类
class Student{

    public void print(int a, int b){
        System.out.println(a+b);
    }

    public void print(String a, String b){
        System.out.println(a.toUpperCase()+", "+b.toLowerCase());
    }
}

