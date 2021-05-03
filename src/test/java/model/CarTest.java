package model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

	public static final int FORWARD_MOVE_COUNT = 1;
	public static final int STOP_COUNT = 0;
	public static final String TEST_CAR_NAME = "test";
	private final Car car = new Car(TEST_CAR_NAME);

	@Test
	@DisplayName("입력한 이름대로 자동차가 생성되는지 테스트")
	void 자동차_생성_테스트() {
		assertThat(car.getCarName()).isEqualTo(TEST_CAR_NAME);
	}

	@Test
	@DisplayName("자동차 이름이 null 일 경우 Exception 발생하는지 테스트")
	void 자동차_생성_예외처리_테스트_NULL() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
			new Car(null);
		});
	}

	@ParameterizedTest
	@ValueSource(strings = {"", "overNa"})
	@DisplayName("자동차 이름이 빈 문자열 || 5자초과 일 경우 Exception 발생하는지 테스트")
	void 자동차_생성_예외처리_테스트_빈문자열_5자초과(String inputCarName) {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
			new Car(inputCarName);
		});
	}

	@ParameterizedTest
	@ValueSource(ints = {4, 5, 6, 7, 8, 9})
	@DisplayName("난수 값이 4, 5, 6, 7, 8, 9 일경우 전진하는지 테스트")
	void 자동차_전진_테스트(int randomNumber) {
		car.move(randomNumber);
		assertThat(car.getPosition()).isEqualTo(FORWARD_MOVE_COUNT);
	}

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3})
	@DisplayName("난수 값이 0, 1, 2, 3 일경우 정지하는지 테스트")
	void 자동차_정지_테스트(int randomNumber) {
		car.move(randomNumber);
		assertThat(car.getPosition()).isEqualTo(STOP_COUNT);
	}
}
