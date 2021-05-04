package controller;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.RacingHistoryPerCars;
import model.RacingResult;

class RacingTest {

	public static final int MOVE_COUNT = 5;
	private final List<String> carNames = Arrays.asList("car1", "car2", "car3");

	@Test
	@DisplayName("N대의 자동차로 N번의 레이싱이 완료되어 히스토리가 만들어졌는지 테스트")
	void 생성_테스트() {
		RacingResult racingResult = Racing.racing(carNames, MOVE_COUNT);

		for (RacingHistoryPerCars racingHistoryPerCars : racingResult.getTotalRacingHistoryPerTurn()) {
			assertThat(racingHistoryPerCars.getRacingHistoryPerCars().size()).isEqualTo(carNames.size());
		}

		assertThat(racingResult.getTotalRacingHistoryPerTurn().size()).isEqualTo(MOVE_COUNT);
	}

	@Test
	@DisplayName("자동차 이름이 null일 경우 Exception 발생하는지 테스트")
	void 예외처리_테스트_NULL() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
			Racing.racing(null, 1);
		});
	}

	@Test
	@DisplayName("자동차 이름이 빈 리스트일 경우 Exception 발생하는지 테스트")
	void 예외처리_테스트_EMPTY() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
			Racing.racing(new ArrayList<>(), 1);
		});
	}

	@Test
	@DisplayName("시도할 횟수가 0보다 작을 경우 Exception 발생하는지 테스트")
	void 예외처리_테스트_시도할횟수_0() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
			Racing.racing(carNames, 0);
			Racing.racing(carNames, -1);
		});
	}
}
