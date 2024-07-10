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
			//[-2, -2, 1, -4, -2, -3]
		}
		sum.add(result); // for what?
		//[-2, -2, 1, -4, -2, -3, -3]
	}

	public int sumRange(int left, int right) {
		System.out.println(" left=" +left + " right=" + right);
		//[-2, -2, 1, -4, -2, -3, -3]
		if (left - 1 != -1) {
			Integer rValue = sum.get(right);
			System.out.println(rValue);
			Integer lValue = sum.get(left - 1);
			System.out.println(lValue);
			return rValue - lValue; // -3 -  -2
		} else {
			return sum.get(right);
		}
	}

}
