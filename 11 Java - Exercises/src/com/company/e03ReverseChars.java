package com.company;

import java.util.Scanner;

public class e03ReverseChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder solution = new StringBuilder();

        solution.insert(0, scan.nextLine());
        solution.insert(0, scan.nextLine());
        solution.insert(0, scan.nextLine());

        System.out.println(solution);

    }
}
