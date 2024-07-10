package easy.prefix.sums;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a class with initial array numbers from -N to N ,with method sumRange where it is find sum numbers between
 * indexes from 0 to array.length - 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -105 <= nums[i] <= 105
 * 0 <= left <= right < nums.length
 * At most 104 calls will be made to sumRange.
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * Output
 * [null, 1, -1, -3]
 * <p>
 * time O(N)
 * space O(1)
 */
public class NumArray3 {

	//-2, 0, 3, -5, 2, -1
	//-2,-2, 1, -4,-2, -3
	private final List<Integer> precountedSums = new ArrayList<>();

	public NumArray3(int[] nums) {
		// we need to iterate nums
		// count sums from n +  (n +1) ...

		for (int i = 0; i < nums.length; i++) {
			int resultSum;
			if (precountedSums.isEmpty()) {
				resultSum = 0;
			} else {
				resultSum = precountedSums.get(i-1);
			}

			int value = nums[i];
			resultSum = resultSum + value;
			precountedSums.add(resultSum);
		}
		System.out.println(precountedSums);
	}


	public int sumRange(int left, int right) {
		int resultSum = 0;
		//[-2, -2, 1, -4, -2, -3]
		// 	0      2    = 1
		//      1  2    = 3 =
		//[-2, -2, 1, -4, -2, -3, -3]
		return resultSum;
	}

}
