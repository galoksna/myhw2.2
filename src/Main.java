public class Main {
    public static void main(String[] args) {

        int initialBalance = 200;
        int amountDeposit = 1200;
        int bonus;

        if (amountDeposit > 1000) {
            bonus = amountDeposit / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый счет:" + (initialBalance + amountDeposit + bonus) + "рублей");
        
    }
}