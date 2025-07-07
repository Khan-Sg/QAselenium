package com.sgtesting.actiTime.stepdefinations;

public class Reversestring {
    public static void main(String[] args) {
        /*
        String s="Hellow world";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }System.out.println(s1);
         */

        String s="MOM";
        String s1="";
        for(int i=s.length()-1;i>=0;i--) {
            {
                s1=s1+s.charAt(i);
            }
        }
        if(s1.equalsIgnoreCase(s)){
            System.out.println(s+" :Palindrome");
        }
        else{
            System.out.println(s+" :NotPalindrome");
        }
    }
}


