package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class e06CompCharArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstLineLetters = scan.nextLine().split("\\s");
        String[] secondLineLetters = scan.nextLine().split("\\s");

        char[] firstCharArray = new char[firstLineLetters.length];
        char[] secondCharArray = new char[secondLineLetters.length];

        for (int i = 0; i < firstCharArray.length; i++) {
            firstCharArray[i] = firstLineLetters[i].charAt(0);
        }

        for (int i = 0; i < secondLineLetters.length; i++) {
            secondCharArray[i] = secondLineLetters[i].charAt(0);
        }

        boolean equal = true;
        String printWinner = "";
        int shorterArrLength = Math.min(firstCharArray.length, secondCharArray.length);

        for (int i = 0; i < shorterArrLength; i++) {
            if (firstCharArray[i] != secondCharArray[i]) {
                printWinner = firstCharArray[i] < secondCharArray[i] ? "first" : "second";

                equal = false;
                break;
            }
        }

        String firstStr = new String(firstCharArray);
        String secondStr = new String(secondCharArray);

        if (!equal) {
            if (printWinner.equals("first")) {
                System.out.println(firstStr);
                System.out.println(secondStr);
            } else {
                System.out.println(secondStr);
                System.out.println(firstStr);
            }
        } else {
            if (firstCharArray.length < secondCharArray.length) {
                System.out.println(firstStr);
                System.out.println(secondStr);
            } else {
                System.out.println(secondStr);
                System.out.println(firstStr);
            }
        }
    }
}
