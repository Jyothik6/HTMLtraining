package com.sample;

import java.util.List;

public class AvgList {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       double average = calculateAverage(nums);

        System.out.println("Average: " + average);
    }

    public static double calculateAverage(List<Integer> nums) {
        return nums.stream().mapToInt(Integer::intValue)
                      .average()
                      .orElse(0.0);
    }
}
