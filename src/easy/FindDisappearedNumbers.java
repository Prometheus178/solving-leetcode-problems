package easy;

import java.util.*;

/**
 * 1. can solve by sort and if it has on index not equal i+1 that mean is missing num, but that to slow
 * 2. i think as we know on index we can find value of another index - 1 that be better solution
 * but what we can do if there is will be a loop.  i and value-1 is equal. ???
 * Author: Sergey.
 */
public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solve(nums));
    }

    public static List<Integer> solve(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
//                while (nums[i] != i+1) {
                int value = nums[i];
                int store = nums[value - 1];
                if (value == store) {

                }
                nums[i] = store;
                nums[value - 1] = value;
//                }
            }
        }

        List<Integer> missedNums = new ArrayList();
        for (
                int j = 0;
                j < nums.length; j++) {
            if (nums[j] != j + 1) {
                missedNums.add(j + 1);
            }
        }
        return missedNums;
    }
}
