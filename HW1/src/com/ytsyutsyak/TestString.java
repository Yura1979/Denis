package com.ytsyutsyak;

import java.util.Arrays;
import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        int size = 5;
        String[] strArray = new String[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Enter String");
            strArray[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(strArray));
        String[] sortedArray = sortArray(strArray);
        System.out.println(Arrays.toString(sortedArray));

        System.out.printf("Shortest String is %s and it`s lenghs is %d\n", sortedArray[0], sortedArray[0].length());

        System.out.println("Second task");
        for (int i = 0; i <= sortedArray.length/2; i++) {
            System.out.println(sortedArray[i] + " lenght is " + sortedArray[i].length());
        }
    }
    public static String[] sortArray(String[] data){
        String tmp;
        for (int i = 0; i < data.length ; i++) {
            for (int j = i + 1; j < data.length ; j++) {
                if (data[i].length() > data[j].length()) {
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }

        return data;
    }
}
