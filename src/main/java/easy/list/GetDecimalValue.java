package easy.list;

import java.util.ArrayList;
import java.util.List;

public class GetDecimalValue {

	/**
	 * The binary values ( 0 or 1) from nodes convert to decimal
	 * <p>
	 * constraints
	 * 0 < length of list is <= 30
	 * always expect 0 or 1
	 * <p>
	 * [1,0,1]  = 5
	 * [0] = 0
	 * [1 , 0 ] = 2
	 * [ 1 ,1 ] = 3
	 *
	 * time complexity O(N)
	 * space complextiy O(N) but we actually can do in O(1);
	 * @param head head
	 * @return {@link int}
	 */
	public int execute(ListNode head) {
		// to get values from list in order
		List<Integer> integers = new ArrayList<>();

		ListNode cur = head;
		while (cur != null) {
			integers.add(cur.val);
			cur = cur.next;
		}
		System.out.println(integers);

		// convert binary to decimal
		StringBuilder binary = new StringBuilder();
		for (int i = 0; i < integers.size(); i++) {
			binary.append(integers.get(i));
		}
		int resultNum = Integer.parseInt(binary.toString(), 2);
		return resultNum;
	}
}
