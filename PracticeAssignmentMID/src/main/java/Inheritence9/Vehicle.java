
package Inheritence9;
public class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model +
                           ", Year: " + year + ", Fuel: " + fuelType);
    }

    double getFuelEfficiency() {
        return 0.0;
    }

    double calculateDistance(double liters) {
        return liters * getFuelEfficiency();
    }

    double getMaxSpeed() {
        return 0.0;
    }
}
