package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class e09MostFreqNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt((Integer::parseInt))
                .toArray();

        int maxCount = 0;
        int theNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            int currCount = 0;
            for (int x = 0; x < nums.length; x++) {
                if (nums[i] == nums[x]) {
                    currCount++;
                }
            }

            if (currCount > maxCount) {
                maxCount = currCount;
                theNumber = nums[i];
            }
        }
        System.out.println(theNumber);
    }
}
