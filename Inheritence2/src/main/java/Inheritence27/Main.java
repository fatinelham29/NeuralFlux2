 
package Inheritence27;
 public class Main {
    public static void main(String[] args) {
        // Create 4 points for each shape
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        // Trapezoid
        Trapezoid trap = new Trapezoid(p1, p2, p3, p4, 6, 4, 5);
        System.out.println("Trapezoid area: " + trap.area());

        // Parallelogram
        Parallelogram para = new Parallelogram(p1, p2, p3, p4, 5, 4);
        System.out.println("Parallelogram area: " + para.area());

        // Rectangle
        Rectangle rect = new Rectangle(p1, p2, p3, p4, 4, 3);
        System.out.println("Rectangle area: " + rect.area());

        // Square
        Square sq = new Square(p1, p2, p3, p4, 5);
        System.out.println("Square area: " + sq.area());
    }
}
