package easy.prefix.sums;

/**
 *
 * Given a class with initial array numbers from -N to N ,with method sumRange where it is find sum numbers between
 * indexes from 0 to array.length - 1
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -105 <= nums[i] <= 105
 * 0 <= left <= right < nums.length
 * At most 104 calls will be made to sumRange.
 *
 * Example 1:
 *
 * Input
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * Output
 * [null, 1, -1, -3]
 *
 * time O(N)
 * space O(1)

 */
public class NumArray {

	//-2, 0, 3, -5, 2, -1
	private final int[] nums;
	public NumArray(int[] nums) {
		this.nums = nums;
	}


	public int sumRange(int left, int right) {
		int resultSum = 0;
		// iterate nums from left to right
		for (int i = left ; i <= right; i++){
			// count values sum in iteration
			int value = nums[i];
			resultSum = resultSum + value;
		}
		return resultSum;
	}

}
