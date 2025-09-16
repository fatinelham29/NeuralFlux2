
package Inheritence25;
 public class Main {
    public static void main(String[] args) {
        
        // Create an array of 15 Square objects
        Square[] squares = new Square[15];

        // Initialize squares with side lengths 1 to 15
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square(i + 1);  // side = i+1
        }

        // Print area of each square
        System.out.println("=== Areas of 15 Squares ===");
        for (int i = 0; i < squares.length; i++) {
            System.out.print("Square " + (i + 1) + " (side = " + (i + 1) + "): ");
            squares[i].printArea();
        }
    }
}
