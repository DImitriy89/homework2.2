public class Main {
    public static void main(String[] args) {

        int amount = 1000; // начальный счет
        int refill = 1600; // сумма пополнения

        int bonus = 0;
        if (refill > 1000) {
            bonus = (amount + refill) / 100;
        }
        int total = amount + refill + bonus; //итоговая сумма после начисления бонусов

        System.out.println("Бонусы" + " " + bonus);
        System.out.println("Итоговая сумма" + " " + total);
    }
}