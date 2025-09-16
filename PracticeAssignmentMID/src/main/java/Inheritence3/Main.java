
package Inheritence3;
public class Main {
    public static void main(String[] args) {
        Shape a = new Shape();
        System.out.println("Generic Shape Area: " + a.getArea());

        Rectangle r = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + r.getArea());
    }
}
