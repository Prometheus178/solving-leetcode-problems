package easy.string;

import java.util.ArrayList;
import java.util.List;

public class ScoreOfString {



	/**
	 * count sum.  from each char get ascii code number and substract from the next char ascii code and all of
	 * them count
	 *
	 * hello -> h e l l o
	 * h e l l o  -> 104 101 108 108 111
	 * 104 101 108 108 111 -> |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111|
	 * |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| -> 3 + 7 + 0 + 3 = 13
	 *
	 * hh -> h h
	 *
	 * a -> is not VALID!!
	 * @param s 2 <= s.length < =100  hello
	 * @return {@link int} 13
	 */
	public int execute(String s){
		int resultSum = 0;
		//split to char
		char[] charArray = s.toCharArray();
		// tranlate letters to numbers
		List<Integer> integers = new ArrayList<>(charArray.length);
		for (char ch: charArray) {
			integers.add((int) ch);
		}

		//  in cycle .current number substract by next and make the result sum as module to remove minus .
		//  the result sum add to previous results;
		//[104, 101, 108, 108, 111]
		for (int i = 1; i < integers.size(); i++) {
			int sum = Math.abs(integers.get(i - 1) - integers.get(i));
			resultSum = resultSum + sum;
		}
		
		return resultSum;
	}
}
