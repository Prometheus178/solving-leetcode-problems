package easy;

import java.util.*;

/**
 * Author: Sergey.
 */
public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 1, 2, 1, 2}));
    }

    public static int solve(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        int singleNumber = 0;
        for (Integer i : set) {
            singleNumber = i;
        }

        return singleNumber;
    }
}
