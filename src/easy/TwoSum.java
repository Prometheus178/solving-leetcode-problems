package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Time complexity O(N)
 * Space complexity O(N)
 * Author: Sergey.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
       int[] res =  solve(nums, target);
        System.out.println(Arrays.toString(res));
    }


    public static int[] solve(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i= 0 ; i < nums.length; i++) {
            int num = nums[i];
            int dif = target - num;
            if (map.containsKey(dif)){
                res[0] = map.get(dif);
                res[1] = i;
            }else {
                map.put(num, i );
            }
        }
        return res;
    }

}
