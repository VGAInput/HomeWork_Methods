import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        final int currentYear = LocalDate.now().getYear();

    }

    private static void checkLeapYear(int setYear) {
        /*
            Реализуйте метод, который получает в качестве параметра год,
        а затем проверяет, является ли он високосным,
        и выводит результат в консоль.
        */

        if (setYear % 4 == 0) {
            System.out.println(setYear + " год является високосным.");
        } else {
            System.out.println(setYear + " год не является високосным.");
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
                if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                else System.out.println("Установите версию приложения для iOS по ссылке");

                break;
            case 1:
                if (clientDeviceYear < 2015)
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

        short etaDays = 1;

        if (deliveryDistance > 20)
            etaDays++;
        if (deliveryDistance >= 60)
            etaDays++;
        if (deliveryDistance >= 100) etaDays++;

        System.out.println("Потребуется дней: " + etaDays);

    }

}