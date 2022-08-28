public class main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 100;
        int bonus = 1;

        int bonusRUB = bonus * deposit / 100;

        if (balance > 100) {
        } else {
            bonus = balance + deposit + bonusRUB;
        }

        if (balance < 100) {
            balance = 0;
        } else {
            bonus = balance + deposit + bonusRUB;
        }

        System.out.println("Бонусные рубли:" + bonusRUB);
        System.out.println("Итоговый баланс:" + bonus);
    }
}