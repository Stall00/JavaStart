package sk.com.ymca.javastart.lecture3.practice;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word(UA)");
        String input = sc.next();
        switch (input) {
            case "дощ": {
                System.out.println("rain");
                break;
            }
            case "сонячно": {
                System.out.println("sunny");
                break;
            }
            case "шторм": {
                System.out.println("storm");
                break;
            }
            case "град": {
                System.out.println("ice strom");
                break;
            }
            case "сніжно": {
                System.out.println("snow");
                break;
            }
            case "сухо": {
                System.out.println("drought");
                break;
            }
            case "паморочно": {
                System.out.println("cloudy");
                break;
            }
            case "волого": {
                System.out.println("wet");
                break;
            }
            case "жарок": {
                System.out.println("hot");
                break;
            }
            case "прохолодно": {
                System.out.println("cold");
                break;
            }
            default:
                System.out.println("Unknown word");
        }
    }
}
