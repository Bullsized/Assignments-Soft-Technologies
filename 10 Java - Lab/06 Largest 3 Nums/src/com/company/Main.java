package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbersAsText = scan.nextLine().split(" ");

        int[] numbers = new int[numbersAsText.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsText[i]);
        }

        Arrays.sort(numbers);

        int count = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
            count++;

            if (count == 3) {
                break;
            }
        }
    }
}