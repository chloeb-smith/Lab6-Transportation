/**
 * PURPOSE: Driver class for transportation family.
 * John Keenan, Tyana Shaw, Chloe Smith
 * 10/18/2024
 * CSC331-003
 */

import java.util.Scanner;

public class WTCKeenanShawSmith {
    public static void main(String[] args) {
        //Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user for a means of transportation
        System.out.print("Choose a means of transportation (air/land/water)");
        String means = input.next();

        //Multiple selection statement for selected means
        boolean validInput = false;
        while (!validInput) {
            switch (means) {
                case "land":
                    /*
                    instantiate a new train and display its information
                    instantiate a new bus and display its information
                    instantiate a new automobile and display its information
                    instantiate a new bike and display its information
                     */
                    validInput = true;
                    break;
                case "water":
                    /*
                    instantiate a new boat and display its information
                    instantiate a new ship and display its information
                    instantiate a new submarine and display its information
                     */
                    validInput = true;
                    break;
                case "air":
                    /*
                    instantiate a new plane and display its information
                    instantiate a new helicopter and display its information
                    instantiate a new dirigible and display its information
                    instantiate a new hot air balloon and display its information
                     */
                    validInput = true;
                    break;
                default:
                    System.out.print("Invalid input.");
            }
        }
    }
}
