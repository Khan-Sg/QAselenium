package com.sgtesting.p3;

public class StringReverse {
    public static void main(String[] args) {
        String s="I Reverse the string";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}
