package com.DynamicLoadClass;

//动态加载类
//静态加载类的时候，如果该类有问题，整个程序就会报错


public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args){


        if(args.length == 0){
            return;
        }

        //创建类类型
        Class c = null;
        try {
            c = Class.forName("com.DynamicLoadClass."+args[0]);
            //创建该类的实例对象
            OfficePro ofp = (OfficePro)c.newInstance();
            ofp.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

