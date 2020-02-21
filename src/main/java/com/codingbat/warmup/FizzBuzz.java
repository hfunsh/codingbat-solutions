package com.codingbat.warmup;

/*
Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead
of the number and for the multiples of five print "Buzz".
For numbers which are multiples of both three and five print "FizzBuzz"
 */

public class FizzBuzz {

    public void fizzBuzz(int a, int b){
        for(int x = a; x < b; x++){
            if(x % 3 == 0 && x % 5 == 0){
                System.out.println("FizzBuzz");
            }else
                if(x % 3 == 0){
                    System.out.println("Fizz");
                }else
                    if(x % 5 == 0 ){
                        System.out.println("Buzz");
                    }else System.out.println(x);
        }
    }

}
