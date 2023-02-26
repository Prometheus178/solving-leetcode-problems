package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Time complexity:
 *  initializing O(N)
 *  sumRange O(1);
 * Space complexity O(n)
 * Author: Sergey.
 */
public class RangeSumQuery {

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0,2));; // 1
        System.out.println(numArray.sumRange(2,5));; // -1
        System.out.println(numArray.sumRange(0,5));; // -3
    }
}
class NumArray {

    List<Integer> sum = new ArrayList<>();
    public NumArray(int[] nums) {
        int result = 0;
        for (int i= 0; i < nums.length ; i++){
            result = nums[i] + result;
            sum.add(result);
        }
        sum.add(result);
    }

    public int sumRange(int left, int right) {
        if (left -1 != -1 ){
             return sum.get(right) - sum.get(left - 1);
        }else {
            return sum.get(right);
        }
    }

}
