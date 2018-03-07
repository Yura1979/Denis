package com.ytsyutsyak;

import java.util.Arrays;
import java.util.Scanner;

public class Squred {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;

        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter variable a = ");
        a = scanner.nextInt();
        System.out.println();
        System.out.print("Enter variable b = ");
        b = scanner.nextInt();
        System.out.println();
        System.out.print("Enter variable c = ");
        c = scanner.nextInt();
        System.out.println();
        System.out.printf("You have entered a=%d b=%d c=%d", a, b, c);
        int[] intArray = new int[]{a, b, c};
        System.out.println(Arrays.toString(intArray));
        int[] sortedArray = new int[3];
        sortedArray = arraySort(intArray);
        System.out.println(Arrays.toString(sortedArray));

        result = sortedArray[sortedArray.length-2]*sortedArray[sortedArray.length-2] + sortedArray[sortedArray.length-1]*sortedArray[sortedArray.length-1];
        System.out.println(result);
    }
    public static int[] arraySort(int[] data){
        int tmp;
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j <data.length; j++) {
                if (data[i] > data[j]){
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
        return data;
    }
}
