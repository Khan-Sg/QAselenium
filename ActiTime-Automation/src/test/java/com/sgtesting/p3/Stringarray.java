package com.sgtesting.p3;
class ArrayString{
    void reverseOrder(){
        String s[]={"reverse","order","is","done"};
        String s1="";
        for(int i=s.length-1;i>=0;i--){
            s1=s1+s[i];
            if(i!=0){
                s1=s1+",";
            }
        } System.out.println(s1);

    }
}
public class Stringarray {
    public static void main(String[] args) {
        ArrayString a=new ArrayString();
        a.reverseOrder();
    }
}
