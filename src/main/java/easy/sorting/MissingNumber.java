package easy.sorting;

import java.util.Arrays;

/**
 * given the array of uniq numbers in range from 0 - 5 for example and we need to return missing number
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 104
 * 0 <= nums[i] <= n
 * All the numbers of nums are unique.
 *
 *Input: nums = [3,0,1]
 * Output: 2
 *
 * Input: nums = [0,1]
 * Output: 2
 *
 * * Input: nums = [0,2]
 * Output: 1
 *
 * * * Input: nums = [1,2]
 * Output: 0
 *
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 *
 * n.length == 2  =  [0,2]
 */
public class MissingNumber {

	public static void main(String[] args) {
		System.out.println(solve(new int[] {0, 1, 3}));
	}

	/**
	 * time O(N)
	 * space(1)
	 *
	 * @param nums nums
	 * @return {@link int}
	 */
	public int execute(int[] nums) {
		// sorting
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int expectedNum = nums.length;
		// iterate in reverse N-max to 0

		for (int i = nums.length - 1; i > 0 ; i--){
			// if counter not equal return counter
			if (expectedNum != nums[i]){
				return expectedNum;
			}
			expectedNum--;
		}
		return expectedNum;
	}

	/**
	 * time complexity = O(n)
	 * memory complexity = O(1)
	 *
	 * @param nums
	 * @return
	 */
	private static int solve(int[] nums) {
		int expectedSum = (nums.length * (nums.length + 1)) / 2;
		int countValue = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			countValue += nums[i];
		}
		return expectedSum - countValue;
	}

}
