package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();

        if (!checkNumbers(first, second, third)
                && !checkNumbers(first, third, second)
                && !checkNumbers(second, third, first)) {
            System.out.printf("No");
        }
    }

    public static boolean checkNumbers(int first, int second, int sum) {
        if (first + second == sum) {
            if (first > second) {
                int temp = first;
                first = second;
                second = temp;
            }

            System.out.printf("%d + %d = %d", first, second, sum);
            return true;
        }
        return false;
    }
}
