import java.text.NumberFormat;
import java.util.Arrays;

public class PizzaOrder {

    private static int MAX_PIZZAS = 100;
    private int numPizzas;
    private Pizza[] pies = new Pizza [MAX_PIZZAS];


    public PizzaOrder() {

    }

    public boolean addPizzaToOrder(char size, boolean vegan, boolean pepperoni, boolean sausage, boolean mushrooms)
    {

        if(numPizzas < MAX_PIZZAS)
        {
            pies[numPizzas++] = new Pizza(pepperoni,  sausage,  mushrooms, vegan,  size);
            return true;
        }

        return false;
    }
    public double calcCost()
    {
        double cost = 0.0;

        for (int i = 0; i < numPizzas; i++) {
            /// Make a decision on a size
            switch(pies[i].getSize())
            {
                case 's':
                case 'S':
                    cost += 8.0;
                    break;
                case 'm':
                case 'M':
                    cost += 10.0;
                    break;
                case 'l':
                case 'L':
                    cost += 12.0;
                    break;
            }
            //Add toppings
            cost += pies[i].getNumToppings();
        }

        return cost;
    }

    @Override
    public String toString() {

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String output = "Pizza Order: Number of Pies = " + numPizzas + "\n";
        // Loop through pizza in the array
        for (int i = 0; i < numPizzas; i++) {
            output += "Pie #" + (i+1) + ": " + pies[i] + "\n"; /// Calling the toString from pizza without having to explicitly say it.
        }
        output += "Total Cost = " + currency.format(calcCost());
        return output;

    }
}
