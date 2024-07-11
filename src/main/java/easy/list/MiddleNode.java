package easy.list;

/**
 * Given single linked list , and we need to return middle node , if 2 middle node return 2
 * <p>
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * <p>
 * Example 2:
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * <p>
 * <p>
 * Constraints:
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 */
public class MiddleNode {

	/**
	 * time O(N)
	 * space O(1)
	 *
	 * @param head head
	 * @return {@link ListNode}
	 * @see ListNode
	 */
	public ListNode execute(ListNode head) {
		// we need to iterate from 1 node to N-end node and count amount nodes
		// than divide to 2 and add + 1 to result
		// 6 / 2 = 3 + 1 = 4
		// 5 / 2 = 2 + 1 = 3
		//iterate again until middle and return middle node
		int nodeValue = 0;
		ListNode cur = head;
		while (cur != null) {
			nodeValue ++;
			cur = cur.next;
		}

		int middleNode = (nodeValue / 2) + 1;

		ListNode cur2 = head;
		nodeValue = 0;
		while (cur2 != null) {
			nodeValue ++;
			if (middleNode == nodeValue) {
				break;
			}
			cur2 = cur2.next;
		}
		return cur2;
	}

	public ListNode execute1(ListNode head) {
		// [1,2,3,4,5,6]
		//
		return new ListNode();
	}

}
