package easy;

/**
 * Time complexity O(n)
 * Space complexity O(1)
 * Author: Sergey.
 */
public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 1, 2, 1, 2}));
    }

    public static int solve(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
