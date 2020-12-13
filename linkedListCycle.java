package com.company;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 3
Problem 1: Leetcode 141- Linked List Cycle
Data Structures and Algorithms
 */
public class Main {
    public boolean hasCycle(ListNode head) {
        if (head == null) {return false;}
        ListNode first = head;
        ListNode follow = head.next;
        while (first != follow) {
            if (follow == null || follow.next == null) {return false;}
            first = first.next;
            follow = follow.next.next;
        }
        return true;
    }
}
