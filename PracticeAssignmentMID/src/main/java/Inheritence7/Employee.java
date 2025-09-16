
package Inheritence7;
public class Employee extends Person {
    String employeeId;
    String jobTitle;

    Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    String getEmployeeId() {
        return employeeId;
    }

    @Override
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}
