
package Inheritence8;
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Generic Shape Perimeter: " + shape.getPerimeter());
        System.out.println("Generic Shape Area: " + shape.getArea());

        Circle circle = new Circle(5); // Radius = 5
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
