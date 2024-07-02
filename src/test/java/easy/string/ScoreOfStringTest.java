package easy.string;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class ScoreOfStringTest {

	@Test
	public void test() {
		ScoreOfString scoreOfString = new ScoreOfString();

		Map<String, Integer> testData = new HashMap<>();
		testData.put("hello", 13);
		testData.put("hh", 0);
		testData.put("zaz", 50);

		Set<Map.Entry<String, Integer>> entries = testData.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			int result = scoreOfString.execute(entry.getKey());
			assertThat(result).isEqualTo(entry.getValue());
		}
	}

}