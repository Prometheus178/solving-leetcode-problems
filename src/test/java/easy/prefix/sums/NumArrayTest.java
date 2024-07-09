package easy.prefix.sums;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class NumArrayTest {

	@Test
	void sumRange() {
		NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
		assertThat(numArray.sumRange(0, 2)).isEqualTo(1);
		assertThat(numArray.sumRange(2, 5)).isEqualTo(-1);
		assertThat(numArray.sumRange(0, 5)).isEqualTo(-3);

		NumArray numArray1 = new NumArray(new int[] {-2});
		assertThat(numArray1.sumRange(0, 0)).isEqualTo(-2);

		NumArray numArray2 = new NumArray(new int[] {-1, 0, 1});
		assertThat(numArray2.sumRange(2, 2)).isEqualTo(1);

	}
}