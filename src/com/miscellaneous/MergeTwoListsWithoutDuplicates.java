package com.miscellaneous;

import java.util.*;

public class MergeTwoListsWithoutDuplicates {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> list2 = new ArrayList<>(Arrays.asList("C", "D", "E"));

        Set<String> mergedSet  = new HashSet<>(list1);
        mergedSet.addAll(list2);

        List<String> mergedList = new ArrayList<>(mergedSet);
        System.out.println(mergedList);
    }
}
