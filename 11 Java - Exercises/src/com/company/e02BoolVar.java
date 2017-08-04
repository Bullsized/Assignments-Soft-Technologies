package com.company;

import java.util.Scanner;

public class e02BoolVar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

      //  boolean solution = Boolean.parseBoolean(line);

      //  System.out.println(solution);

        if (line.equalsIgnoreCase("true")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
