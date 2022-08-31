public class main {
    public static void main(String[] args) {
        int balance = 100; //остаток по счету
        int deposit = 1100; //сумма пополнения
        int bonus; //бонус за пополнение
        int endBonus;

        if (deposit > 1000) {
            bonus = deposit / 100;
            endBonus = balance + deposit + bonus;
        } else {
            bonus = 0;
            endBonus = balance + deposit;
        }

        System.out.println("Бонусные рубли:" + bonus);
        System.out.println("Итоговый баланс:" + endBonus);
    }
}
