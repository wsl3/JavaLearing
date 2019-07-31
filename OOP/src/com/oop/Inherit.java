package com.oop;

//继承


import java.security.PublicKey;

public class Inherit {
}


class Student{
    private String name;
    protected String sex;
    public Student(String name, String sex){
        this.name = name;
        this.sex = sex;
    }
}

class PrimaryStudent extends Student{
    public double grade;
    public PrimaryStudent(String name, String sex, double g){
        super(name, sex);
        this.grade = g;
    }

    public void getMsg(){
        System.out.println("private字段子类不可访问，protected可访问:"+this.sex+"\t"+this.grade);
    }
}