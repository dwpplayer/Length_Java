import ParkingLot.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by bryan on 2015/5/24.
 */
public class LengthTest {
    @Test
    public void should_park_car_when_parkinglot_has_empty_parking_place() {
        ParkingLot parkinglot = new ParkingLot(1);
        Car car = new Car();
        assertNotEquals(null, parkinglot.park(car));
    }

    @Test
    public void should_unpark_car_when_the_car_in_the_parkinglot(){
        ParkingLot parkinglot = new ParkingLot(1);
        Car car = new Car();
        CarParkingTicket ticket = parkinglot.park(car);
        assertEquals(car, parkinglot.unPark(ticket));
    }

    @Test
    public void should_not_park_car_in_parkinglot_when_parkinglot_is_full(){
        ParkingLot parkinglot = new ParkingLot(0);
        Car car = new Car();
        assertEquals(null, parkinglot.park(car));
    }

    @Test
    public void should_unpark_one_car_only_once_when_the_car_in_the_parkinglot(){
        ParkingLot parkinglot = new ParkingLot(1);
        Car car = new Car();
        CarParkingTicket ticket = parkinglot.park(car);
        assertEquals(car, parkinglot.unPark(ticket));
        assertEquals(null, parkinglot.unPark(ticket));
    }
}
