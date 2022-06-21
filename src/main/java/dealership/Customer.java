package dealership;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {


    private double money;
    private ArrayList <Vehicle> vehicles;

    public Customer(double money) {
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        addVehicle(vehicle);
        money -= vehicle.getVehicleType().getInitialPrice();
    }
}
