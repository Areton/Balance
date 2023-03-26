public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и параметров программы:
        int after;
        int now = 200;  // начального счёта,
        int add = 1150;    // суммы пополнения и тп
        if (add >= 1000) {
            after = now + add + add / 100;
            System.out.println("Ваш баланс: " + after);
        } else {
            after = now + add;
            System.out.println("Ваш быланс: " + after);
        }

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}