
package Inheritence4;
public class main {
    public static void main(String[] args) {
        Employee e=new Employee("Jhon",50000);
        e.work();
        e.getSalary();
        HRManager hr=new HRManager("Alince",70000);
        hr.work();
        hr.addEmployee("Bob");
        hr.getSalary();
    }
}
