package com.company;

import java.util.Scanner;

public class Main {

    // This function converts kilometer to miles
    public static void kilometer() {
        System.out.println("Press C to continue");
        System.out.println("Press R to return to the main menu");
        Scanner myObj = new Scanner(System.in);
        while(true) {
            System.out.print("Enter your command(C/R): ");
            String choice = myObj.next();
            if(choice.equals("C")){
                System.out.print("Enter distance in kilometer: ");
                float kilometer = myObj.nextFloat();
                System.out.println("Miles: " + (kilometer * 0.621)); // formula for converting kilometer to miles
            }

            if(choice.equals("R")) {
                main(null);
                break;
            }

        }

    }
    // This function converts miles to kilometer
    public static void miles() {
        System.out.println("Press C to continue");
        System.out.println("Press R to return to the main menu");
        Scanner myO = new Scanner(System.in);
        while(true) {
            System.out.print("Enter your command(C/R): ");
            String choice = myO.next();
            if(choice.equals("C")){
                System.out.print("Enter distance in miles: ");
                float miles = myO.nextFloat();

                System.out.println("Kilometer: " + (miles * 1.609)); // miles to kilometer formula
            }

            if(choice.equals("R")) {
                main(null);
                break;
            }

        }
    }

    // This is the main function that navigate to the conversion function using loop and conditionals
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("*      Distance Calculator           *");
        System.out.println("**************************************");
        System.out.println("This program converts Distance");
        System.out.println("Press K to covert from kilometer to miles");
        System.out.println("Press M to convert from miles to kilometer");
        System.out.println("Press Q to quit");
        Scanner myOb = new Scanner(System.in);

        label:
        while(true) {
            System.out.print("Enter your command: ");
            String command = myOb.next();
            switch (command) {
                case "K":
                    kilometer();
                    break label;
                case "M":
                    miles();
                    break label;
                case "Q":
                    System.out.println("Thank you for using this calculator");
                    break label;
            }
        }


    }

}
