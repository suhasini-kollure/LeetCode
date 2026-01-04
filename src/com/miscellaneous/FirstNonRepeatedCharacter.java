package com.miscellaneous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Find the first non-repeated character in a list
public class FirstNonRepeatedCharacter {

    public static Character firstNonRepeated(List<Character> list) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (Character ch : list) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Character> characters = Arrays.asList('a', 'b', 'c', 'a', 'b', 'd');
        System.out.println(firstNonRepeated(characters));
    }
}
