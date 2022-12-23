package machine;

public class TakeMoneyFromMachine {

    static int totalCash = 0;

    static public void takeMoney(StartValueOfCoffeeMachine remainingValue) {
        System.out.printf("\nI gave you $%d\n", remainingValue.money);
        totalCash += remainingValue.money;
        remainingValue.money = 0;
    }
}
