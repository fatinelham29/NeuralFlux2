
package Polymorphism2;
public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass(10, 15);

        System.out.println("Data1: " + obj.getData1());
        System.out.println("Data2: " + obj.getData2());
        System.out.println(obj.checkCondition());

        // Try changing values
        obj.setData1(5);
        obj.setData2(20);
        System.out.println("\nAfter changing values:");
        System.out.println("Data1: " + obj.getData1());
        System.out.println("Data2: " + obj.getData2());
        System.out.println(obj.checkCondition());
    }
}
