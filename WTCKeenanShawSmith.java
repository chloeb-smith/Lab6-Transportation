/**
 * PURPOSE: Driver class for transportation family.
 * John Keenan, Tyana Shaw, Chloe Smith
 * 10/18/2024
 * CSC331-003
 */
import java.util.Scanner;

public class WTCKeenanShawSmith {
    public static void main(String[] args) {
        //Instances
        // Land Transportation
        Bus bus = new Bus(
                "Bus",
                45.0,
                3.50,
                "Ticket",
                false,
                0,
                40,
                "Bus travels from Smith Station down College Rd to Monkey Junction as the 107. It then" +
                        "becomes the 210 and travels up Carolina Beach Rd to Shaw Station",
                "Pavement",
                8,
                101);
        Automobile auto = new Automobile(
                "Car",
                60.0,
                50.0,
                "Rental",
                false,
                0,
                4,
                "Go to Monkey Junction Car Rentals on Carolina Beach Rd near College Rd. Wear your" +
                        "seatbelt and drive safely.",
                "Terrain",
                4,
                "Toyota",
                "Camry",
                2015);
        Bike bike = new Bike(
                "Bike",
                30.0,
                15.0,
                "Rental",
                false,
                0,
                1,
                "Travel Instr.",
                "Terrain",
                2,
                "Schwinn",
                2);
        Train train = new Train(
                "Train",
                55.0,
                20.0,
                "Ticket",
                false,
                0,
                25,
                "Train leaves Keenan station at 8PM. Get off at Sisson Station.",
                "Terrain",
                8 ,
                "Coal");

        //Water Transportation
        Boat boat = new Boat(
                "Boat",
                60.0,
                50.0,
                "Rental",
                false,
                0,
                8,
                "Your boat is docked at Cape Fear Boat Place. Go there to use.",
                "Intracoastal Waterway",
                "Boat",
                6
        );
        Ship ship = new Ship(
                "Ship",
                45.0,
                45.0,
                "Ticket",
                false,
                0,
                100,
                "Ship leaves the port at 8AM. All sailors to their stations.",
                "Sea",
                "Food"
        );
        Submarine sub = new Submarine(
                "Sub",
                25.0,
                60.0,
                "Ticket",
                false,
                0,
                8,
                "DIVE! DIVE!",
                "Underwater",
                10000
        );

        //Air Transportation
        Plane plane = new Plane(
                "Plane",
                3000.0,
                350.0,
                "Ticket",
                false,
                0,
                700,
                "Your flight has been delayed 6 hours. It will leave at terminal B at 2AM.",
                42000,
                "Delta"
        );
        Helicopter heli = new Helicopter(
                "Chopper",
                250,
                950.0,
                "Ticket",
                false,
                0,
                7,
                "Travel Instr.",
                25000);
        HotAirBalloon balloon = new HotAirBalloon("Hot Air Balloon", 200, 250.0,
                "Ticket", false, 0, 12, "Travel Instr.",
                75000, "Wicker");
        Dirigible dirigible = new Dirigible("Dirigible", 70, 2000000,"Ticket",
                false, 0, 15, "Travel Instr.", 10000,
                "Yellow");
        
        //Scanner object
        Scanner input = new Scanner(System.in);

        String[] land_modes = {"Option", "Train", "Bus", "Automobile", "Bike"};
        String[] water_modes = {"Option", "Boat", "Ship", "Submarine"};
        String[] air_modes = {"Plane", "Helicopter", "Dirigible", "Hot Air Balloon"};
        String form_str = "%-16s%-16s%-16s%-16s%s%n";

        //Prompt user for a mode of transportation until they enter a valid input
        boolean validInput = false;
        while (!validInput) {
            //User prompt
            System.out.print("Choose a means of transportation (air/land/water) ");
            String means = input.next();

            //Multiple selection statement based on user input
            switch (means) {
                case "land":
                    for (String mode : land_modes) {
                        System.out.printf(form_str, mode,
                                "Cost", "Ticket/Rental", "Average Speed",
                                "Passengers Allowed");
                    }
                    vehicle("land");    //ln61
                    validInput = true;
                    break;
                case "water":
                    for (String mode : water_modes){
                        System.out.printf(form_str, mode,
                                "Cost", "Ticket/Rental", "Average Speed",
                                "Passengers Allowed");
                    }
                    vehicle("water");   //ln61
                    validInput = true;
                    break;
                case "air":
                    for (String mode : air_modes){
                        System.out.printf(form_str, mode,
                                "Cost", "Ticket/Rental", "Average Speed",
                                "Passengers Allowed");
                    }
                    vehicle("air");     //ln61
                    validInput = true;
                    break;
                default:
                    System.out.print("Invalid input. ");
            }
        }
    }

    /**
     * User selects a specific transportation device and passenger count, prints information.
     * @param type String air/land/water. Only affects initial printed message.
     */
    public static void vehicle(String type){
        //Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user for means of land transportation until they provide a valid input.
        boolean validInput = false;
        while (!validInput){
            //User prompt
            System.out.printf("Select a means of transportation %s%s%s ",
                    type.equals("land") ? "(train/bus/automobile/bike)" : "",
                    type.equals("water") ? "(boat/ship/submarine)" : "",
                    type.equals("air") ? "(plane/helicopter/dirigible/hot_air_balloon)": "");
            String means = input.next();

            //Multiple selection statement based on choice
            switch (means){
                case "train":
                    System.out.println("Train Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions.");
                    }
                    break;
                case "bus":
                    System.out.println("Bus Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions.");
                    }
                    break;
                case "automobile":
                    System.out.println("Automobile Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions.");
                    }
                    break;
                case "bike":
                    System.out.println("Bike Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions.");
                    }
                    break;
                case "boat":
                    System.out.println("Boat Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions.");
                    }
                    break;
                case "ship":
                    System.out.println("Ship Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers?" );
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions.");
                    }
                    break;
                case "submarine":
                    System.out.println("Submarine Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost of passengers, travel instructions");
                    }
                    break;
                case "plane":
                    System.out.println("Plane Information");
                    validInput = confirm(); //ln185
                    if (validInput) {
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions");
                    }
                    break;
                case "helicopter":
                    System.out.println("Helicopter Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions");
                    }
                    break;
                case "dirigible":
                    System.out.println("Dirigible Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions");
                    }
                    break;
                case "hot_air_balloon":
                    System.out.println("Hot Air Balloon Information");
                    validInput = confirm(); //ln185
                    if (validInput){
                        System.out.print("How many passengers? ");
                        int passengers = input.nextInt();
                        System.out.println("Cost based on passengers, travel instructions");
                    }
                default:
                    System.out.print("Invalid input. ");
            }
        }
    }

    /**
     * Prompts the user y for yes and n for no.
     * @return boolean true if y, false if n
     */
    public static boolean confirm(){
        //Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user for input until valid
        while (true){
            System.out.print("Confirm? (y/n) ");
            String answer = input.next();
            switch (answer){
                case "Y":
                case "y":
                    return true;
                case "N":
                case "n":
                    return false;
                default:
                    System.out.print("Invalid input. ");
            }
        }
    }
}
