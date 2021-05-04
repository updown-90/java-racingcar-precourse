import java.util.List;

import controller.Racing;
import model.RacingResult;
import view.InputView;
import view.ResultView;

public class RacingCarApplication {
	public static void main(String[] args) {
		List<String> carNames = InputView.scannerUserInputCarsNames();
		RacingResult racingResult = Racing.racing(carNames, InputView.scannerUserInputRacingCount());

		ResultView.printRacingHistory(racingResult);
		ResultView.printWinnerNames(racingResult);
	}
}
