import java.util.*;
/*
Course: CSCI 230
Name: Alex Pierce
Homework Assignment 2
Problem 1: Leetcode 274 - Hindex
Data Structures and Algorithms
 */
public class Solution_274 {
/*public static void quickSort(int[] arr, int left, int right){
    if (arr == null || arr.length == 0) return;
    int middle = arr[left + (right-left/2)];
    int l = left;
    int r = right;
    while (l <= r) {
        while (arr[l] < middle) {
            l++;
        }
        while (arr[r] > middle){
            r --;
        }
        if (l <= r){
            int hold = arr[l];
            arr[l] = arr[r];
            arr[r] = hold;
            l++;
            r--;
        }
    }
    if (left < r)
        quickSort(arr, left, r);
    if (l > right)
        quickSort(arr, l, right);
    }*/

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int middle = left + (right - left)/2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);

        int leftX = left;
        int rightX = middle +1;
        int newX = 0;
        int moveX;
        int newArray[] = new int[right-left+1];
        while(newX <= right - left) {
            if (leftX > middle) {
                moveX = rightX;
                rightX++;
            }
            else if (rightX > right) {
                moveX = leftX;
                leftX++;
            }
            else if (arr[leftX] < arr[rightX]) {
                moveX = leftX;
                leftX++;
            }
            else {
                moveX = rightX;
                rightX++;
            }
            newArray[newX] = arr[moveX];
            newX++;
        }
        for (int i = left; i <= right; ++i) {
            arr[i] = newArray[i - left];
        }

    }

    public int binarySearch(int[] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }
        int i = 0;
        int j = arr.length - 1;
        while (i <= j){
            int mid = i + (j-i)/2;
            if (arr[mid] < j - mid){
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        return arr.length-i;
    }

    public int hIndex(int[] citations) {
        //int numbers[] = {5, 2, 8, 4, 7, 1, 6, 3};
        mergeSort(citations, 0, citations.length-1);
        for (int i = 0; i < citations.length-1; ++i) {
            System.out.print(citations[i] + ", ");
            //quickSort(numbers, 0, 7);
            //for (int j = 0; j < 8; ++i) {
            //    System.out.print("Quick sort: " + numbers[j] + ", ");
        }
        return binarySearch(citations);

    }
}

