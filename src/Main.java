import java.time.LocalDate;

public class Main {
    static int currentYear = LocalDate.now().getYear();

    public static void main(String[] args) {

        getDeliveryDays(25);

    }
    private static void checkLeapYear(int setYear) {
        /*
            Реализуйте метод, который получает в качестве параметра год,
        а затем проверяет, является ли он високосным,
        и выводит результат в консоль.
        */

        boolean isLeapYear = false;
        if (setYear % 4 == 0) {
            if (setYear % 100 == 0) {
                if (setYear % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            } else
                isLeapYear = true;
        } else
            isLeapYear = false;
        if (isLeapYear) {
            System.out.println(setYear + " — високосный год.");
        } else {
            System.out.println(setYear + " — не високосный год.");
        }

    }

    static void checkLiteVersion(byte clientOS, int clientDeviceYear) {

        /*
            Напишите метод, куда подаются два параметра: тип операционной системы
            (ОС) ( 0 — iOS или 1 — Android) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить
        lite-версию (облегченную версию).
        */

        switch (clientOS) {
            case 0:
                if (clientDeviceYear < currentYear)
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                else System.out.println("Установите версию приложения для iOS по ссылке");

                break;
            case 1:
                if (clientDeviceYear < currentYear)
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                else System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }

    static void getDeliveryDays(int deliveryDistance) {

        /*
                Возвращаемся к любимой многими задаче на расчет дней доставки
           банковской карты отбанка.
           Наша задача — доработать код, а именно написать метод, который
            на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        */

        int etaDays = 1;

        for (int i = 20; i < deliveryDistance; i += 40) {
            etaDays++;
        }

        System.out.println("Потребуется дней: " + etaDays);

    }

}