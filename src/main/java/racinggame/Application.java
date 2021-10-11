package racinggame;

import controller.Racing;
import model.RacingResult;
import view.InputView;
import view.ResultView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.scannerUserInputCarsNames();
        RacingResult racingResult = Racing.racing(carNames, InputView.scannerUserInputRacingCount());

        ResultView.printRacingHistory(racingResult);
        ResultView.printWinnerNames(racingResult);
    }
}
