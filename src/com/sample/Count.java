package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();

        strings.add("hello");
        strings.add("welcome");
        strings.add("world");
        strings.add("hi");

        long count = strings.stream()
                .filter(s -> s.startsWith("h"))
                .count();

        System.out.println("Number of strings starting with 'h': " + count);
    }
}
