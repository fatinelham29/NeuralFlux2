
package Inheritence9;
public class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double getFuelEfficiency() {
        return 40.0;
    }

    @Override
    double getMaxSpeed() {
        return 150.0;
    }
}
