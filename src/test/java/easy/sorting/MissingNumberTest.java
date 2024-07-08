package easy.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

	/**
	 *  *Input: nums = [3,0,1]
	 *  * Output: 2
	 *  *
	 *  * Input: nums = [0,1]
	 *  * Output: 2
	 *  *
	 *  * * Input: nums = [0,2]
	 *  * Output: 1
	 *  *
	 *  * * * Input: nums = [1,2]
	 *  * Output: 0
	 *  *
	 *  * Input: nums = [9,6,4,2,3,5,7,0,1]
	 *  * Output: 8
	 *
	 */
	@Test
	void execute() {
		List<int[][]> examples = new ArrayList<>();
		//examples.add(new int[][]{{3,0,1} ,{2}});
		//examples.add(new int[][]{{0,1} ,{2}});
		examples.add(new int[][]{{0,2} ,{1}});
		//examples.add(new int[][]{{1,2} ,{0}});
		examples.add(new int[][]{{1} ,{0}});
		examples.add(new int[][]{{9,6,4,2,3,5,7,0,1} ,{8}});

		MissingNumber missingNumber = new MissingNumber();
		for (int[][] ex: examples) {
			int missingNum = missingNumber.execute(ex[0]);
			int[] ex1 = ex[1];
			assertThat(missingNum)
					.isEqualTo(ex1[0]);
		}

	}
}