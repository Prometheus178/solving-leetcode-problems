package easy.hash.table;

import java.util.HashMap;
import java.util.Map;

public class FindPermutationDifference {

	/**
	 * to find differences between s and t where characters in t move from position in s
	 * return abs value of moving
	 * <p>
	 * <p>
	 * 1 <= s.length <= 26
	 * Each character occurs at most once in s.
	 * t is a permutation of s.
	 * s consists only of lowercase English letters.
	 * <p>
	 * <p>
	 * Input: s = "abc", t = "bac"
	 * Output: 2
	 * <p>
	 * <p>
	 * Input: s = "abcde", t = "edbac"
	 * Output: 12
	 *
	 * @param s s
	 * @param t t
	 * @return {@link int}
	 */
	public int execute(String s, String t) {
		// split string s and to chars[]
		char[] charArrayS = s.toCharArray();
		char[] charArrayT = t.toCharArray();

		// save in map the position of char t in array by  iteration
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charArrayT.length; i++) {
			map.put(charArrayT[i], i);
		}

		// than we need to iterate s array  (
		// in iteration count
		// find char in map and  abs(substring index value from index value from map) and add to previous result
		// resultSum = |a - a| + |b - b + |c - c|
		// resultSum = |0 - 1| + |2 - 2| + |1 - 0|
		// )
		int resultSum = 0;
		for (int i = 0; i < charArrayS.length; i++) {
			char ch = charArrayS[i];
			Integer charIndexInT = map.get(ch);
			int currentDiff = Math.abs(i - charIndexInT);
			resultSum = resultSum + currentDiff;
		}
		return resultSum;
	}
}
