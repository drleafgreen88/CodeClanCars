import dealership.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicles.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    Customer customer;
    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        customer = new Customer(30000.00);
    }

    @Test
    public void customerHasMoney(){
        assertEquals(30000.00, customer.getMoney(), 0.0);
    }

    @Test
    public void customerStartsWithZeroVehicles(){
        assertEquals(0, customer.getVehicles().size());
    }

    @Test
    public void customerCanAddVehicle(){
        engine = new Engine(200);
        tyres = new Tyres("Goodyear");
        car = new Car("Ford Fiesta", 2020, VehicleType.CAR, engine, tyres);
        customer.addVehicle(car);
        assertEquals(1, customer.getVehicles().size());
        assertTrue(customer.getVehicles().get(0) instanceof Car);
    }

    @Test
    public void customerCanBuyVehicle(){
        engine = new Engine(200);
        tyres = new Tyres("Goodyear");
        car = new Car("Ford Fiesta", 2020, VehicleType.CAR, engine, tyres);
        customer.buyVehicle(car);
        assertEquals(1, customer.getVehicles().size());
        assertEquals(10000.00, customer.getMoney(),0.0);
    }
}
