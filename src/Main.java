import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1()
    {
        System.out.println("Задание 1");
        int year = 2023;

        if(checkYear(year))
        {
            System.out.println(year + " год - високосный год.");
        }
        else
        {
            System.out.println(year + " год - невисокосный год.");
        }
        System.out.println("----\n");
    }

    static boolean checkYear(int year)
    {
        return year % 4 == 0;
    }

    static void task2()
    {
        System.out.println("Задание 2");

        boolean isAndroid = false;
        int clientDeviceYear = 2020;
        System.out.println(getVerson(isAndroid,clientDeviceYear));
        System.out.println("----\n");
    }

    static String getVerson(boolean isAndroid, int clientDeviceYear)
    {
        String outputMessage = "Установите";
        String space = " ";

        if(clientDeviceYear == LocalDate.now().getYear())
        {
            outputMessage = outputMessage + space + "обычную";
        }
        else
        {
            outputMessage = outputMessage + space + "облегченную";
        }
        outputMessage = outputMessage + space + "версию приложения для";

        if(isAndroid)
        {
           outputMessage = outputMessage + space + "Android по ссылке...";
        }
        else
        {
            outputMessage = outputMessage + space + "iOS по ссылке...";
        }
        return outputMessage;
    }

    static void task3()
    {
        System.out.println("Задание 3");

        int deliveryDistance = 22;
        int days = deliveryCard(deliveryDistance);

        if(days == 0)
        {
            System.out.println("Доставка не осуществляется.");
        }
        else
        {
            System.out.println("Потребуется дней: "+ days);
        }
        System.out.println("----\n");
    }

    static int deliveryCard (int distance)
    {
        int days = 0;

        if(distance < 20)
            days = 1;
        if(distance >= 20 && distance < 60)
            days = 2;
        if(distance >=60 && distance < 100)
            days = 3;
        return days;
    }
}