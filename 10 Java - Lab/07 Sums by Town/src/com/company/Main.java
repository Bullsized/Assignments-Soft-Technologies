package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String limitStr = scan.nextLine();
        int limit = Integer.parseInt(limitStr);


        Map<String, Double> solution = new TreeMap<>();

        for (int i = 0; i < limit; i++) {
            String[] currentTownAndIncome = scan.nextLine().split("\\|");

            String currTown = currentTownAndIncome[0].trim();
            double currIncome = Double.parseDouble(currentTownAndIncome[1].trim());

            if (!solution.containsKey(currTown)) {
                solution.put(currTown, currIncome);
            } else {
                solution.put(currTown, solution.get(currTown) + currIncome);
            }
        }

        for (String key : solution.keySet()) {
            System.out.println(key + " -> " + solution.get(key));
        }
    }
}
