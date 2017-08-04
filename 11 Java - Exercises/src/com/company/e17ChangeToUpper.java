package com.company;

import java.util.Scanner;

public class e17ChangeToUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder solution = new StringBuilder(input);

        int start = input.indexOf("<upcase>");

        while (start > -1) {

            int end = solution.indexOf("</upcase>");

            String needsToUpper = solution.substring(start + 8, end);

            String toUpper = needsToUpper.toUpperCase();

            solution.replace(start, end + 9, toUpper);

            start = solution.indexOf("<upcase>");
        }

        System.out.println(solution);
    }
}
