package easy.prefix.sums;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumArray3Test {

	@Test
	void sumRange() {

		NumArray3 numArray = new NumArray3(new int[] {-2, 0, 3, -5, 2, -1});
		assertThat(numArray.sumRange(0, 2)).isEqualTo(1);
		assertThat(numArray.sumRange(2, 5)).isEqualTo(-1);
		assertThat(numArray.sumRange(0, 5)).isEqualTo(-3);

		NumArray3 numArray1 = new NumArray3(new int[] {-2});
		assertThat(numArray1.sumRange(0, 0)).isEqualTo(-2);

		NumArray3 numArray2 = new NumArray3(new int[] {-1, 0, 1});
		assertThat(numArray2.sumRange(2, 2)).isEqualTo(1);
	}
}