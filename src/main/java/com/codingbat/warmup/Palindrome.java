package com.codingbat.warmup;

public class Palindrome {

    public boolean isPalindrome(String word){
        String sanitized = word.replace("\\+s", "").toLowerCase();
        char [] wordArray = sanitized.toCharArray();

        int forward = 0;
        int backward = wordArray.length-1;

        while (backward > forward){
            char first = wordArray[forward++];
            char last =  wordArray[backward--];
            if(first != last){
                return false;
            }
        }
         return true;

    }
}
