 
package Inheritence27;
 public class Rectangle extends Parallelogram {
    private double length;
    private double breadth;

    // Constructor
    public Rectangle(Point p1, Point p2, Point p3, Point p4, double length, double breadth) {
        super(p1, p2, p3, p4, length, breadth); // base=length, height=breadth
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
