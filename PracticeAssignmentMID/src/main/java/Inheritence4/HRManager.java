
package Inheritence4;
public class HRManager extends Employee{

    public HRManager(String name, int salary) {
        super(name, salary);
    }

  
    @Override
    void work(){
        System.out.println(name+" is managing HR tasks. ");
    }
    @Override
    void getSalary(){
        System.out.println("Salary= $"+salary);
    }
    void addEmployee(String employeename){
        System.out.println(employeename+"Added by"+name);
    }

}
