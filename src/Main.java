public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int depositAmount = 1101;
        int bonusPrice = depositAmount / 100;
        int totalBalance = balance + depositAmount;
        if (depositAmount > 1000) {
            System.out.println("Ваш бонус составляет " + bonusPrice + " руб.");
            System.out.println("На Вашем счету " + (totalBalance + bonusPrice) + " руб.");
        } else {
            System.out.println("На Вашем счету " + totalBalance + " руб.");
        }

    }

}
