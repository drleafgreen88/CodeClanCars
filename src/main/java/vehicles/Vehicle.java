package vehicles;

import behaviours.IDamage;
import behaviours.IRepair;

public abstract class Vehicle implements IDamage, IRepair {

    private String model;
    private int year;
    private VehicleType vehicleType;
    private Engine engine;
    private Tyres tyres;
    private double currentPrice;

    public Vehicle(String model, int year, VehicleType vehicleType, Engine engine, Tyres tyres) {
        this.model = model;
        this.year = year;
        this.vehicleType = vehicleType;
        this.engine = engine;
        this.tyres = tyres;
        this.currentPrice = vehicleType.getInitialPrice();
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void damage(double damagePercentage){
        double priceReduction = currentPrice * damagePercentage;
        currentPrice -= priceReduction;
    }

    public void repair(double repairCost) {
        currentPrice += repairCost;
    }
}
