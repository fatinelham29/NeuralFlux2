 
package Inheritence25;
 public class Square extends Rectangle {

    // Constructor calling parent constructor
    public Square(int side) {
        super(side, side); // both length and breadth = side
    }
}
