package easy.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class IntersectionTest {

	@Test
	void execute() {
		Intersection intersection = new Intersection();

		int[] result = intersection.execute(new int[] {1, 2, 2, 1}, new int[] {2, 2});
		assertThat(result).isEqualTo(new int[] {2});
		int[] result2 = intersection.execute(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4});
		assertThat(result2).isEqualTo(new int[] {9, 4});
	}
}