package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sergey.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
       int[] res =  solve(nums, target);
        System.out.println(Arrays.toString(res));
        int[] res2 =  solve2(nums, target);
        System.out.println(Arrays.toString(res2));
    }


    /**
     * Time complexity O(N)
     * Space complexity O(N)
     * @param nums
     * @param target
     * @return
     */
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

    /**
     * Time complexity O(N^2)
     * Space complexity O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] solve2(int[] nums, int target) {
        int[] res = new int[2];
        for (int i= 0 ; i < nums.length; i++) {
            int num1 = nums[i];
            for (int j = i +1; j< nums.length ; j++){
               int num2 = nums[j];
               if (target == num1 + num2){
                   res[0] = i;
                   res[1] = j;
               }
            }
        }
        return res;
    }

}
