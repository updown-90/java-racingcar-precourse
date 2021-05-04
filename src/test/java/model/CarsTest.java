package model;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

	public static final int FORWARD_MOVE_COUNT = 1;
	public static final int STOP_COUNT = 0;
	private final List<String> carNames = Arrays.asList("car1", "car2", "car3", "car4", "car5", "car6");
	private final Cars cars = new Cars(carNames);

	@Test
	@DisplayName("입력한 N개의 자동차 이름만큼 N대 자동차 생성되는지 테스트")
	void N대_자동차_생성_테스트() {
		assertThat(cars.getCars().size()).isEqualTo(carNames.size());
	}

	@Test
	@DisplayName("4, 5, 6, 7, 8, 9 가 난수로 나왔을경우 전진하는지 테스트")
	void N대_자동차_전진_테스트() {
		cars.move(cars, Arrays.asList(4, 5, 6, 7, 8, 9));
		for (int i = 0; i < cars.getCars().size(); i++) {
			assertThat(cars.getCars().get(i).getPosition()).isEqualTo(FORWARD_MOVE_COUNT);
		}
	}

	@Test
	@DisplayName("0, 1, 2, 3 이 난수로 나왔을경우 정지하는지 테스트")
	void N대_자동차_정지_테스트() {
		cars.move(cars, Arrays.asList(0, 1, 2, 3, 0, 1));
		for (int i = 0; i < cars.getCars().size(); i++) {
			assertThat(cars.getCars().get(i).getPosition()).isEqualTo(STOP_COUNT);
		}
	}

}
