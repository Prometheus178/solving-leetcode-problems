package easy;

/**
 * Author: Sergey.
 */
public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 1, 3}));
    }

    /**
     * time complexity = O(n)
     * memory complexity = O(1)
     * @param nums
     * @return
     */
    private static int solve(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int expectedSum = (nums.length * (nums.length + 1)) / 2;
        int countValue = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            countValue += nums[i];
        }
        return expectedSum - countValue;
    }

}
