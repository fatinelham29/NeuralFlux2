
package Inheritence7;
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Jane", "Doe");
        System.out.println("Person: " + p.getFirstName() + " " + p.getLastName());

        Employee e = new Employee("John", "Smith", "E456", "Manager");
        System.out.println("Employee: " + e.getFirstName() + " " + e.getLastName());
        System.out.println("Employee ID: " + e.getEmployeeId());
    }
}
