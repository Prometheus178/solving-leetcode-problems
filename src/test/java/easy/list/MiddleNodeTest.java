package easy.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class MiddleNodeTest {

	@Test
	void execute() {
		ListNode listNode5 = new ListNode(5);
		ListNode listNode4  = new ListNode(4, listNode5);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);


		MiddleNode middleNode = new MiddleNode();
		ListNode executed = middleNode.execute(listNode1);
		assertThat(executed.val).isEqualTo(3);
	}
}