package com.sgtesting.p3;
class Reverese2{
     String  usingreturn(){
        String s="Hellow";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        return s1;
    }
    }

public class ReverseusingReturn {
    public static void main(String[] args) {
        Reverese2 r1=new Reverese2();
        String g=r1.usingreturn();
        System.out.println(g);
    }
}
