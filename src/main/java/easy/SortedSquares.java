package easy;

import java.util.Arrays;

/**
 * Time complexity O(N)
 * Space complexity O(N)
 * Author: Sergey.
 */
public class SortedSquares {

    public static void main(String[] args) {
        int[] res = solve(new int[]{-4, -1, 0, 3, 10});
        System.out.println(Arrays.toString(res));

    }

    public static int[] solve(int[] nums){
        int[] result = new int[nums.length];
        int l = 0, r = nums.length - 1;
        int i = r;
        while (l <= r){
            if (nums[l] * nums[l] < nums[r] * nums[r]){
                result[i] = nums[r] * nums[r];
                r--;
            }else {
                result[i] = nums[l] * nums[l];
                l++;
            }
            i--;
        }
        return result;
    }
}
