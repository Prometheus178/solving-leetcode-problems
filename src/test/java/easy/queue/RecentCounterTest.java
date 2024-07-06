package easy.queue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class RecentCounterTest {

	/**
	 * ping
	 * * Input
	 * * ["RecentCounter", "ping", "ping", "ping", "ping"]
	 * * [ [1], [100], [3001], [3002]]
	 * * Output
	 * * [ 1, 2, 3, 3]
	 * * <p>
	 * * *  * Input
	 * * *  * [ [1], [3001], [3002]]
	 * * *  * Output
	 * * *  * [ 1, 1 , 2]
	 */
	@Test
	void ping() {

		RecentCounter recentCounter1 = new RecentCounter();
		int[] val1 = new int[] {1, 1};
		int[] val2 = new int[] {100, 2};
		int[] val3 = new int[] {3001, 3};
		int[] val4 = new int[] {3002, 3};
		List<int[]> arrayCase1 = new ArrayList<>();
		arrayCase1.add(val1);
		arrayCase1.add(val2);
		arrayCase1.add(val3);
		arrayCase1.add(val4);

		for (int[] val : arrayCase1) {
			int resultRecentCalls = recentCounter1.ping(val[0]);
			assertThat(resultRecentCalls)
					.isEqualTo(val[1]);
		}


	}
	@Test
	void ping2() {


		RecentCounter recentCounter1 = new RecentCounter();
		int[] val1 = new int[] {1, 1};
		int[] val3 = new int[] {3002, 1};
		int[] val4 = new int[] {3003, 2};
		List<int[]> arrayCase1 = new ArrayList<>();
		arrayCase1.add(val1);
		arrayCase1.add(val3);
		arrayCase1.add(val4);

		for (int[] val : arrayCase1) {
			int resultRecentCalls = recentCounter1.ping(val[0]);
			assertThat(resultRecentCalls)
					.isEqualTo(val[1]);
		}

	}
}