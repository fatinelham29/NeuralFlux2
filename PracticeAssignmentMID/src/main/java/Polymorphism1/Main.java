
package Polymorphism1;
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();     // Polymorphism
        Shape s2 = new Rectangle();  // Polymorphism

        // Circle object
        System.out.println("=== Circle Object ===");
        s1.show();       // calls overridden method in Circle
        s1.getInfo();    // calls base class method (not overridden)

        // Rectangle object
        System.out.println("=== Rectangle Object ===");
        s2.show();       // calls overridden method in Rectangle
        s2.getInfo();    // calls base class method (not overridden)
    }
}
