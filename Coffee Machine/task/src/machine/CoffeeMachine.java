package machine;

import java.util.*;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400, milk = 540, coffee = 120, cups = 9, cost = 550;
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            if (action.equals("exit")) break;
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    switch (scanner.nextLine()) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (coffee < 16) {
                                System.out.println("Sorry, not enough coffee!");
                                break;
                            }
                            if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            water = water - 250;
                            coffee = coffee - 16;
                            cups = cups - 1;
                            cost = cost + 4;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            if (coffee < 20) {
                                System.out.println("Sorry, not enough coffee!");
                                break;
                            }
                            if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            water = water - 350;
                            milk = milk - 75;
                            coffee = coffee - 20;
                            cups = cups - 1;
                            cost = cost + 7;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            if (coffee < 12) {
                                System.out.println("Sorry, not enough coffee!");
                                break;
                            }
                            if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            water = water - 200;
                            milk = milk - 100;
                            coffee = coffee - 12;
                            cups = cups - 1;
                            cost = cost + 6;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water = water + scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk = milk + scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    coffee = coffee + scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups = cups + scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + cost);
                    cost = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffee + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println("$" + cost + " of money");
                    break;
                default:
                    System.out.println("No find command");
            }

        }
    }
}