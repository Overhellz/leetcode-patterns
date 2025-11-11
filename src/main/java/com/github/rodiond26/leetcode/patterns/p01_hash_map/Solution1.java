package com.github.rodiond26.leetcode.patterns.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        // 1. HashMap
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();

        // 2. for cycle
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int toFindValue = target - current;

            if (valueToIndexMap.containsKey(toFindValue)) {
                return new int[]{i, valueToIndexMap.get(toFindValue)};
            } else {
                valueToIndexMap.put(current, i);
            }
        }

        return null;
    }
}
