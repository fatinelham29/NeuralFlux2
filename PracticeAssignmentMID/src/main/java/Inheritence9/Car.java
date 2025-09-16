
package Inheritence9;
public class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double getFuelEfficiency() {
        return 18.0;
    }

    @Override
    double getMaxSpeed() {
        return 190.0;
    }
}
