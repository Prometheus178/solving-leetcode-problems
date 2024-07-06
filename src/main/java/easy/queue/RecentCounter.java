package easy.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * recent counter
 * We need to return count of recentPing in range 3000 ms from current recentPing
 * <p>
 * constraints:
 * 1 <= currentPing <= 10^9
 * each recentPing strictly increasing g number
 * At most 10^4 calls will be made to ping
 * <p>
 * Input
 * ["RecentCounter", "ping", "ping", "ping", "ping"]
 * [[], [1], [100], [3001], [3002]]
 * Output
 * [null, 1, 2, 3, 3]
 * <p>
 * *  * Input
 * *  * [ [1], [3001], [3002]]
 * *  * Output
 * *  * [ 1, 1 , 2]
 *
 * memory O(N)
 * time O(N)
 */


public class RecentCounter {

	private Queue<Integer> recentPings;

	public RecentCounter() {
		recentPings = new ArrayDeque<>();
	}

	/**
	 * we need to store calls in queue
	 * if queue is empty just store
	 * if not empty check all queue from current value of is it in range 3000?{
	 * * //how to check range of 3000
	 * 1 , 2
	 * 2 - 1 < 3000
	 * 1 , 500
	 * 500 -1 < 3000
	 * 4000 - 1 > 3000
	 * 3100 - 1 > 3000
	 * 3000 - 1 <= 3000
	 * <p>
	 * }
	 * and then add current value in queue
	 * <p>
	 * and then return size of queue
	 *
	 * @param currentPing currentPing
	 * @return {@link int}
	 */
	public int ping(int currentPing) {
		if (recentPings.isEmpty()){
			recentPings.add(currentPing);
			return recentPings.size();
		}

		Queue<Integer> tempCalls = new ArrayDeque<>();
		while (!recentPings.isEmpty()){
			Integer recentPing = this.recentPings.poll();
			if (currentPing - recentPing <= 3000){
				tempCalls.add(recentPing);
			}
		}
		tempCalls.add(currentPing);
		recentPings = tempCalls;

		return recentPings.size();
	}
}
