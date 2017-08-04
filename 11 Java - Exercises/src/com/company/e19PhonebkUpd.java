package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class e19PhonebkUpd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, String> phonebook = new TreeMap<>();

        String[] inputDetails = scan.nextLine().split(" ");

        while (!inputDetails[0].equals("END")) {
            if (inputDetails.length == 3) { //add to the dict
                phonebook.put(inputDetails[1], inputDetails[2]);
            } else if (inputDetails.length == 2) { //find
                if (phonebook.containsKey(inputDetails[1])) {
                    System.out.printf("%s -> %s", inputDetails[1], phonebook.get(inputDetails[1]));
                    System.out.println();
                } else {
                    System.out.printf("Contact %s does not exist.", inputDetails[1]);
                    System.out.println();
                }
            } else {
                for (Map.Entry<String,String> kvp : phonebook.entrySet()) {
                    System.out.printf("%s -> %s", kvp.getKey(), kvp.getValue());
                    System.out.println();
                }
            }

            inputDetails = scan.nextLine().split(" ");
        }
    }
}