package com.annotate;


@DescriptionAnnocation(Desc="这是Main Class的注解描述!",Author = "小鸡炖蘑菇")
public class Main {


    //禁用警告：deprecation
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello, Annotation!");

        Persion xm = new XiaoMing();

        //该方法被废弃，可以加注解
        xm.sing();

        // 首先判断该类是否被注解
        boolean isAnnocated = Main.class.isAnnotationPresent(DescriptionAnnocation.class);
        if(isAnnocated){
            //获取注解
            DescriptionAnnocation DescAnc = Main.class.getAnnotation(DescriptionAnnocation.class);
            System.out.println("Main Class 中的 DescriptionAnnocation注解：");
            System.out.println("Desc:\t"+DescAnc.Desc());
            System.out.println("Author:\t"+DescAnc.Author());
        }
    }
}
