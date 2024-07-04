package easy.stack;

import java.util.Stack;

public class MaxDepth {

	/**
	 * String contains parentheses with numbers and +- , maybe not ,
	 * we need to find the depth of parentheses
	 * <p>
	 * Constrains:
	 * 1 <= s.length <= 100
	 * s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
	 * guaranteed that they are parentheses closed
	 *
	 *
	 * space O(N)
	 * time O(N)
	 * @return {@link int}
	 */
	public int execute(String s) {
		//split s to charArray
		char[] charArray = s.toCharArray();
		// we need to iterate

		// ()
		// ( (( )))
		// ( ( ) ( ) (()))
		int counterMaxDepth = 0;
		Stack<Character> parentheses = new Stack<>();
		for (char curChar : charArray) {
			//collect to stack ()
			// put if '(' ')'
			if (curChar == '(' || curChar == ')') {
				if (!parentheses.empty()) {
					Character prevChar = parentheses.peek();
					// if previous '(' and current ')' , remove
					if (prevChar == '(' && curChar == ')') {
						parentheses.pop();
					} else {
						// if not put in stack and update counter of max size of stack
						parentheses.add(curChar);
						if (parentheses.size() > counterMaxDepth){
							counterMaxDepth = parentheses.size();
						}
					}
				} else {
					parentheses.add(curChar);
					if (parentheses.size() > counterMaxDepth){
						counterMaxDepth = parentheses.size();
					}
				}
			}
			System.out.println(parentheses);
		}
		System.out.println("________");
		return counterMaxDepth;
	}
}
