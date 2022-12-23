package machine;

import java.util.Scanner;

public class FillCoffee {

    static Scanner scanner = new Scanner(System.in);

    static void fill(StartValueOfCoffeeMachine remainingValue) {

        System.out.println("\nWrite how many ml of water you want to add:");
        remainingValue.mlOfWater += scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        remainingValue.mlOfMilk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        remainingValue.gOfCoffeeBeans += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add:");
        remainingValue.disposableCups += scanner.nextInt();

    }
}
