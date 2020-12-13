package com.company;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 5
Problem 2:  Leetcode 700,701,& 450
Data Structures and Algorithms
 */
//Leetcode 700- Search in Binary Tree
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null) {

            if(root.val > val)
                return searchBST(root.left,val);

            if(root.val < val)
                return searchBST(root.right,val);

            return root;
        }
        return null;
    }
}
//Leetcode 701- Insert into Binary Tree
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        while(root != null){

            if(root.val<val){
                root.right = insertIntoBST(root.right, val);
                return root;}
            else{
                root.left = insertIntoBST(root.left, val);
                return root;}
        }
        return new TreeNode(val);
    }
}
//Leetcode 450- Delete node in BST
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        while (root != null) {
            if(key>root.val){
                root.right=deleteNode(root.right,key);
            }
            else if(key<root.val){
                root.left=deleteNode(root.left,key);
            }
            else{
                if(root.right!=null && root.left!=null){
                    int max=findmax(root.left);
                    root.val=max;
                    root.left=deleteNode(root.left,max);
                    return root;
                }
                else if(root.left!=null){
                    return root.left;
                }
                else if (root.right!=null){
                    return root.right;
                }
                else
                    return null;
            }
            return root;
        }
        return null;
    }
    private int findmax(TreeNode root){
        if(root.right==null)
            return root.val;
        return findmax(root.right);
    }
}