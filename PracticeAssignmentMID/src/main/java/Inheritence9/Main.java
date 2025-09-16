
package Inheritence9;
public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Scania", "R-Series", 2021, "Diesel");
        Car car = new Car("Honda", "Civic", 2023, "Petrol");
        Motorcycle moto = new Motorcycle("Suzuki", "Gixxer", 2022, "Petrol");

        // Truck
        System.out.println("=== Truck Info ===");
        truck.displayInfo();
        System.out.println("Fuel Efficiency: " + truck.getFuelEfficiency() + " km/l");
        System.out.println("Distance for 40L: " + truck.calculateDistance(40) + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");

        // Car
        System.out.println("=== Car Info ===");
        car.displayInfo();
        System.out.println("Fuel Efficiency: " + car.getFuelEfficiency() + " km/l");
        System.out.println("Distance for 40L: " + car.calculateDistance(40) + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");

        // Motorcycle
        System.out.println("=== Motorcycle Info ===");
        moto.displayInfo();
        System.out.println("Fuel Efficiency: " + moto.getFuelEfficiency() + " km/l");
        System.out.println("Distance for 10L: " + moto.calculateDistance(10) + " km");
        System.out.println("Max Speed: " + moto.getMaxSpeed() + " km/h");
    }
}
