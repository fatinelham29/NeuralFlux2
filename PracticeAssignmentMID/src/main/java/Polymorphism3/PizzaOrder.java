
package Polymorphism3;
public class PizzaOrder {
    private Pizza[] pizzas;
    private int count;

    // Constructor (up to 3 pizzas)
    public PizzaOrder() {
        pizzas = new Pizza[3];
        count = 0;
    }

    // Add pizza to order
    public void addPizza(Pizza pizza) {
        if(count < 3) {
            pizzas[count] = pizza;
            count++;
        } else {
            System.out.println("Cannot add more than 3 pizzas to the order.");
        }
    }

    // Calculate total cost
    public double calcTotal() {
        double total = 0;
        for(int i = 0; i < count; i++) {
            total += pizzas[i].calcCost();
        }
        return total;
    }
}
