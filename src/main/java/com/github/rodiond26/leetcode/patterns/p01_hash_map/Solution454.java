package com.github.rodiond26.leetcode.patterns.p01_hash_map;

import java.util.*;

class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // O (N ^ 2)

        // 1.
        Map<Integer, Integer> leftSumCombinations = new HashMap<>();
        for (int j : nums1) {
            for (int k : nums2) {
                int sum = j + k;
                leftSumCombinations.put(sum, leftSumCombinations.getOrDefault(sum, 0) + 1);
            }
        }

        // 2.
        int combinations = 0;

        int target = 0;
        for (int k : nums3) {
            for (int i : nums4) {
                int sum = k + i;
                if (leftSumCombinations.containsKey(target - sum)) {
                    combinations += leftSumCombinations.get(target - sum);
                }
            }
        }
        return combinations;
    }
}
