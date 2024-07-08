package easy.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SingleNumberTest {

	/**
	 * * Example 1:
	 * * <p>
	 * * Input: nums = [2,2,1]
	 * * Output: 1
	 * <p>
	 * * Example 2:
	 * * <p>
	 * * Input: nums = [4,1,2,1,2]
	 * * Output: 4
	 * <p>
	 * * Example 3:
	 * * <p>
	 * * Input: nums = [1]
	 * * Output: 1
	 * * <p>
	 */
	@Test
	void execute() {

		Map<int[], Integer> testData = new HashMap<>();
		testData.put(new int[] {2, 2, 1}, 1);
		testData.put(new int[] {4, 1, 2, 1, 2}, 4);
		testData.put(new int[] {1}, 1);
		SingleNumber singleNumber = new SingleNumber();

		for (Map.Entry<int[], Integer> entry : testData.entrySet()) {
			Integer result = singleNumber.solve(Arrays.copyOf(entry.getKey(), entry.getKey().length));
			Integer expectedResult = entry.getValue();
			assertThat(result).isEqualTo(expectedResult);
		}
	}
}