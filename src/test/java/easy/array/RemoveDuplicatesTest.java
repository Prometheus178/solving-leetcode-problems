package easy.array;

import easy.array.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesTest {

	private static final ArrayList<int[]> testData;

	static {
		testData = new ArrayList<>(List.of(

				new int[] {1, 2, 2, 3},
				new int[] {0, 0, 0, 1, 2},
				new int[] {0, 1, 1, 2},
				new int[] {0, 0, 0},
				new int[] {-100, -2, 0, 0, 0, 1, 1, 5, 100},
				new int[] {1},
				new int[] {4, 5, 6, 7, 8}
		));
	}

	@Test
	void execute() {
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		for (int[] data : testData) {
		//	System.out.println(Arrays.toString(data));
			int[] clone = data.clone();

			Set<Integer> collect = IntStream.of(clone).boxed().collect(Collectors.toSet());
		//	System.out.println(collect);
			long expectedResult = collect.size();

			int result = removeDuplicates.execute3(data);
			assertThat(result).isEqualTo((int) expectedResult);
		}
	}
}