package com.company;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Arrays;

public class e12BombNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();

        for (String num : input) {
            numbers.add(Integer.parseInt(num));
        }

        String[] line = scan.nextLine().split(" ");

        int bomb = Integer.parseInt(line[0]);
        int power = Integer.parseInt(line[1]);

        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) == bomb) {
                int indexOfBomb = numbers.indexOf(bomb);

                int start = Math.max(0, indexOfBomb - power);
                int loopEnd = Math.min(
                        Math.min((power * 2) + 1, numbers.size() - start),
                        (indexOfBomb + power + 1));

                for (int i = 0; i < loopEnd; i++) {
                    numbers.remove(start);
                }

                j = -1;
            }
        }

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);


        /*

        int[] nums = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt((Integer::parseInt))
                .toArray();
        ArrayList<Integer> nums1 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            nums1.add(nums[i]);
        }

        int[] bombNums = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt((Integer::parseInt))
                .toArray();

        int bombDigit = bombNums[0];
        int bombPower = bombNums[1];

        for (int i = 0; i < nums1.size(); i++) {
            if (bombDigit == nums1.get(i)) {
                int indexOfBomb = nums1.get(i);

                int start = Math.max(0, indexOfBomb - bombPower);
                int removeUntil = Math.min(Math.min((bombPower * 2) + 1, nums.length - start), (indexOfBomb + bombPower + 1));

                for (int k = 0; k < removeUntil; k++) {
                    nums1.remove(start);
                }

                i--;
            }
        }
        int sum = nums1.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);*/
    }
}
