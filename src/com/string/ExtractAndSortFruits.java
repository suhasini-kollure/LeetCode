package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExtractAndSortFruits {

    public static void main(String[] args) {
        Object[] testData = {
                "Apples",
                new String[]{"Banana", "Cherry"},
                "Oranges",
                new String[]{"Blueberry"},
                "Cranberries",
                new String[]{"Grapes"},
                "Guava"
        };

        List<String> list = Arrays.stream(testData).flatMap(obj -> {
            if (obj instanceof String s) {
                return Stream.of(s);
            } else if (obj instanceof String[] arr) {
                return Arrays.stream(arr);
            }
            return Stream.empty();
        }).sorted().toList();

        System.out.println(list);


    }
}
