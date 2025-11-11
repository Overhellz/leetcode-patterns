package com.github.rodiond26.leetcode.patterns.p01_hash_map;

import java.util.*;

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        // 0. hash function
        // 1. HashMap : key -> hash, value -> list of strings
        Map<Integer, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int hash = hash(str);
            List<String> list = map.getOrDefault(hash, new ArrayList<>());
            list.add(str);
            map.put(hash, list);
        }

        // 2. hashmap to result list
        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            resultList.add(entry.getValue());
        }
        return resultList;
    }

    public int hash(String str) {
        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }
        return Arrays.hashCode(counts);
    }
}
