package com.oop;

//可变参数



public class Group {

    String[] names;


    //构造方法
    public Group(){

    }

    public void setNames(String... names){
        this.names = names;
    }

    public String getNames(){
        StringBuffer sb = new StringBuffer();
        for (String s: this.names) {
            sb.append(s).append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }
}
