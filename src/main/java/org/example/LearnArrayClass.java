package org.example;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int index = Arrays.binarySearch(numbers,4);
//        System.out.println(index);
Integer[] numbers = {18,23,14,45,34,65,78,1,656,8,};
Arrays.sort(numbers);
for( int i :numbers){
    System.out.print(i + " ");
}

    }
}
