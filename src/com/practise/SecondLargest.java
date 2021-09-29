package com.practise;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 4, 8};

        Arrays.sort(arr);

        System.out.println(arr[arr.length-2]);

    }
}
