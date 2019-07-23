package com.annotate;

public interface Persion {

    public String name();


    //deprecated注解表示该方法被废弃
    @Deprecated
    public void sing();
}
