package easy.prefix.sums;

import static org.assertj.core.api.Java6Assertions.assertThat;

class NumArray2Test {


	public static void main(String[] args) {
		NumArray2 numArray2 = new NumArray2(new int[] {-2, 0, 3, -5, 2, -1});
		assertThat(numArray2.sumRange(0, 2))
				.isEqualTo(1);
		int actual = numArray2.sumRange(2, 5);
		System.out.println("actual=" + actual);
		assertThat(actual)
				.isEqualTo(-1);
		assertThat(numArray2.sumRange(0, 5))
				.isEqualTo(-3);
	}

}