package com.goit.gojava3.hw1;

import java.util.HashMap;
import java.util.Map;

public class Optional {

    public static void main(String[] args) {

        int[] intArray = { 2, 3, 2, 4, 3, 7, 2, 3, 4, 4 };

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (Integer el : intArray) {
            Integer amount = hash.get(el);
            if (amount == null) {
                hash.put(el, 1);
            } else {
                hash.put(el, ++amount);
            }
        }
        for (Map.Entry<Integer, Integer> h : hash.entrySet()) {
            if (h.getValue() == 1) {
                System.out.println("result " + h.getKey());
                break;
            }
        }

    }
}
