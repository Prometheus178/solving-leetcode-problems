package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Sergey.
 */
public class JumpOverNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.addAll(Arrays.asList(new Integer[]{3, 4, 1, 2, 5, 6, 9, 0, 1, 2, 3, 1}));
        System.out.println(jump_over_numbers(objects));
        ArrayList<Integer> objects1 = new ArrayList<>();
        objects1.add(0);
        System.out.println(jump_over_numbers(objects1));
        ArrayList<Integer> objects3 = new ArrayList<>();
        objects3.add(2);
        System.out.println(jump_over_numbers(objects3));
        ArrayList<Integer> objects2 = new ArrayList<>();
        objects2.addAll(Arrays.asList(new Integer[]{2,4,0, 4,1}));
        System.out.println(jump_over_numbers(objects2));
    }

    public static int jump_over_numbers(List<Integer> list) {
        List<Integer> count = new ArrayList();
        int cnt = 0;
        if (list.size() == 1){
            return list.size();
        }
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (value == 0) {
                return -1;
            }

            if (list.size() - 1 < value && list.size() != 1) {
                return -1;
            } else {
                count.add(value);
                cnt = cnt + value;
                i = cnt;
                i = i - 1;
            }
        }
        return count.size();
    }

}
