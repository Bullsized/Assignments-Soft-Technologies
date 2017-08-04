package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class e08MaxSeqOfIncrElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter = 1;
        int bestLength = 1;
        int startIncrease = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > bestLength) {
                bestLength = counter;
                startIncrease = i - bestLength + 1;
            }
        }

        for (int i = startIncrease; i < startIncrease + bestLength; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }
}