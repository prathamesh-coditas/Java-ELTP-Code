package com.prathamesh.jan21;

public class StringBufferDemo {
    public static void main(String[] args) {
        //String==> Immutable
        String s1="Prathamesh";
        s1.concat("Chaudhari");
        System.out.println("String literal is::"+s1);

        //String Buffer && StringBuilder==>Mutable
        StringBuffer s2=new StringBuffer("Prathamesh");
        StringBuffer s3=new StringBuffer();
        StringBuffer s4=new StringBuffer();
        s2.append("Chaudhari ");
        System.out.println("Sting Buffer is::"+s2);

        s2.insert(10,"Nilkanth");
        System.out.println("String Buffer Insert()::"+s2);

        s2.replace(0,10,"Priya");
        System.out.println("String Buffer Replace()::"+s2);
        System.out.println("String Buffer Length()::"+s2.length());

        System.out.println(s3.capacity());
        System.out.println(s4.capacity());
        System.out.println(s2.capacity());


    }
}
