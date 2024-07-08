package easy.dynamic.programming;

/**
 * Time complexity O(n)
 * Memory complexity O(1)
 * Author: Sergey.
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(solve(5));
    }

    public static int solve(int n) {
        int cur = 1;
        int previous = 1;
        for (int i = 1; i <= n; i++) {
            int temp = cur;
            cur = cur + previous;
            previous = temp;
        }
        return previous;
    }
}
