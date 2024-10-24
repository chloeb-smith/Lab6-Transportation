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
        Transportation[] transportations = new Transportation[10];

        // Land Transportation
        LandTransportation[] landTransportations = new LandTransportation[4];   // and here!

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
                101
        );
        transportations[0] = bus;
        landTransportations[0] = bus;

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
                2015
        );
        transportations[1] = auto;
        landTransportations[1] = auto;

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
                2
        );
        transportations[2] = bike;
        landTransportations[2] = bike;

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
                "Coal"
        );
        transportations[3] = train;
        landTransportations[3] = train;

        //Water Transportation
        WaterTransportation[] waterTransportations = new WaterTransportation[3];    // and here!
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
        transportations[4] = boat;
        waterTransportations[0] = boat;

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
        transportations[5] = ship;
        waterTransportations[1] = ship;

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
        transportations[6] = ship;
        waterTransportations[2] = ship;

        //Air Transportation
        AirTransportation[] airTransportations = new AirTransportation[4];

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
        transportations[7] = plane;
        airTransportations[0] = plane;

        Helicopter heli = new Helicopter(
                "Chopper",
                250,
                950.0,
                "Ticket",
                false,
                0,
                7,
                "Travel Instr.",
                25000
        );
        transportations[8] = heli;
        airTransportations[1] = heli;

        HotAirBalloon balloon = new HotAirBalloon(
                "Hot Air Balloon",
                200,
                250.0,
                "Ticket",
                false,
                0,
                12,
                "Travel Instr.",
                75000,
                "Wicker"
        );
        transportations[9] = balloon;
        airTransportations[2] = balloon;

        Dirigible dirigible = new Dirigible(
                "Dirigible",
                70,
                2000000,
                "Ticket",
                false,
                0,
                15,
                "Travel Instr.",
                10000,
                "Yellow"
        );
        transportations[10] = dirigible;
        airTransportations[3] = dirigible;
        
        //Scanner object
        Scanner input = new Scanner(System.in);

        //TODO: rework the code below, I think this could be a lot more efficient taking advantage of polymorphism
        /*
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
        /*
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
     *//*
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
*/}}
