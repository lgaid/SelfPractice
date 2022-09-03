package day28_encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(!((size.equalsIgnoreCase("small"))||((size.equalsIgnoreCase("medium")))||((size.equalsIgnoreCase("large"))))){
            System.err.println("Invalid size selected "+ size);
            System.exit(1);
        }
        this.size = size.toLowerCase();
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping>=0) {
            switch (size) {

                case "Small" :
                    if (numberOfCheeseTopping > 3) {
                        System.err.println("You have exceeded the amount of cheese toppings: " + numberOfCheeseTopping);
                        System.exit(1);
                    }
                    break;

                case "Medium":
                    if (numberOfCheeseTopping > 4) {
                        System.err.println("You have exceeded the amount of cheese toppings" + numberOfCheeseTopping);
                        System.exit(1);
                    }
                    break;

                case "Large":
                    if (numberOfCheeseTopping > 5) {
                        System.err.println("You have exceeded the amount of cheese toppings" + numberOfCheeseTopping);
                        System.exit(1);
                    }
                    break;

            }
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }
    

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping>=0) {
            switch (size) {

                case "Small":
                    if (numberOfPepperoniTopping > 4) {
                        System.err.println("You have exceeded the amount of pepperoni toppings" +numberOfPepperoniTopping);
                        System.exit(1);
                    }
                    break;

                case "Medium":
                    if (numberOfPepperoniTopping > 5) {
                        System.err.println("You have exceeded the amount of pepperoni toppings" + numberOfPepperoniTopping);
                        System.exit(1);
                    }
                    break;

                case "Large":
                    if (numberOfPepperoniTopping > 6) {
                        System.err.println("You have exceeded the amount of pepperoni toppings" + numberOfPepperoniTopping);
                        System.exit(1);
                    }
                    break;

            }
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);

    }

    public int calcCost(){
        int cost = 0;
        if(size.equalsIgnoreCase("Small")){
            cost+= 10 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
        } else if(size.equalsIgnoreCase("Medium")){
            cost += 12 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
        } else{
            cost += 14 + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
        }
        return cost;
    }

    public String toString() {
        return "Thank you for your pizza order! You ordered:  {" +
                "Size= '" +size + '\'' +
                ", Number of cheese toppings= " + numberOfCheeseTopping +
                ", Number of pepperoni toppings= " +numberOfPepperoniTopping +
                ", Total cost: $" + calcCost() +
                '}';

    }


}


/*
5. Create class named Pizza:
                private variables:
                 size, numberOfCheeseTopping, numberOfPepperoniTopping

            Encapsulate all the fields
             Conditions:
                     size of the pizza can only be small, medium, large. case insensitive

                     Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                   Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)

                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
