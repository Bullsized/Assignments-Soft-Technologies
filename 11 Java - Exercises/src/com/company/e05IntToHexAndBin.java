package com.company;

import java.util.Scanner;

public class e05IntToHexAndBin {
    public static void main(String[] args) {
        //the exercise wants decimal, the examples are given in integer, SoftUni did it again.
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        System.out.println(Integer.toHexString(input).toUpperCase());
        System.out.println(Integer.toBinaryString(input));
    }
}
