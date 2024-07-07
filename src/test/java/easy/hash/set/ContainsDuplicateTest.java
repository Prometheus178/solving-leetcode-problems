package easy.hash.set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class ContainsDuplicateTest {

	/**
	 * * Example 1:
	 * *
	 * * Input: nums = [1,2,3,1]
	 * * Output: true
	 * * Example 2:
	 * *
	 * * Input: nums = [1,2,3,4]
	 * * Output: false
	 * * Example 3:
	 * *
	 * * Input: nums = [1,1,1,3,3,4,3,2,4,2]
	 * * Output: true
	 */
	@Test
	void execute1() {
		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		boolean result1 = containsDuplicate.execute1(new int[] {1, 2, 3, 1});
		assertThat(result1).isTrue();
		boolean result2 = containsDuplicate.execute1(new int[] {1, 2, 3, 4});
		assertThat(result2).isFalse();
		boolean result3 = containsDuplicate.execute1(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
		assertThat(result3).isTrue();
	}
}