package ParkingLot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bryan on 2015/5/24.
 */
public class ParkingLot {

    public ParkingLot(int capacity) {
        _capacity = capacity;
    }

    public CarParkingTicket park(Car car) {
        if (_capacity <= _cars.size())
            return null;

        CarParkingTicket ticket = new CarParkingTicket();
        _cars.put(ticket, car);
        return ticket;
    }

    public Car unPark(CarParkingTicket ticket) {
        Car car = _cars.remove(ticket);
        return car;
    }

    private final int _capacity;
    private Map<CarParkingTicket, Car> _cars = new HashMap<CarParkingTicket, Car>();
}