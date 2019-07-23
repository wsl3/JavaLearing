package com.annotate;

public class XiaoMing implements Persion {

    @Override
    public String name() {
        return "小明";
    }

    @Override
    @SuppressWarnings("deprecation")
    public void sing() {
        System.out.println("我是小明, 我会唱歌!\t测试@Override注解");
    }
}
