package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int limit = scan.nextInt();
        long sum = 0;

        for (int i = 0; i <  limit; i++) {
            sum += scan.nextInt();
        }

        System.out.printf("Sum = %d", sum);
    }
}
