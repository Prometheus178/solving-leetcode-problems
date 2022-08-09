package easy;

/**
 * Author: Sergey.
 */
public class DigitSum {

    public static void main(String[] args) {
        System.out.println(digit_sum(0));
        System.out.println(digit_sum(-15));
        System.out.println(digit_sum(9));
    }

    public static int digit_sum(long number) {
        if (number < 0) {
            number = number * -1;
        }
        String num = String.valueOf(number);
        char[] digits = num.toCharArray();

        int sum = 0;
        for (char d : digits) {
            sum += d - '0';
        }
        return sum;
    }
}
