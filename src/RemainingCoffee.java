package machine;

public class RemainingCoffee {
    static void remaining(StartValueOfCoffeeMachine remainingValue) {
        System.out.printf("\nThe coffee machine has:\n" +
                                    "%d ml of water\n" +
                                    "%d ml of milk\n" +
                                    "%d g of coffee beans\n" +
                                    "%d disposable cups\n" +
                                    "$%d of money\n",
                remainingValue.mlOfWater,
                remainingValue.mlOfMilk,
                remainingValue.gOfCoffeeBeans,
                remainingValue.disposableCups,
                remainingValue.money);
    }
}
