package model;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingResultTest {

	RacingHistoryPerCars racingHistoryPerCars = new RacingHistoryPerCars(
		Arrays.asList(
			new RacingHistoryPerCar("car1", 1),
			new RacingHistoryPerCar("car2", 1),
			new RacingHistoryPerCar("car3", 1)
		)
	);

	RacingHistoryPerCars racingHistoryPerCars1 = new RacingHistoryPerCars(
		Arrays.asList(
			new RacingHistoryPerCar("car1", 1),
			new RacingHistoryPerCar("car2", 2),
			new RacingHistoryPerCar("car3", 2)
		)
	);

	RacingHistoryPerCars racingHistoryPerCars2 = new RacingHistoryPerCars(
		Arrays.asList(
			new RacingHistoryPerCar("car1", 1),
			new RacingHistoryPerCar("car2", 2),
			new RacingHistoryPerCar("car3", 3)
		)
	);

	RacingResult racingResult = new RacingResult(
		Arrays.asList(racingHistoryPerCars, racingHistoryPerCars1, racingHistoryPerCars2));

	@Test
	@DisplayName("N번의 레이싱 결과 생성 테스트")
	void N번의_레이싱_결과_생성_테스트() {
		assertThat(racingResult.getTotalRacingHistoryPerTurn().size()).isEqualTo(3);
	}

	@Test
	@DisplayName("N번의_레이싱_결과_에서_우승자_테스트")
	void N번의_레이싱_결과_에서_우승자_테스트() {
		assertThat(racingResult.getWinnerNames().get(0)).isEqualTo("car3");
	}
}
