package easy.prefix.sums;

import java.util.ArrayList;
import java.util.List;

class NumArray2 {

	List<Integer> sum = new ArrayList<>();

	public NumArray2(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result = nums[i] + result;
			sum.add(result);
		}
		sum.add(result);
	}

	public int sumRange(int left, int right) {
		if (left - 1 != -1) {
			return sum.get(right) - sum.get(left - 1);
		} else {
			return sum.get(right);
		}
	}

}
