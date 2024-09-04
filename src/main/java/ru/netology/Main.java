package ru.netology;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {

        Basket basket=new Basket();
        Offers offers=new Offers();
        Scanner in = new Scanner(System.in);


        while (true) {
            printChoicesOffers();
            System.out.print("Input your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1: {//Show offers
                    System.out.println(offers);
                    waitingAction();
                    break;
                }
                case 2: {//Put offer in my basket
                    System.out.print("Input offers index: ");
                    basket.putItem(offers.getOfferByuIndex(in.nextInt()-1));

                    waitingAction();
                    break;
                }
                case 3: {//Show my basket
                    System.out.println(basket);

                    waitingAction();
                    break;
                }
                case 4: {//Delete item from my basket
                    System.out.print("Input index for deleting: ");
                    basket.deleteItemByIndex(in.nextInt()-1);
                    waitingAction();
                    break;
                }
                case 5: {//End this session
                    System.out.println("Goodbyyye!!!");
                    System.exit(0);
                    break;
                }

            }
        }


    }

    public static void printChoicesOffers() {
        System.out.println("-------Menu-------");
        System.out.println("1. Show offers.");
        System.out.println("2. Put offer in my basket.");
        System.out.println("3. Show my basket.");
        System.out.println("4. Delete item from my basket");
        System.out.println("5. End this session.");
        System.out.println("------------------");
    }
    //DRY
    public static void waitingAction(){
        System.out.print("Enter bottom for continue...");
        Scanner in=new Scanner(System.in);
        in.nextLine();

    }


}