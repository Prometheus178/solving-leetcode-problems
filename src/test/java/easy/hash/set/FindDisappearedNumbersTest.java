package easy.hash.set;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Java6Assertions.assertThat;

class FindDisappearedNumbersTest {

	/**
	 * * <p>
	 * * Input: nums = [4,3,2,7,8,2,3,1]
	 * * Output: [5,6]
	 * * <p>
	 * * Input: nums = [1,1]
	 * * Output: [2]
	 * * <p>
	 */
	@Test
	void execute() {
		Map<int[], List<Integer>> testData = new HashMap<>();
		testData.put(new int[] {4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6));
		testData.put(new int[] {1,1}, List.of(2));
		FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();

		for (Map.Entry<int[], List<Integer>> entry : testData.entrySet()) {
			List<Integer> result = findDisappearedNumbers.execute(Arrays.copyOf(entry.getKey(), entry.getKey().length));
			List<Integer> expectedResult = entry.getValue();
			assertThat(result).containsAll(expectedResult);
		}

	}
	@Test
	void execute2() {
		Map<int[], List<Integer>> testData = new HashMap<>();
		testData.put(new int[] {4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6));
		testData.put(new int[] {1,1}, List.of(2));
		FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();

		for (Map.Entry<int[], List<Integer>> entry : testData.entrySet()) {
			List<Integer> result = findDisappearedNumbers.solve(Arrays.copyOf(entry.getKey(), entry.getKey().length));
			List<Integer> expectedResult = entry.getValue();
			assertThat(result).containsAll(expectedResult);
		}

	}
}