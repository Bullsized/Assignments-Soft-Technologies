package com.company;

import java.util.Scanner;

public class e14FitStrIn20Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder solution = new StringBuilder();

        if (input.length() >= 20) {
            solution.append(input, 0, 20);
        } else {
            solution.append(input, 0, input.length());
            int difference = 20 - input.length();
            for (int i = 0; i < difference; i++) {
                solution.append("*");
            }
        }

        System.out.println(solution);
    }
}
