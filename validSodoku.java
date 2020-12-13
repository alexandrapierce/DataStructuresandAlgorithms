package com.company;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 4
Problem 1: Leetcode 36- Valid Sodoku
Data Structures and Algorithms
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> onBoard= new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char square= board[i][j];
                if(square!='.')
                    if(!onBoard.add(square+" row "+i) ||
                            !onBoard.add(square+" col "+j) ||
                            !onBoard.add(square+" submat "+i/3+"-"+j/3))
                        return false;
            }
        }
        return true;
    }
}