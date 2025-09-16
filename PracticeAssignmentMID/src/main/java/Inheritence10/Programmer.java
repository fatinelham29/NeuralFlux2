
package Inheritence10;
public class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.08;  // 8% bonus
    }

    @Override
    void performanceReport() {
        System.out.println("Programmer Report for " + name + ": Efficient in writing clean code.");
    }

    @Override
    void manageProject() {
        System.out.println(name + " is writing and testing code for assigned tasks.");
    }
}
