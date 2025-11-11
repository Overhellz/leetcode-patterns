package com.github.rodiond26.leetcode.patterns.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        // 1. Hashmap s
        Map<Character, Integer> sCharMap = strToCharMap(s);

        // 2. Hashmap t
        Map<Character, Integer> tCharMap = strToCharMap(t);

        // 3. Сравнение Hashmap s и Hashmap t
        return sCharMap.equals(tCharMap);

        /*
         * return strToCharMap(s).equals(strToCharMap(t));
         */
    }

    private Map<Character, Integer> strToCharMap(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        return charMap;
    }
}
