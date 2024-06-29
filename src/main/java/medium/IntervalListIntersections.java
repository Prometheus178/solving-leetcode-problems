package medium;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println("-----");
        int[][] list3 = new int[][]{{5, 10}};
        int[][] list4 = new int[][]{{5, 6}};
        int[][] res1 = solve(list3, list4);
        Arrays.stream(res1)
                .forEach(a -> System.out.println(Arrays.toString(a)));

    }

    private static int[][] solve(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();

        int n1 = firstList.length;
        int n2 = secondList.length;

        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            int firstStart = firstList[i][0];
            int firstEnd = firstList[i][1];
            int secondStart = secondList[j][0];
            int secondEnd = secondList[j][1];


            if (firstStart <= secondStart && secondStart <= firstEnd
                    || secondStart <= firstStart && firstStart <= secondEnd) {
                int start = Math.max(firstStart, secondStart);
                int end = Math.min(firstEnd, secondEnd);
                int[] intersection = {start, end};
                result.add(intersection);
            }
            if (secondEnd > firstEnd){
                i++;
            }else {
                j++;
            }
        }
        return result.toArray(new int[result.size()][]);
        }
    }
