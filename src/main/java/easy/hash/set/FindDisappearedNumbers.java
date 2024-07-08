package easy.hash.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * given an array of numbers from 1 to N, we need to return numbers dissapered in array
 * <p>
 * Constraints:
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 * not ordered
 * it can have duplicates
 * <p>
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * <p>
 * Input: nums = [1,1]
 * Output: [2]
 * <p>
 * time complexity O(N)
 * space complexity - O(N)
 * Author: Sergey.
 */
public class FindDisappearedNumbers {

	public List<Integer> execute(int[] nums) {
		// need to know range of from 1 to N
		// we need to remove duplicates
		// we need to iterate and check in set is contains if not collect it
		int range = nums.length;
		Set<Integer> integerSet = new HashSet<>();
		for (int n : nums) {
			integerSet.add(n);
		}

		List<Integer> disappearedNums = new ArrayList<>();
		int counter = 1;
		while (counter <= range) {

			if (!integerSet.contains(counter)) {
				disappearedNums.add(counter);
			}
			counter++;
		}
		return disappearedNums;
	}


	public  List<Integer> solve(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correctPos = nums[i] - 1;
			if (i != correctPos && nums[correctPos] != nums[i]) {
				swap(nums, i, correctPos);
			} else {
				i++;
			}
		}
		List<Integer> result = new ArrayList<>();
		for (int j = 0; j < nums.length; j++) {
			if (j + 1 != nums[j]) {
				result.add(j + 1);
			}
		}
		return result;
	}

	private static void swap(int[] nums, int i, int correctPos) {
		nums[i] = nums[i] + nums[correctPos];
		nums[correctPos] = nums[i] - nums[correctPos];
		nums[i] = nums[i] - nums[correctPos];
	}
}
