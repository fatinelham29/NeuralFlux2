
package Inheritence23;
public class Main {
    public static void main(String[] args) {
        
        // Creating an Employee object
        Employee emp = new Employee();
        emp.name = "Rahim";
        emp.age = 28;
        emp.phoneNumber = "017XXXXXXXX";
        emp.address = "Dhaka, Bangladesh";
        emp.salary = 40000.50;
        emp.specialization = "Software Development";

        // Creating a Manager object
        Maneger mgr = new Maneger();
        mgr.name = "Karim";
        mgr.age = 40;
        mgr.phoneNumber = "018XXXXXXXX";
        mgr.address = "Chittagong, Bangladesh";
        mgr.salary = 80000.75;
        mgr.department = "IT Department";

        // Printing Employee details
        System.out.println("=== Employee Details ===");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        // Printing Manager details
        System.out.println("\n=== Manager Details ===");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);
    }
}
