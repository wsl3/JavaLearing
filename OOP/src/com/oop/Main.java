package com.oop;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Group g = new Group();
        System.out.println("可变参数测试:");
        g.setNames("name1","name2");
        System.out.println(g.getNames());

        g.setNames("name1");
        System.out.println(g.getNames());

        System.out.println("继承测试:");
        Student s = new PrimaryStudent("wsl", "man", 100);
        System.out.println(s instanceof Student && s instanceof PrimaryStudent);
        ((PrimaryStudent) s).getMsg();


        Father son = new Son();
        System.out.println(son.getName());
        System.out.println(son.name);
        System.out.println(((Son) son).name);
    }
}
