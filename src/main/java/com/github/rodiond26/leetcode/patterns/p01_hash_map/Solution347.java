package com.github.rodiond26.leetcode.patterns.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. в цикле подсчитываем и записываем в map
        Map<Integer, Integer> intCountMap = new HashMap<>();
        for (int num : nums) {
            intCountMap.put(num, intCountMap.getOrDefault(num, 0) + 1);
        }

        // 2. получаем значения из map
        return intCountMap.entrySet().stream()
                .map(entry -> new int[]{entry.getKey(), entry.getValue()})
                .sorted((arr1, arr2) -> Integer.compare(arr2[1], arr1[1]))
                .limit(k)
                .mapToInt(arr -> arr[0])
                .toArray();
    }
}
