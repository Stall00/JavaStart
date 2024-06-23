package sk.com.ymca.javastart.lecture4.homework.tusk1;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        if ((number | 1) == number) {
            System.out.println("Unpair");
        } else {
            System.out.println("Pair");
        }

        if (number % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Unpair");

        }



    }
}
