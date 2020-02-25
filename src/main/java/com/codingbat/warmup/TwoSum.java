package com.codingbat.warmup;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.HashMap;
import java.util.Map;

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

   public int [] twoSumHash(int [] nums, int target){
       Map<Integer, Integer> sumHash = new HashMap();

       for(int i = 0; i < nums.length; i++){
           sumHash.put(nums[i], 1);
       }

       for (int j = 0; j < nums.length; j++){
           int secondNum = target - nums[j];
           if(sumHash.containsKey(secondNum) && sumHash.get(secondNum)!=j){
               return new int[] {j, sumHash.get(secondNum)};
           }
       }
       throw new IllegalArgumentException("Target sum does not exist");
   }

}
