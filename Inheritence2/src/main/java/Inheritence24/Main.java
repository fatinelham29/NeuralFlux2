
package Inheritence24;
public class Main {
    public static void main(String[] args) {
        
        // Rectangle object
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("=== Rectangle ===");
        rect.printArea();
        rect.printPerimeter();

        // Square object
        Square sq = new Square(6);
        System.out.println("\n=== Square ===");
        sq.printArea();
        sq.printPerimeter();
    }
}
