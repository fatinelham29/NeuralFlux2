
package Polymorphism3;
public class Main {
    public static void main(String[] args) {
        // Create pizzas
        Pizza pizza1 = new Pizza("Large", 1, 1, 2);  // Cost: 14 + 2*4 = 22
        Pizza pizza2 = new Pizza("Medium", 2, 1, 0); // Cost: 12 + 2*3 = 18

        // Print descriptions and costs
        System.out.println("Pizza 1: " + pizza1.getDescription() + ", Cost: $" + pizza1.calcCost());
        System.out.println("Pizza 2: " + pizza2.getDescription() + ", Cost: $" + pizza2.calcCost());

        // Create order
        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        System.out.println("Total order cost: $" + order.calcTotal());
    }
}
