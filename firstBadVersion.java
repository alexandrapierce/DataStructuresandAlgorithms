package com.company;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 1
Problem 1: Leetcode 278 - First Bad Version
Data Structures and Algorithms
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if (s.length() == 0) {
            return true;
        }
        if (s.length() == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            if (p == '(' || p == '{' || p == '[') {
                stack.push(p);
            }

            if (p == ')') {
                if (!stack.isEmpty() && stack.peek() =='(') {
                    stack.pop();
                }
                else
                    return false;
            }

            else if (p == '}') {
                if (!stack.isEmpty() && stack.peek() =='{') {
                    stack.pop();
                }
                else
                    return false;
            }

            else if (p == ']') {
                if (!stack.isEmpty() && stack.peek() =='[') {
                    stack.pop();
                }
                else
                    return false;
            }
        }
        return stack.empty();
    }
}
