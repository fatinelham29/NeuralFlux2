
package Inheritence9;
public class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double getFuelEfficiency() {
        return 6.0;
    }

    @Override
    double getMaxSpeed() {
        return 110.0;
    }
}
