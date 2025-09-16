
package Inheritence10;
public class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;  // 20% bonus
    }

    @Override
    void performanceReport() {
        System.out.println("Manager Report for " + name + ": Excellent leadership and planning.");
    }

    @Override
    void manageProject() {
        System.out.println(name + " is managing the entire project and leading the team.");
    }
}
