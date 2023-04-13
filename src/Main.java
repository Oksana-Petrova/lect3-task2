public class Main {
    public static void main(String[] args) {

        int nachSchet = 7890;
        int prihod =5890;
        int bonus = prihod / 100;
        int itogSchet;

        if (prihod > 1000) {
            itogSchet = nachSchet + prihod + bonus;
        } else {
            itogSchet = nachSchet + prihod;
        }

        System.out.println("Итоговый счет: " + (nachSchet + prihod + bonus) + " руб.");
        System.out.println("Сумма бонусов: " + bonus + " руб.");

    }
}