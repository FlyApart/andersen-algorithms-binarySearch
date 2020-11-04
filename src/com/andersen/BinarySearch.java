package com.andersen;

import java.util.Arrays;

public class BinarySearch{

    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int search(int value){
        Arrays.sort(array);
        int low = 0;
        int high = array.length;
        int mid;

        while (high >= low){
            mid = (high+low) / 2;

            if (array[mid] > value){
               high = mid;
            }
            else if(array[mid] < value){
               low = ++mid;
            }else if(array[mid] == value){
                return mid;
            }
        }
        return -1;
    }
}
