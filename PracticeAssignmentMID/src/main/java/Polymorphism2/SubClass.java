
package Polymorphism2;
public class SubClass extends SuperClass {
    private int data2;

    // Constructor (accepts both data1 and data2)
    public SubClass(int data1, int data2) {
        super(data1);   // call superclass constructor
        this.data2 = data2;
    }

    // Getter for data2
    public int getData2() {
        return data2;
    }

    // Setter for data2
    public void setData2(int data2) {
        this.data2 = data2;
    }

    // Check condition
    public String checkCondition() {
        if (getData1() == 10 && data2 == 15) {
            return "Condition True!";
        } else {
            return "Condition False!";
        }
    }
}
