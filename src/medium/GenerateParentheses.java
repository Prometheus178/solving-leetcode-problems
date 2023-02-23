package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Time complexity O(4^n/sqrt(n))
 * Space complexity O(4^n/sqrt(n))
 * Author: Sergey.
 */
public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> res = solve(3);
        System.out.println(res);
    }

    public static List<String> solve(int n){
        List<String> res = new ArrayList<>();
        generate("", n , n , res);
        return res;
    }

    private static void generate(String parenteses, int open, int close, List<String> res) {
        if (open == 0 && close == 0){
            res.add(parenteses);
            return;
        }
        if (open > 0){
            generate(parenteses + "(", open-1, close, res);
        }
        if (close > open){
            generate(parenteses + ")", open, close-1,res );
        }


    }

}
