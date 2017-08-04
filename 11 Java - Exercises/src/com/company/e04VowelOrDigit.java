package com.company;

import java.util.Scanner;

public class e04VowelOrDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char example = scan.nextLine().charAt(0);

        //char[] vowels = {'a', 'e', 'i', 'o', 'u'}; since there is no contains method, we're going to do it the stupid way.

        if (example == 'a' || example == 'e' || example == 'i' || example == 'o' || example == 'u') {
            System.out.println("vowel");
        } else if (example == '1' || example == '2' || example == '3' ||
                example == '4' || example == '5' || example == '6' ||
                example == '7' || example == '8' || example == '9' ||
                example == '0') {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}
