package easy.hash.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * given array of nums and if we find duplicate number return false if not return true
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {

	/**
	 * execute
	 * time O(n*long(n)) in the best case
	 * and
	 * time 0(N) for the worse
	 *
	 * space O(1)
	 * @param nums nums
	 * @return {@link boolean}
	 */
	public boolean execute1(int[] nums){
		// sorting if next element equal prev return false
		Arrays.sort(nums);
		int prev = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int cur = nums[i] ;
			if (prev == cur){
				return true;
			}
		}
		return false;
	}

	/**
	 * execute
	 *
	 * time O(n)
	 * space O(N)
	 * @param nums nums
	 * @return {@link boolean}
	 */
	public boolean execute2(int[] nums){
		// set if size of  set and nums different return false

		return solve(nums);
	}
	/**
	 * time complexity = O(n)
	 * memory complexity = O(n)
	 *
	 * @param nums
	 * @return
	 */
	private  boolean solve(int[] nums){
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}
}
