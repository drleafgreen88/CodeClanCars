import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Tyres;
import vehicles.VehicleType;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;


    @Before
    public void before(){
        tyres = new Tyres("Goodyear");
        engine = new Engine(200);
        car = new Car("Ford Fiesta", 2020, VehicleType.CAR, engine, tyres);
    }

    @Test
    public void hasModel(){
        assertEquals("Ford Fiesta", car.getModel());
    }

    @Test
    public void hasYear(){
        assertEquals(2020, car.getYear());
    }

    @Test
    public void hasVehicleType(){
        assertEquals(VehicleType.CAR, car.getVehicleType());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void hasPrice(){
        assertEquals(VehicleType.CAR.getInitialPrice(), car.getVehicleType().getInitialPrice(), 0.0);
    }

    @Test
    public void hasConsumption(){
        assertEquals(VehicleType.CAR.getConsumption(), car.getVehicleType().getConsumption());
    }

    @Test
    public void hasTyreBrand(){
        assertEquals("Goodyear", car.getTyres().getBrand());
    }

    @Test
    public void hasEngineHorsePower(){
        assertEquals(200, car.getEngine().getHorsePower());
    }

    @Test
    public void hasCurrentPrice(){
        assertEquals(20000.00, car.getCurrentPrice(), 0.0);
    }

    @Test
    public void canGetDamage(){
        car.damage(0.5);
        assertEquals(10000.00, car.getCurrentPrice(), 0.0);
    }

    @Test
    public void canRepairVehicle(){
        car.damage(0.5);
        car.repair(5000.00);
        assertEquals(15000.00, car.getCurrentPrice(), 0.0);
    }
}
