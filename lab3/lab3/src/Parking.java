import java.util.HashMap;
import java.util.Map;

public class Parking {
    
    private Map<String, Car> cars;

    public Parking() {
        this.cars = new HashMap<>();
    }

    public void addCar(String licensePlate, Car car) {
        cars.put(licensePlate, car);
        System.out.println("Автомобиль добавлен на парковку");
        System.out.println("Регистрационный номер: " + licensePlate);
        System.out.println("Автомобиль: " + car.brand + " " + car.model + " "+ car.year);
    }

    public Car findCar(String licensePlate) {
        Car car = cars.get(licensePlate);
        if (car != null) {
            System.out.println("Автомобиль присутствует на парковке");
        } else {
            System.out.println("Автомобиль с данным регистрационным номером не найден");
        }
        return car;
    }

    public Car removeCar(String licensePlate) {
        Car removedCar = cars.remove(licensePlate);
        if (removedCar != null) {
            System.out.println("Автомобиль с регистрационным номером " + licensePlate + " удален из парковки");
        } else {
            System.out.println("Автомобиль с данным регистрационным номером не найден");
        }
        return removedCar;
    }
}
