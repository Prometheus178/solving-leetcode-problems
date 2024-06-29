package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * time complexity O(n)
 * space complexity - (if exclude result list )
 * Author: Sergey.
 */
public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solve(nums));
    }

    public static List<Integer> solve(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctPos = nums[i] - 1 ;
            if (i != correctPos && nums[correctPos] != nums[i]) {
                swap(nums, i, correctPos);
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) {
                result.add(j + 1);
            }
        }
        return result;
    }

    private static void swap(int[] nums, int i, int correctPos) {
        nums[i] = nums[i] + nums[correctPos];
        nums[correctPos] = nums[i] - nums[correctPos];
        nums[i] = nums[i] - nums[correctPos];
    }
}
