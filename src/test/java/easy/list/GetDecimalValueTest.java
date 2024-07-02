package easy.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class GetDecimalValueTest {

	/**
	 * execute
	 * * [1,0,1]  = 5
	 * * [0] = 0
	 * * [1 , 0 ] = 2
	 * * [ 1 ,1 ] = 3
	 */
	@Test
	void execute() {

		ListNode node00 = new ListNode(0);

		ListNode node10 = new ListNode(0);
		ListNode node11 = new ListNode(1, node10);

		ListNode node20 = new ListNode(1);
		ListNode node21 = new ListNode(1, node20);

		GetDecimalValue getDecimalValue = new GetDecimalValue();
		int decimalResult0 = getDecimalValue.execute(node00);
		assertThat(decimalResult0)
				.isEqualTo(0);

		int decimalResult = getDecimalValue.execute(node11);
		assertThat(decimalResult)
				.isEqualTo(2);

		int decimalResult2 = getDecimalValue.execute(node21);
		assertThat(decimalResult2)
				.isEqualTo(3);
	}
}