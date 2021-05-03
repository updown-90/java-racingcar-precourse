package model;

public class Car {

	private final String carName;
	private int position;
	private static final int FORWARD_REVERSE_STANDARD_NUMBER = 4;
	private static final int CAR_NAME_MAX_LENGTH = 5;

	public Car(String carName) {
		validateNull(carName);
		validateLength(carName);
		this.carName = carName;
	}

	public void move(int randomNumber) {
		if (randomNumber >= FORWARD_REVERSE_STANDARD_NUMBER) {
			position++;
		}
	}

	private void validateNull(String carName) {
		if (carName == null || carName.isEmpty()) {
			throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
		}
	}

	private void validateLength(String carName) {
		if (carName.length() > CAR_NAME_MAX_LENGTH) {
			throw new IllegalArgumentException("자동차 이름이 5자를 초과하였습니다.");
		}
	}

	public String getCarName() {
		return carName;
	}

	public int getPosition() {
		return position;
	}
}
