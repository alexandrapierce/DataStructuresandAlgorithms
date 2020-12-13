package com.company;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 3
Problem 1: Leetcode 203- Remove Linked List elements
Data Structures and Algorithms
 */

public class Main {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {head = head.next;}
        ListNode previous = head;
        ListNode pointer = head;
        while (pointer != null) {
            if (pointer.val == val) {
                previous.next = pointer.next;
            }
            else {
                previous = pointer;
            }
            pointer = pointer.next;
        }
        return head;
    }
}

