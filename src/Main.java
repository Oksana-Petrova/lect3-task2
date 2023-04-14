public class Main {
    public static void main(String[] args) {
        int initialAccount = 7890;
        int accountReplenishment = 950;
        int bonus;

        if (accountReplenishment > 1000) {
            bonus = accountReplenishment / 100;
        } else {
            bonus = 0;
        }

        int finalAccount = initialAccount + accountReplenishment + bonus;
        System.out.println("Итоговый счет: " + finalAccount + " руб.");
        System.out.println("Сумма бонусов: " + bonus + " руб.");
    }
}