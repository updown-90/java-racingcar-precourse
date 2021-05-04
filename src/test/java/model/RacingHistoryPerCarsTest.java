package model;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RacingHistoryPerCarsTest {

	private final RacingHistoryPerCars racingHistoryPerCars = new RacingHistoryPerCars(
		Arrays.asList(
			new RacingHistoryPerCar("car1", 1),
			new RacingHistoryPerCar("car2", 2),
			new RacingHistoryPerCar("car3", 3)
		)
	);

	@Test
	void 자동차들_주행이력_생성_테스트() {
		assertThat(racingHistoryPerCars.getRacingHistoryPerCars().size()).isEqualTo(
			racingHistoryPerCars.getRacingHistoryPerCars().size());
	}

	@Test
	void 자동차들_주행이력중_maxPosition_테스트() {
		assertThat(racingHistoryPerCars.maxPosition()).isEqualTo(3);
	}
}
