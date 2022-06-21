import dealership.Dealer;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Tyres;
import vehicles.VehicleType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealerTest {

    Dealer dealer;
    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        dealer = new Dealer(75000.00);
    }

    @Test
    public void dealerHasTill(){
        assertEquals(75000.00, dealer.getTill(), 0.0);
    }

    @Test
    public void dealerStartsWithZeroVehicles(){
        assertEquals(0, dealer.getVehicles().size());
    }

    @Test
    public void dealerCanAddVehicle(){
        engine = new Engine(200);
        tyres = new Tyres("Goodyear");
        car = new Car("Ford Fiesta", 2020, VehicleType.CAR, engine, tyres);
        dealer.addVehicle(car);
        assertEquals(1, dealer.getVehicles().size());
        assertTrue(dealer.getVehicles().get(0) instanceof Car);
    }

    @Test
    public void dealerCanBuyVehicle(){
        engine = new Engine(200);
        tyres = new Tyres("Goodyear");
        car = new Car("Ford Fiesta", 2020, VehicleType.CAR, engine, tyres);
        dealer.buyVehicle(car);
        assertEquals(1, dealer.getVehicles().size());
        assertEquals(65000.00, dealer.getTill(),0.0);
    }

    @Test
    public void dealerCanSellVehicle(){
        engine = new Engine(200);
        tyres = new Tyres("Goodyear");
        car = new Car("Ford Fiesta", 2020, VehicleType.CAR, engine, tyres);
        dealer.sellVehicle(car);
        assertEquals(0, dealer.getVehicles().size());
        assertEquals(95000.00, dealer.getTill(),0.0);
    }

    @Test
    public void dealerCanRepairVehicle(){
        engine = new Engine(200);
        tyres = new Tyres("Goodyear");
        car = new Car("Ford Fiesta", 2020, VehicleType.CAR, engine, tyres);
        dealer.buyVehicle(car);
        dealer.getVehicles().get(0).damage(0.5);
        dealer.getVehicles().get(0).repair(5000.00);
        assertEquals(15000.00, dealer.getVehicles().get(0).getCurrentPrice(), 0.0);
    }
}
