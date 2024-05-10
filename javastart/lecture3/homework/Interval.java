package sk.com.ymca.javastart.lecture3.homework;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        /*
        Завдання 2
Використовуючи IntelliJ IDEA, створіть клас Interval.
Напишіть програму визначення, чи попадає вказане користувачем число від 0 до 100 у числовій
проміжок [0 – 14] [15 – 35] [36 – 50] [50 – 100]. Якщо так, то вкажіть, який саме проміжок. Якщо
користувач вказує число, що не входить до жодного з наявних числових проміжків, то
виводиться відповідне повідомлення.
         */
        double a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 0-100");
        a = Double.parseDouble(scan.next());

        if (a < 0) System.out.println("the number must be greater than 0");

        else if (a > 100) System.out.println("the number must not be greater than 100");

        else if (a < 15) System.out.println("your number is between 0 - 14 ");

        else if (a < 36) System.out.println("your number is between 15 - 35 ");

        else if (a < 50) System.out.println("your number is between 36 - 50 ");

        else System.out.println("your number is between 50 - 100 ");

    }
}
