/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * HashSet exercise
 */
public class Exercise {
    /**
     * Given an integer collection, return another collection without any duplicate
     * value
     * 
     * <pre>
     * Example: { 12, 53, 12, 35 } -> { 12, 35, 53 }
     * 
     * Note: Result is not expected in any specific order
     * </pre>
     * 
     * @param data a collection, possibly with duplicates
     * @return the original data stripped of duplicates
     */

    public static void main(String[] args) {
        List<Integer> list = List.of(12, 53, 12, 35);
        Exercise exercise = new Exercise();
        exercise.singles(list);
    }

    public Collection<Integer> singles(Collection<Integer> data) {
        Collection<Integer> result = new ArrayList<>();

        for (Integer curr : data) {
            if (!result.contains(curr)) {
                result.add(curr);

            }
        }

        return result;
    }
}
