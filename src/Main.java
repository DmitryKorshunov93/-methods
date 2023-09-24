// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void printYears(int year) {
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0 && year >= 1584) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание №1");

        printYears(2023);

        System.out.println();

        System.out.println("Задание №2");

        printVersion(1, 2017);

        System.out.println();

        System.out.println("Задание №3");

        int deliveryDays = calculateDeliveryDays(40);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void printVersion(int OS, int clientDeviceYear) {
        int iOS = 0;
        int adroid = 1;
        int clientOS = 1;
        if (clientOS == iOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == iOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == adroid && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static int calculateDeliveryDays(int deliveryDistance) {

        int days = -1;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            days = 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = 2;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days = 3;
        }
        return days;
    }
}




