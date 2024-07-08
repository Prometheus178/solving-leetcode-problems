package easy.array;

import java.util.Arrays;

/**
 * find single number , in array where numbers appears twice. return single number
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 10^4
 * -3 * 10^4 <= nums[i] <= 3 * 10^4
 * not ordered
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * <p>
 *
 * Time complexity O(n log(n))
 * Space complexity O(1)
 * Author: Sergey.
 */
public class SingleNumber {


	/**
	 * * Time complexity O(n log(n))
	 *  * Space complexity O(1)
	 *
	 * @param nums nums
	 * @return {@link int}
	 */
	public int execute(int[] nums) {
		// we can sort
		Arrays.sort(nums);
		// create store num = nums[0] and counter = 1
		int num = nums[0];
		int counter = 1;
		// iterate
		for (int i =1; i < nums.length ; i++) {
			int cur = nums[1];
			// if equal update counter
			if (num == cur){
				counter++;
			}else {
				// if num and cur not equal check counter is 2 move num = cur and counter = 1 if not return num
				if (counter == 2) {
					counter = 1;
					num = cur;
				} else {
					num = cur;
					break;
				}
			}
		}
		//
		return num;
	}


	/**
	 *  * Time complexity O(N))
	 *  * Space complexity O(1)
	 *
	 * @param nums nums
	 * @return {@link int}
	 */
	public  int solve(int[] nums) {
		int result = 0;
		for (int num : nums) {
			result = result ^ num;
		}
		return result;
	}
}
