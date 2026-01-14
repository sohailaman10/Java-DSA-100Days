package BasicOfHashing;

import java.util.*;

class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 2, 1, 3};
        System.out.println(sol.countFrequencies(nums1));
        int[] nums2 = {5, 5, 5, 5};
        System.out.println(sol.countFrequencies(nums2));
    }
}
