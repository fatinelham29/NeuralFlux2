
package Polymorphism3;
public class Pizza {
    private String size;          // small, medium, large
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    // Constructor
    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    // Getters and Setters
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public int getCheeseToppings() { return cheeseToppings; }
    public void setCheeseToppings(int cheeseToppings) { this.cheeseToppings = cheeseToppings; }

    public int getPepperoniToppings() { return pepperoniToppings; }
    public void setPepperoniToppings(int pepperoniToppings) { this.pepperoniToppings = pepperoniToppings; }

    public int getHamToppings() { return hamToppings; }
    public void setHamToppings(int hamToppings) { this.hamToppings = hamToppings; }

    // Calculate cost
    public double calcCost() {
        int totalToppings = cheeseToppings + pepperoniToppings + hamToppings;
        double basePrice = 0;

        switch(size.toLowerCase()) {
            case "small": basePrice = 10; break;
            case "medium": basePrice = 12; break;
            case "large": basePrice = 14; break;
            default: basePrice = 0; // invalid size
        }

        return basePrice + (2 * totalToppings);
    }

    // Description
    public String getDescription() {
        return "Size: " + size + ", Cheese: " + cheeseToppings + 
               ", Pepperoni: " + pepperoniToppings + ", Ham: " + hamToppings;
    }
}
