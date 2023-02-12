package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3};
        int x = 4;
        int low = 0;
        int high = arr.length - 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
