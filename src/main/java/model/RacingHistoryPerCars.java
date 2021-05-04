package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(racingHistoryPerCars);
	}
}
