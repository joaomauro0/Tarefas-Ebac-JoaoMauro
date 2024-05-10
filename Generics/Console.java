import java.util.ArrayList;
import java.util.List;

public class Console<T> {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new ToyotaCorola("Toyota Corolla", "Red", 50000));
        carList.add(new Ferrari("Ferrari 488", "Yellow", 20000));
        carList.add(new Lamborghini("Lamborghini Aventador", "Green", 8000));
        info(carList);
    }

    public static void info(List<? extends Car> carList) {
        for (Car car : carList) {
            car.info();
        }
    }
}