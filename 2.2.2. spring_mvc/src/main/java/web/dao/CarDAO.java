package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Nissan", 120, "Black"));
        cars.add(new Car("Opel", 100, "Blue"));
        cars.add(new Car("Kia", 150, "White"));
        cars.add(new Car("Subaru", 300, "Red"));
        cars.add(new Car("LADA", 90, "Rhavaya"));
    }


    public List<Car> index(String count) {
        if (count == null) {
            return cars;
        } else {
            int i = Integer.parseInt(count);
            return i < 5 ? cars.subList(0, i) : cars;
        }
    }
}
