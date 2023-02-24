package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Time complexity O(n log n)
 * Space complexity O(n)
 * Author: Sergey.
 */
public class IntervalListIntersections {

    public static void main(String[] args) {
        int[][] list1 = new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] list2 = new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] res = solve(list1, list2);
        Arrays.stream(res)
                .forEach(a -> System.out.println(Arrays.toString(a)));

    }

    private static int[][] solve(int[][] firstList, int[][] secondList) {
        List<int[]> merged = new ArrayList<>();
        List<int[]> oneList = new ArrayList<>(firstList.length + firstList.length);
        oneList.addAll(Arrays.asList(firstList));
        oneList.addAll(Arrays.asList(secondList));
        oneList.sort(Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < oneList.size(); i++) {
            int[] ints = oneList.get(i);
            int start = ints[0];

            if (i > 0 && start <= oneList.get(i - 1)[1]) {
                int[] intersection = new int[2];
                intersection[0] = start;
                intersection[1] = oneList.get(i - 1)[1];
                merged.add(intersection);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

}
