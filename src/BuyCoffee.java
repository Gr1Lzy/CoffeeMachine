package machine;

import java.util.Objects;
import java.util.Scanner;


enum CoffeeType {
    UNKNOWN, ESPRESSO, LATTE, CAPPUCCINO;

    public static CoffeeType toCoffeeType(int coffeeType) {
        switch (coffeeType) {
            case 1 -> {
                return ESPRESSO;
            }
            case 2 -> {
                return LATTE;
            }
            case 3 -> {
                return CAPPUCCINO;
            }
            default -> {
                return UNKNOWN;
            }
        }
    }
}

public class BuyCoffee {
    static void buyCoffee(StartValueOfCoffeeMachine remainingValue) {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);

        String coffeeCommand = scanner.next();

        if (Objects.equals(coffeeCommand, "back")) {
            return;
        }

        int coffeeType = 0;
        try {
            coffeeType = Integer.parseInt(coffeeCommand);
        } catch (Exception e) {
            System.out.println("Incorrect input");
            return;
        }

        switch (CoffeeType.toCoffeeType(coffeeType)) {
            case ESPRESSO -> CoffeeCheck.Espresso.check(remainingValue);
            case LATTE -> CoffeeCheck.Latte.check(remainingValue);
            case CAPPUCCINO -> CoffeeCheck.Cappuccino.check(remainingValue);
            case UNKNOWN -> System.out.println("No such coffee type");
        }
    }
}