 
package Inheritence27;
 public class Trapezoid extends Quadrilateral {
    private double height;
    private double base1;
    private double base2;

    // Constructor
    public Trapezoid(Point p1, Point p2, Point p3, Point p4, double base1, double base2, double height) {
        super(p1, p2, p3, p4);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double area() {
        return 0.5 * (base1 + base2) * height;
    }
}
