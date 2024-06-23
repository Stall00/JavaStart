package sk.com.ymca.javastart.lecture5.practice.ex1;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        /*
        Використовуючи IntelliJ IDEA, створіть клас SumMin.
Дано два числа A та B (A<B) виведіть суму всіх чисел, розташованих між цими числами на екран.
Дано два числа A та B (A<B) виведіть усі непарні значення, розташовані між даними числами
        */
        int a ,b;
        Scanner scan = new Scanner(System.in);

        System.out.println("print first number");
         a = scan.nextInt();
        System.out.println("print second number");
         b = scan.nextInt();

          while (a < b ) {
              a++;
              System.out.println("your number " + a);

          }
    }
}
