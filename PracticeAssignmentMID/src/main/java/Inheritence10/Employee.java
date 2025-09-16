
package Inheritence10;
public class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Title: " + jobTitle);
    }

    double calculateBonus() {
        return 0.0;  // default
    }

    void performanceReport() {
        System.out.println("General employee performance report.");
    }

    void manageProject() {
        System.out.println(name + " is handling general tasks.");
    }
}
