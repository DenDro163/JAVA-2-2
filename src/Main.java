public class Main {
    public static void main(String[] args) {

        // входные данные
        int initialAccount = 200; // начальный счет
        int refill = 1200; // Пополнение счета
        int sumTotal = initialAccount + refill; // Итоговый баланс без учета бонусов

        // логика
        if (refill > 1000) {
            System.out.println("Ваш баланс пополнен на:");
            System.out.println(sumTotal + refill /100);
        } else {
            System.out.println(sumTotal);
        }


    }
}