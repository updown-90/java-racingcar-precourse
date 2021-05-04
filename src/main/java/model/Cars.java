package model;

import java.util.ArrayList;
import java.util.List;

import util.RandomNumberCreator;

public class Cars {

	private final List<Car> cars;

	public Cars(List<String> cars) {
		this.cars = createCars(cars);
	}

	private List<Car> createCars(List<String> carNames) {
		List<Car> carList = new ArrayList<>();

		for (String carName : carNames) {
			carList.add(new Car(carName));
		}

		return carList;
	}

	public RacingHistoryPerCars move() {
		List<RacingHistoryPerCar> racingHistoryPerTurn = new ArrayList<>();

		for (Car car : cars) {
			car.move(RandomNumberCreator.from0To9RandomNumber());
			racingHistoryPerTurn.add(new RacingHistoryPerCar(car.getCarName(), car.getPosition()));
		}

		return new RacingHistoryPerCars(racingHistoryPerTurn);
	}

	public List<Car> getCars() {
		return cars;
	}

	// 테스트 용으로 만든 메소드
	protected void move(Cars cars, List<Integer> randomNumbers) {
		for (int i = 0; i < cars.getCars().size(); i++) {
			cars.getCars().get(i).move(randomNumbers.get(i));
		}
	}

}
