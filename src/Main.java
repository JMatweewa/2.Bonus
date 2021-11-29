public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int depositAmount = 100;

        int bonusPrice;
        if (depositAmount > 1000) {
            bonusPrice = depositAmount / 100;
            System.out.println("Ваши бонусы составляют " + bonusPrice + " руб.");
        } else {
            bonusPrice = 0;
        }
        int totalBalance = balance + depositAmount + bonusPrice;
        System.out.println("На Вашем счету " + totalBalance + " руб.");
    }
}

