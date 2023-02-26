package easy;

import java.io.*;
import java.util.Arrays;

/**
 * Time complexity O(N)
 * Space complexity O(1)
 * Author: Sergey.
 */
public class OptimalLoading {

    public static void main(String[] args) throws IOException {
        System.out.println(solve(new int[]{10, 52, 42, 11}, 2, 1)); // 2
        System.out.println(solve(new int[]{42, 47, 40, 49, 42}, 13, 0)); // 4
        System.out.println(solve(new int[]{42 }, 0, 0)); // 0
    }

    public static int solve(int[] capacities, int n10, int n50) {
        int count = 0;
        if (n10 == 0 && n50 == 0){
            return count;
        }
        Arrays.sort(capacities);
        for (int i = capacities.length - 1; i >= 0; i--) {
            int remainingCapacity = capacities[i];
            while (remainingCapacity >= 50 && n50 > 0) {
                remainingCapacity -= 50;
                n50--;
            }
            while (remainingCapacity >= 10 && n10 > 0) {
                remainingCapacity -= 10;
                n10--;
            }
            if (n10 == 0 && n50 == 0) {
                return count + 1;
            }
            count++;
        }
        return -1;
    }
}
