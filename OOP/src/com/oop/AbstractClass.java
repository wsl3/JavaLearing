package com.oop;

//抽象类: 对子类提供规范

public abstract class AbstractClass {

    public abstract String getMsg();
}

class AbstractSonClass extends AbstractClass{
    @Override
    public String getMsg(){
        return "msg";
    }
}


