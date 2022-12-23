package machine;

public class CoffeeCheck {
    static class Espresso {
        public static void check(StartValueOfCoffeeMachine remainingValue) {
            if (remainingValue.mlOfWater - CoffeeRecipe.Espresso.ML_OF_WATER < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (remainingValue.gOfCoffeeBeans - CoffeeRecipe.Espresso.G_OF_COFFEE_BEANS < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (remainingValue.disposableCups - CoffeeRecipe.REQUIRED_CUP < 0) {
                System.out.println("Sorry, not enough cups!");
            } else {
                remainingValue.mlOfWater -= CoffeeRecipe.Espresso.ML_OF_WATER;
                remainingValue.mlOfMilk -= CoffeeRecipe.Espresso.ML_OF_MILK;
                remainingValue.gOfCoffeeBeans -= CoffeeRecipe.Espresso.G_OF_COFFEE_BEANS;
                remainingValue.disposableCups -= CoffeeRecipe.REQUIRED_CUP;
                remainingValue.money += CoffeeRecipe.Espresso.COSTS;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }
    }

    static class Latte {
        public static void check(StartValueOfCoffeeMachine remainingValue) {
            if (remainingValue.mlOfWater - CoffeeRecipe.Latte.ML_OF_WATER < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (remainingValue.gOfCoffeeBeans - CoffeeRecipe.Latte.G_OF_COFFEE_BEANS < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (remainingValue.disposableCups - CoffeeRecipe.REQUIRED_CUP < 0) {
                System.out.println("Sorry, not enough cups!");
            } else {
                remainingValue.mlOfWater -= CoffeeRecipe.Latte.ML_OF_WATER;
                remainingValue.mlOfMilk -= CoffeeRecipe.Latte.ML_OF_MILK;
                remainingValue.gOfCoffeeBeans -= CoffeeRecipe.Latte.G_OF_COFFEE_BEANS;
                remainingValue.disposableCups -= CoffeeRecipe.REQUIRED_CUP;
                remainingValue.money += CoffeeRecipe.Latte.COSTS;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }
    }

    static class Cappuccino {
        public static void check(StartValueOfCoffeeMachine remainingValue) {
            if (remainingValue.mlOfWater - CoffeeRecipe.Cappuccino.ML_OF_WATER < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (remainingValue.gOfCoffeeBeans - CoffeeRecipe.Cappuccino.G_OF_COFFEE_BEANS < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (remainingValue.disposableCups - CoffeeRecipe.REQUIRED_CUP < 0) {
                System.out.println("Sorry, not enough cups!");
            } else {
                remainingValue.mlOfWater -= CoffeeRecipe.Cappuccino.ML_OF_WATER;
                remainingValue.mlOfMilk -= CoffeeRecipe.Cappuccino.ML_OF_MILK;
                remainingValue.gOfCoffeeBeans -= CoffeeRecipe.Cappuccino.G_OF_COFFEE_BEANS;
                remainingValue.disposableCups -= CoffeeRecipe.REQUIRED_CUP;
                remainingValue.money += CoffeeRecipe.Cappuccino.COSTS;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }

    }
}
