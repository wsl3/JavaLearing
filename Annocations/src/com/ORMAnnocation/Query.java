package com.ORMAnnocation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Query {

    //根据过滤Filter对象, 获取相应的sql
    public String query(Object f){

        Class c = f.getClass();
        //判断filter对象是否是一个Table注解
        boolean isTableAnnc = c.isAnnotationPresent(Table.class);
        if(!isTableAnnc){
            return "该对象无Table注解!";
        }

        //获取Table注解对应的数据库表名
        Table tableName = (Table) c.getAnnotation(Table.class);
        StringBuffer sb = new StringBuffer();
        sb.append("select * from ").append(tableName.value()).append(" where 1=1");

        //查询
        Field[] fields = c.getDeclaredFields();
        for(Field field: fields){
            //判断属性是否是Column注解
            boolean isColumnAnnc = field.isAnnotationPresent(Column.class);

            if(!isColumnAnnc){
                continue;
            }

            //获取Column注解值
            Column columnName = (Column)field.getAnnotation(Column.class);
            String column = columnName.value();

            //使用反射调用对应的get方法
            String fieldName = field.getName();
            String getMethod = "get" +column.substring(0,1).toUpperCase() + column.substring(1).toLowerCase();

            Object res = null;
            try{
                Method getValue = c.getMethod(getMethod);
                res = getValue.invoke(f);
            }catch (Exception e){
                e.printStackTrace();
            }

            //拼装sql
            if(res==null){
                continue;
            }

            sb.append(" and ").append(column);
            if(res instanceof Integer || res instanceof Float || res instanceof Double){
                sb.append("=").append(res);
            }
            if(res instanceof String){
                if(((String) res).contains(",")){
                    String[] values = ((String) res).split(",");
                    sb.append(" in(");
                    for(String value:values){
                        sb.append("'").append(value.strip()).append("',");
                    }
                    sb.setCharAt(sb.length()-1, ')');
                }else{
                    sb.append("='").append(res).append("'");
                }
            }
        }
        return sb.toString();

    }
}
