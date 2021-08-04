package com.pluralsight.calcengine;

import java.util.HashMap;
import java.util.Map;

public class Palidrome {
    public static void main(String[] args) {
        boolean check = isPalindromic("malayalam", "");
        System.out.println(check);
    }
        public static boolean isPalindromic (String word, String mark){
            boolean isPal = true;
            if (word.length() == 0) {
                return false;
            }
            HashMap<Character, Integer> mapChar = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (mapChar.containsKey(ch)) {
                    mapChar.put(ch, mapChar.get(ch) + 1);
                } else {
                    mapChar.put(ch, 1);
                }
            }
            if (word.length() % 2 == 0) {
                for (Map.Entry<Character, Integer> entries : mapChar.entrySet()) {
                    if (entries.getValue() % 2 != 0) {
                        return false;
                    }
                }
            } else {
                int occur1 = 0;
                for (Map.Entry<Character, Integer> entries : mapChar.entrySet()) {
                    if (entries.getValue() % 2 == 1) {
                        occur1++;
                        if (occur1 > 1) {
                            isPal = false;
                            break;
                        }
                    }
                }
            }
            return isPal;
        }

    }
