package util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumberCreatorTest {

	public static final int RANDOM_MIN_NUMBER = 0;
	public static final int RANDOM_MAX_NUMBER = 9;

	@Test
	@DisplayName("난수가 0 부터 9 까지 수인지 테스트")
	void 난수가_0_9_까지_수인지() {
		int number = RandomNumberCreator.from0To9RandomNumber();
		assertThat(number >= RANDOM_MIN_NUMBER && number <= RANDOM_MAX_NUMBER);
	}
}