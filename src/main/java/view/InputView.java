package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
	private static Scanner SCANNER = new Scanner(System.in);
	public static final String SPLIT_SEPARATOR = ",";

	public static List<String> scannerUserInputCarsNames() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

		return Arrays.asList(SCANNER.next().split(SPLIT_SEPARATOR));
	}

	public static int scannerUserInputRacingCount() {
		System.out.println("시도할 회수는 몇회인가요 ?");
		
		return SCANNER.nextInt();
	}
}
