package com.company;

import java.util.Scanner;

public class e15CensorEmailAdr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String mailString = scan.nextLine();

        String text = scan.nextLine();

        String[] mailInput = mailString.split("@");

        String mail = mailInput[0];

        StringBuilder replacer = new StringBuilder();

        for (int i = 0; i < mail.length(); i++) {
            replacer.append("*");
        }
        replacer.append("@");
        String toReplace = replacer.append(mailInput[1]).toString();

        text = text.replaceAll(mailString, toReplace);

        System.out.println(text);

    }
}