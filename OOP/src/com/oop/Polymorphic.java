package com.oop;


//多态


import java.lang.reflect.Field;

public class Polymorphic {
}

class Father{
    public final String name = "Father";
    public String getName(){
        return name;
    }
}


class Son extends Father{
    public String name="Son";
    @Override
    public String getName(){
        return name;
    }
}