package com.company;

import java.util.Scanner;

public class e10IndexOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        char[] lettersArr = new char[26];
        for (int i = 0; i < lettersArr.length; i++) {
            lettersArr[i] = (char) (97 + i);
        }

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            for (int j = 0; j < lettersArr.length; j++) {
                if (currentChar == lettersArr[j]) {
                    System.out.println(currentChar + " -> " + j);
                }
            }
        }
    }
}