package com.company;

import java.util.Scanner;

public class e13ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
