package com.codingbat.warmup;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        int [] sumArray = new int[2];

        for(int i = 1; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j]== target){
                    sumArray[0] = i;
                    sumArray[1] = j;
                }
            }
        }
        return sumArray;
    }

}
