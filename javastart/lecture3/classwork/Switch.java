package sk.com.ymca.javastart.lecture3.classwork;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1,2 or 3");
        String input = sc.next();
        switch (input) {
            case "1": {
                System.out.println("one");
                break;
            }
            case "2": {
                System.out.println("two");
                break;
            }
            case "3": {
                System.out.println("three");
                break;
            }
            default:
                System.out.println("Wrong");
        }
    }
}
