package util;

import java.util.Random;

public class RandomNumberCreator {

	private static final Random random = new Random();
	private static final int RANDOM_NUMBER_LIMIT = 10;

	public static int from0To9RandomNumber() {
		return random.nextInt(RANDOM_NUMBER_LIMIT);
	}

}
