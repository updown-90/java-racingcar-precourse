package model;

public class RacingHistoryPerCar {

	private String carName;
	private int position;

	public RacingHistoryPerCar(String carName, int position) {
		this.carName = carName;
		this.position = position;
	}

	public String getCarName() {
		return carName;
	}

	public int getPosition() {
		return position;
	}
}
