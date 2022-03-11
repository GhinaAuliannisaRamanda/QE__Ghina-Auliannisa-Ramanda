package com.company;

public class palindrom {
    private static boolean palindrome(String value) {
        StringBuilder sB = new StringBuilder(value);
        sB.reverse();
        String rev = sB.toString();
        if (value.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(palindrome("kecebong"));
        System.out.println(palindrome("katak"));

    }


}