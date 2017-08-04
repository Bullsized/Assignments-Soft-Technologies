package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e18Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String[] inputDetails = scan.nextLine().split(" ");

        while (!inputDetails[0].equals("END"))
        {
            if (inputDetails.length == 3) //add to the dict
            {
                phonebook.put(inputDetails[1], inputDetails[2]);
            }
            else //find
            {
                if (phonebook.containsKey(inputDetails[1]))
                {
                    System.out.printf("%s -> %s", inputDetails[1], phonebook.get(inputDetails[1]));
                    System.out.println();
                }
                else
                {
                    System.out.printf("Contact %s does not exist.", inputDetails[1]);
                    System.out.println();
                }
            }

            inputDetails = scan.nextLine().split(" ");
        }
    }
}
