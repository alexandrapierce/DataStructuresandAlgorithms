package com.company;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 2
Problem 1: Leetcode 75 - Sort Colors
Data Structures and Algorithms
 */
class Solution {
    public void sortColors(int[] nums) {
        int first = 0;
        int i = 0;
        int last = nums.length -1;
        while(i<= last) {
            if (nums[i] == 0){
                int hold = nums[i];
                nums[i] = nums[first];
                nums[first] = hold;
                i++;
                first++;
            }
            else if (nums[i] == 1){
                i++;
            }
            else {
                int hold = nums[i];
                nums[i] = nums[last];
                nums[last] = hold;
                last--;
            }

        }
    }
}