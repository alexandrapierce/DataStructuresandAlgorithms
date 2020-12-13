package com.company;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 5
Problem 2:  Leetcode 108- Coverted Sorted Array to Binary Search Tree
Data Structures and Algorithms
 */
class leetCode108 {
    public TreeNode sortedArrayToBST(int[] vals) {
        if (vals == null || vals.length ==0) {
            return null;
        }
        return helper(vals, 0, vals.length - 1);
    }

    public TreeNode helper(int[] vals, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(vals[mid]);
        root.left = helper(vals, left, mid - 1);
        root.right = helper(vals, mid + 1, right);
        return root;
    }

}

