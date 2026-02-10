// given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order

import java.util.*;

class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[]{}; // guaranteed one solution, so this won't run
    }
}
