package model;

import java.util.ArrayList;
import java.util.List;

public class RacingResult {

	private List<String> winnerNames;
	private final int maxPosition;
	private final List<RacingHistoryPerCars> totalRacingHistoryPerCars;

	public RacingResult(List<RacingHistoryPerCars> totalRacingHistoryPerCars) {
		this.totalRacingHistoryPerCars = totalRacingHistoryPerCars;
		this.maxPosition = racingHistoryLastTurnCars().maxPosition();
		this.winnerNames = calculateWinners();
	}

	public List<String> calculateWinners() {
		List<String> calculateWinnerNames = new ArrayList<>();

		for (RacingHistoryPerCar racingHistoryPerCar : racingHistoryLastTurnCars().getRacingHistoryPerCars()) {
			calculateWinner(calculateWinnerNames, racingHistoryPerCar);
		}

		return calculateWinnerNames;
	}

	private void calculateWinner(List<String> calculateWinnerNames, RacingHistoryPerCar racingHistoryPerCar) {
		if (racingHistoryPerCar.getPosition() == maxPosition) {
			calculateWinnerNames.add(racingHistoryPerCar.getCarName());
		}
	}

	private RacingHistoryPerCars racingHistoryLastTurnCars() {
		return totalRacingHistoryPerCars.get(totalRacingHistoryPerCars.size() - 1);
	}

	public List<String> getWinnerNames() {
		return winnerNames;
	}

	public List<RacingHistoryPerCars> getTotalRacingHistoryPerTurn() {
		return totalRacingHistoryPerCars;
	}

}
