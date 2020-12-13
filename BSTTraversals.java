package com.company;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 5
Problem 1:  Leetcode 94- Binary Tree Inorder Traversal
            Leetcode 144- Binary Tree Preorder Traversal
            Leetcode 145- Binary Tree Postorder Traversal
Data Structures and Algorithms
 */
class leetCode94 {
    List<Integer> inord = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        //check if null
        if(root==null)
            return new ArrayList<Integer>();
        //recursive call on left
        inorderTraversal(root.left);
        inord.add(root.val);
        //recursive call on right
        inorderTraversal(root.right);
        return inord;

    }
}

class leetCode144 {
    static List<Integer> preord=new ArrayList<Integer>();
    public static void traverse(TreeNode root)
    {
        //check if null
        if(root==null)
            return;
        //add first
        preord.add(root.val);
        //left and right
        traverse(root.left);
        traverse(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        preord.clear();
        traverse(root);
        return preord;
    }
}

class leetCode145 {
    static List<Integer> postord=new ArrayList<Integer>();
    public static void traverse(TreeNode root)
    {
        //check if null
        if(root==null)
            return;
        //left and right
        traverse(root.left);
        traverse(root.right);
        //add last
        postord.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        postord.clear();
        traverse(root);
        return postord;
    }
}
