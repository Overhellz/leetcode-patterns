package com.github.rodiond26.leetcode.patterns.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        // 1. Hashmap, max, pointers
        Map<Character, Integer> charCountMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        // 2. for cycle
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);

            while (charCountMap.getOrDefault(ch, 0) > 1) {
                charCountMap.put(s.charAt(left), charCountMap.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }
}
