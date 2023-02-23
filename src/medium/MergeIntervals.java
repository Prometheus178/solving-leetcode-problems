package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Time complexity O(n * Log n )
 * Space complexity O(n)
 * Author: Sergey.
 */
public class MergeIntervals {

    public static void main(String[] args) {
      int[][] res =  solve(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        Arrays.stream(res)
                .forEach(a -> System.out.println(Arrays.toString(a)));
    }

    private static int[][] solve(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (i > 0 && start <= merged.get(merged.size() - 1)[1]) {
                int[] prevInterval = merged.get(merged.size() - 1);
                prevInterval[1] = Math.max(prevInterval[1], end);
            } else {
                merged.add(new int[]{start, end});
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}

