
package Inheritence10;
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "123 Business Rd", 90000);
        Developer developer = new Developer("Bob", "456 Code Ave", 75000);
        Programmer programmer = new Programmer("Charlie", "789 Dev Blvd", 65000);

        // Manager
        System.out.println("=== Manager ===");
        manager.displayInfo();
        manager.performanceReport();
        manager.manageProject();
        System.out.println("Bonus: $" + manager.calculateBonus());

        // Developer
        System.out.println("=== Developer ===");
        developer.displayInfo();
        developer.performanceReport();
        developer.manageProject();
        System.out.println("Bonus: $" + developer.calculateBonus());

        // Programmer
        System.out.println("=== Programmer ===");
        programmer.displayInfo();
        programmer.performanceReport();
        programmer.manageProject();
        System.out.println("Bonus: $" + programmer.calculateBonus());
    }
}
