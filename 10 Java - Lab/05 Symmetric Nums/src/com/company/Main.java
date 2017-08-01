package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int limit = scan.nextInt();
        boolean lamp = true;
        for (int i = 1; i <= limit; i++) {

            String currDigit = Integer.toString(i);

            for (int j = 0; j < currDigit.length() / 2; j++) {
                if (currDigit.charAt(j) == currDigit.charAt(currDigit.length() - j - 1)) {
                    lamp = true;
                } else {
                    lamp = false;
                    break;
                }
            }

            if (lamp == true) {
                System.out.print(i + " ");
            }
        }
    }
}