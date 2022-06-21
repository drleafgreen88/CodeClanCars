package dealership;


import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealer {

    private double till;
    private ArrayList<Vehicle> vehicles;

    public Dealer(double till) {
        this.till = till;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        addVehicle(vehicle);
        till -= vehicle.getVehicleType().getCostPrice();
    }

    public void sellVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        till += vehicle.getVehicleType().getInitialPrice();
    }

//
//    public void repair(double repairCost) {
//        till -= repairCost;
//    }
}
