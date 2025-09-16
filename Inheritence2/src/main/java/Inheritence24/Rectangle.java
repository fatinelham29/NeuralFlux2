
package Inheritence24;
public class Rectangle {
    int length;
    int breadth;

    // Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print area
    public void printArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }

    // Method to print perimeter
    public void printPerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}
