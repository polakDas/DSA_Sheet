package apnaCollege.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {
    // O(n^2) -> time complexity
    // O(1) -> space complexity
//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) return true;
//            }
//        }
//
//        return false;
//    }

    // O(n log n) -> time complexity
    // O(1) -> space complexity
//    public boolean containsDuplicate (int[] nums) {
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i+1]) return true;
//        }
//
//        return false;
//    }

    // O(n) -> time complexity
    // O(n) -> space complexity
    public boolean containsDuplicate (int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}

