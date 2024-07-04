package easy.stack;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Java6Assertions.assertThat;

class MaxDepthTest {

	@Test
	void execute() {
		Map<String, Integer> examples = new HashMap<>();
		examples.put("(1+(2*3)+((8)/4))+1", 3);
		examples.put("(1)+((2))+(((3)))", 3);
		examples.put("()(())((()()))", 3);
		examples.put("1", 0);
		examples.put("()", 1);
		examples.put("(())", 2);
		examples.put("()(())", 2);

		examples.put("8*((1*(5+6))*(8/6))", 3);
		examples.put("((())())", 3);
		examples.put("((1-4)/4)/(8-6-7)", 2);
		examples.put("(())()", 2);

		MaxDepth maxDepth = new MaxDepth();
		for (Map.Entry<String, Integer> entry : examples.entrySet()) {
			int result = maxDepth.execute(entry.getKey());
			assertThat(result).isEqualTo(entry.getValue());
		}

	}
}