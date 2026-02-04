// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
// Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
// The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

import java.util.ArrayList;

public class removeDuplicates {

    public static int removeDuplicates(ArrayList<Integer> nums) {
        if (nums.size() == 0) {
            return 0; // empty list
        }

        int k = 1; // index for unique elements

        for (int i = 1; i < nums.size(); i++) {
            if (!nums.get(i).equals(nums.get(i - 1))) {
                nums.set(k, nums.get(i));
                k++;
            }
        }

        return k;
    }
}
