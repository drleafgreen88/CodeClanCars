package vehicles;

public enum VehicleType {

    ECAR (30000.50, 0, 20000.50),
    HYBRID(25000.75, 50, 15000.75),
    CAR (20000.00, 100, 10000.00);

    private final double initialPrice;
    private final int consumption;
    private final double costPrice;

    VehicleType(double initialPrice, int consumption, double costPrice) {
        this.initialPrice = initialPrice;
        this.consumption = consumption;
        this.costPrice = costPrice;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public int getConsumption() {
        return consumption;
    }

    public double getCostPrice() {
        return costPrice;
    }


}
