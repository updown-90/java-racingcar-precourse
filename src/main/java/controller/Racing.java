package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cars;
import model.RacingHistoryPerCars;
import model.RacingResult;

public class Racing {

	public static final int MIN_MOVE_COUNT = 0;

	public static RacingResult racing(List<String> carNames, int moveCount) {
		validateCarNames(carNames);
		validateMoveCount(moveCount);

		Cars cars = new Cars(carNames);
		List<RacingHistoryPerCars> racingHistoryPerCars = new ArrayList<>();

		for (int i = 0; i < moveCount; i++) {
			racingHistoryPerCars.add(cars.move());
		}

		return new RacingResult(racingHistoryPerCars);
	}

	private static void validateCarNames(List<String> carNames) {
		if (carNames == null || carNames.isEmpty()) {
			throw new IllegalArgumentException("[ERROR] 자동차 이름이 입력되지 않았습니다");
		}
	}

	private static void validateMoveCount(int moveCount) {
		if (moveCount <= MIN_MOVE_COUNT) {
			throw new IllegalArgumentException("[ERROR] 시도할 횟수를 1이상으로 입력해주세요");
		}
	}
}
