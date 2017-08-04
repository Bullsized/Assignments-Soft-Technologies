package com.company;

import java.util.Scanner;

public class e01VarInHexaFormat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        int solution = Integer.parseInt(line, 16);

        System.out.println(solution);
    }
}