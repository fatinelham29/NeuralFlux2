
package Inheritence10;
public class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;  // 10% bonus
    }

    @Override
    void performanceReport() {
        System.out.println("Developer Report for " + name + ": Good coding and debugging skills.");
    }

    @Override
    void manageProject() {
        System.out.println(name + " is developing key modules of the project.");
    }
}
