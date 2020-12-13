package com.company;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 4
Problem 2: Leetcode 101- Symmetric Tree
Data Structures and Algorithms
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }
    private boolean isSymmetric(TreeNode leftSide, TreeNode rightSide) {
        if (leftSide == null || rightSide == null) return leftSide == rightSide;
        if (leftSide.val != rightSide.val) return false;
        return isSymmetric(leftSide.left, rightSide.right) && isSymmetric(leftSide.right, rightSide.left);
    }
}