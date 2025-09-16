
package Inheritence4;
public class Employee {
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
        
    }
    void work(){
        System.out.println(name+" is working. ");}
    void getSalary(){
        System.out.println("Salary= $"+salary);
    }
}
