package machine;

import java.util.Scanner;

public class StartActionCoffeeMachine {

    static void startAction() {
        Scanner scanner = new Scanner(System.in);
        StartValueOfCoffeeMachine coffeeMachineResources = new StartValueOfCoffeeMachine();

        boolean boolValue = true;

        while (boolValue) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");

            switch (scanner.next()) {
                case "buy" -> BuyCoffee.buyCoffee(coffeeMachineResources);
                case "fill" -> FillCoffee.fill(coffeeMachineResources);
                case "take" -> TakeMoneyFromMachine.takeMoney(coffeeMachineResources);
                case "remaining" -> RemainingCoffee.remaining(coffeeMachineResources);
                case "exit" -> boolValue = false;
            }
        }
    }
}
