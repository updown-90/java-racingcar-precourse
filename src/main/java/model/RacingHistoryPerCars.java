package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingHistoryPerCars {

	private List<RacingHistoryPerCar> racingHistoryPerCars;

	public RacingHistoryPerCars(List<RacingHistoryPerCar> racingHistoryPerCars) {
		this.racingHistoryPerCars = racingHistoryPerCars;
	}

	public List<RacingHistoryPerCar> getRacingHistoryPerCars() {
		return racingHistoryPerCars;
	}

	public int maxPosition() {
		List<Integer> positionList = new ArrayList<>();

		for (RacingHistoryPerCar racingHistoryPerCar : racingHistoryPerCars) {
			positionList.add(racingHistoryPerCar.getPosition());
		}

		return Collections.max(positionList);
	}
}
