package org.example;

import java.util.Arrays;

public class BubbleSort {
    protected int[] sort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(sortArr));
        return sortArr;
    }
}
