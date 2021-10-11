package view;

import model.RacingHistoryPerCar;
import model.RacingHistoryPerCars;
import model.RacingResult;

public class ResultView {

	public static final String WINNER_CAR_NAMES_DELIMITER = ", ";
	public static final String CAR_NAME_AND_POSITION_DELIMITER = " : ";
	public static final String CAR_POSITION_SYMBOL = "-";

	public static void printWinnerNames(RacingResult racingResult) {
		System.out.print("최종 우승자는 ");
		System.out.print(String.join(WINNER_CAR_NAMES_DELIMITER, racingResult.getWinnerNames()) + " 입니다.");
	}

	public static void printRacingHistory(RacingResult racingResult) {
		for (RacingHistoryPerCars racingHistoryPerCars : racingResult.getTotalRacingHistoryPerTurn()) {
			printRacingHistoryPerCars(racingHistoryPerCars);
			System.out.println();
		}
	}

	private static void printRacingHistoryPerCars(RacingHistoryPerCars racingHistoryPerCars) {
		for (RacingHistoryPerCar racingHistoryPerCar : racingHistoryPerCars.getRacingHistoryPerCars()) {
			printRacingHistoryPercarPosition(racingHistoryPerCar);
		}
	}

	private static void printRacingHistoryPercarPosition(RacingHistoryPerCar racingHistoryPerCar) {
		System.out.print(racingHistoryPerCar.getCarName() + CAR_NAME_AND_POSITION_DELIMITER);
		for (int i = 0; i < racingHistoryPerCar.getPosition(); i++) {
			System.out.print(CAR_POSITION_SYMBOL);
		}
		System.out.println();
	}
}
