package easy.hash.table;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class FindPermutationDifferenceTest {

	/**
	 * Input: s = "abc", t = "bac"
	 * * Output: 2
	 * * <p>
	 * * <p>
	 * * Input: s = "abcde", t = "edbac"
	 * * Output: 12
	 */
	@Test
	void execute() {
		FindPermutationDifference findPermutationDifference = new FindPermutationDifference();
		int result1 = findPermutationDifference.execute("abc", "bac");
		assertThat(result1).isEqualTo(2);
		int result2 = findPermutationDifference.execute("abcde", "edbac");
		assertThat(result2).isEqualTo(12);
	}
}