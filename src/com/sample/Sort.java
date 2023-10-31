package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();

        strings.add("banana");
        strings.add("apple");
       
        strings.add("date");

        List<String> sortedAscending = strings.stream()
                .sorted()
                .toList();

        System.out.println("Ascending Order:");
        sortedAscending.forEach(System.out::println);

        List<String> sortedDescending = strings.stream()
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println("\nDescending Order:");
        sortedDescending.forEach(System.out::println);
    }
}
