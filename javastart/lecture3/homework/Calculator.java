package sk.com.ymca.javastart.lecture3.homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
        Завдання 1
Використовуючи IntelliJ IDEA, створіть клас Calculator.
Напишіть програму – консольний калькулятор.
Створіть дві змінні з іменами operand1 та operand2. Задайте змінним деякі
довільні значення. Запропонуйте ввести знак арифметичної операції. Прийміть
значення, введене користувачем, і помістіть його в рядкову змінну sign.
Для організації вибору алгоритму обчислювального процесу використовуйте перемикач switch.
Виведіть на екран результат виконання арифметичної операції.
У разі використання операції розподілу, організуйте перевірку спроби розподілу на нуль. І якщо
така є, то скасуйте виконання арифметичної операції та повідомите про помилку
користувача
         */

        double operand1 ;
        double operand2 ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        operand1 = Double.parseDouble(scan.next());

        Scanner scann = new Scanner(System.in);
        System.out.println("Enter number 2");
        operand2 = Double.parseDouble(scann.next());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation : + - * / ");
        String sign = sc.next();

        switch (sign) {
            case "+": {
                System.out.println(operand1 + operand2);
                break;
            }
            case "-": {
                System.out.println(operand1 - operand2);
                break;
            }
            case "*": {
                System.out.println(operand1 * operand2);
                break;
            }
            case "/": {
                if (operand2 == 0) System.out.println("Infinity");
                else System.out.println(operand1 / operand2);
                break;
            }
            default:
                System.out.println("Wrong symbol");

        }
    }
}