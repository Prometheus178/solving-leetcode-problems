package easy.array;

import java.util.Arrays;

public class RemoveDuplicates {

	/**
	 * We need to find count of uniq numbers in ordered array , if we find duplicates we should remove from this array
	 * <p>
	 * array contains numbers from -100 to 100
	 * array cant be empty , max nums 30000
	 * <p>
	 * [ -100, -2 , 0 , 0, 0 , 1, 1 , 5 , 100]
	 * [ 0, 0 ,0 ]
	 * [ 1 ]
	 * [ 4, 5, 6,7, 8]
	 * <p>
	 * [ -100, -2 , 0 , 1 ,5 ,100, -101 ,-101  ,-101 ]
	 *
	 * @return count uniq nums
	 */
	public int execute(int[] nums) {
		int countUniqNums = nums.length;
		if (countUniqNums == 1) {
			return countUniqNums;
		}
		iterateAndReplaceDuplicate(nums);
		countUniqNums = iterateToGetUniqValues(nums);
		return countUniqNums;
	}

	/**
	 * [1 , 2, 2, 3 ]
	 * [1 , 2, 2, 3 ]
	 * [1 , 2, 2, 3 ]
	 * [1 , 2, 3, 3 ]
	 * we move forward until we
	 *
	 * @param nums nums
	 * @return {@link int}
	 */

	public int execute3(int[] nums) {
		int uniqNums = 1;
		if (nums.length == uniqNums) {
			return uniqNums;
		}
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i-1]) {
				//shift
				nums[index] = nums[i];
				index++;
				uniqNums++;
			}
			System.out.println(Arrays.toString(nums));
		}


		return uniqNums;
	}


	public int execute2(int[] nums) {
		if (nums.length == 1) {
			return 1;
		}

		int uniqueCount = 1;
		int index = 1;

		// 1,2 ,2 ,3
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[index] = nums[i];
				index++;
				uniqueCount++;
			}
			System.out.println(Arrays.toString(nums));
		}
		return uniqueCount;
	}

	private int iterateToGetUniqValues(int[] nums) {
		int countUniqNumber = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				countUniqNumber++;
			} else {
				break;
			}
		}
		return countUniqNumber;
	}

	private void iterateAndReplaceDuplicate(int[] nums) {
		int counter = nums.length;
		for (int i = 1; i < nums.length; i++) {

			if (nums[i - 1] == nums[i]) {
				shift(i, nums);
				i--;
			}

			if (counter == 0) {
				break;
			}
			counter--;
		}
	}

	//[ 0, 0, 1, 1 ,2 ]
	//[ 0, 0, 1 ,2 ,2 ]
	//[ 0, 1, 2 ,2 ,2 ]
	private void shift(int i, int[] nums) {
		for (int j = i; j < nums.length; j++) {
			nums[j - 1] = nums[j];
		}
		System.out.println(Arrays.toString(nums));
	}


}
