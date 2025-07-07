package com.sgtesting.p3;

public class P2Palindrome {
    public static void main(String[] args) {
        String s = "Madam";
        String s1 = "";
            for (int i = s.length()-1; i >= 0; i--) {
                s1 = s1 + s.charAt(i);
            }
        if (s.equalsIgnoreCase(s1)) {
            System.out.println(s1+ " : is a Palindrome");}
        else{
            System.out.println(s1+ " : is not a Palindrome");
        }
    }
}
