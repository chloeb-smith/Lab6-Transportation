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
        Transportation[] transportations = new Transportation[11];
        //Land transportation
        Bus bus = new Bus(
                "Bus",
                45.0,
                3.50,
                "Ticket",
                false,
                0,
                40,
                "Bus travels from Smith Station down College Rd to Monkey Junction as the 107. It then" +
                        " becomes the 210 and travels up Carolina Beach Rd to Shaw Station",
                "Pavement",
                8,
                101
        );
        transportations[0] = bus;

        Automobile auto = new Automobile(
                "Car",
                60.0,
                50.0,
                "Rental",
                false,
                0,
                4,
                "Go to Monkey Junction Car Rentals on Carolina Beach Rd near College Rd. Wear your" +
                        " seatbelt and drive safely.",
                "Terrain",
                4,
                "Toyota",
                "Camry",
                2015
        );
        transportations[1] = auto;

        Bike bike = new Bike(
                "Bike",
                30.0,
                15.0,
                "Rental",
                false,
                0,
                1,
                "Must ride within designated bike lanes if avaiable and/or ahere to Vulnerable Road User(VRU) laws.",
                "Terrain",
                2,
                "Schwinn",
                2
        );
        transportations[2] = bike;

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
                8,
                "Coal"
        );
        transportations[3] = train;

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
        transportations[4] = boat;

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
        transportations[6] = sub;

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
        transportations[7] = plane;

        Helicopter heli = new Helicopter(
                "Chopper",
                250,
                950.0,
                "Ticket",
                false,
                0,
                7,
                "You will need to bring a valid ID and passport to the front desk of Smith Private Airways" + 
                    " to sucessfully board.",
                25000
        );
        transportations[8] = heli;

        HotAirBalloon balloon = new HotAirBalloon(
                "Balloon",
                200,
                250.0,
                "Ticket",
                false,
                0,
                12,
                "Please ensure that you are wearing closed toed shoes.",
                75000,
                "Wicker"
        );
        transportations[9] = balloon;

        Dirigible dirigible = new Dirigible(
                "Dirigible",
                70,
                2000000,
                "Ticket",
                false,
                0,
                15,
                "Boarding begins at 6AM and takeoff will follow at 6:45AM.",
                10000,
                "Yellow"
        );
        transportations[10] = dirigible;

        //Scanner object
        Scanner input = new Scanner(System.in);

        //Get medium from user.
        boolean invalid_input = true;
        String medium = "";
        while (invalid_input) {
            System.out.print("Select a means (Air, Land, Water) ");
            medium = input.next();
            if (medium.equals("Air") || medium.equals("Land") || medium.equals("Water")) {
                invalid_input = false;
            } else {
                System.out.print("Invalid input. ");
            }
        }

        //Print table.
        System.out.printf(
                "%n%-24s%-24s%-24s%-24s%s%n",
                "Type",
                "Cost",
                "Purchase Type",
                "Average Speed",
                "Max Passengers"
        );
        // Display the instance information
        for (Transportation transportation : transportations) {
            if (transportation instanceof AirTransportation && medium.equals("Air") ||
                    transportation instanceof LandTransportation && medium.equals("Land") ||
                    transportation instanceof WaterTransportation && medium.equals("Water")) {
                System.out.printf(
                        "%-24s$%-24.2f%-24s%-24.2f%d%n",
                        transportation.getName(),
                        transportation.getCost(),
                        transportation.getPurchaseType(),
                        transportation.getAverageSpeed(),
                        transportation.getMaxPassengers()
                );
            }
        }

        //Ask user to choose a mode.
        boolean keep_asking = true;    //set to false when the user confirms
        String mode = "";
        String travelInstruction = "";
        while (keep_asking) {
            invalid_input = true;
            while (invalid_input) {
                System.out.print("\nSelect from the options above. ");
                mode = input.next();
                for (Transportation transportation : transportations) {    //find the option the user selected
                    if (transportation.getName().equals(mode)) {
                        invalid_input = false;
                        System.out.printf("%n%s", transportation);
                        travelInstruction = transportation.getTravelInstructions();
                        break;
                    }
                }
                if (invalid_input) {
                    System.out.print("Invalid input. ");
                }
            }
            //ask the user to conirm
            invalid_input = true;
            while (invalid_input) {
                System.out.printf("\nConfirm %s? (Yes, No) ", mode);
                String confirmation = input.next();
                switch (confirmation) {
                    case "Yes":
                        keep_asking = false;
                        invalid_input = false;
                        break;
                    case "No":
                        invalid_input = false;
                        break;
                    default:
                        System.out.print("Invalid input. ");
                }
            }
        }
        //get passenger count and calculate cost
        for (Transportation transportation : transportations){
            if (transportation.getName().equals(mode)) { // finding mode
                System.out.print("How many people are traveling?: ");
                int num = input.nextInt();
                transportation.setNumPurchased(num);
                // determining cost if tickets are purchased
                if (transportation.getPurchaseType().equals("Ticket")){ 
                    System.out.printf("\n%s%d%s%.2f\n","The total cost for ", num, " passengers will be $",transportation.getComputedTicketCost());
                // determining cost if rental is purchased
                } else if (transportation.getPurchaseType().equals("Rental")) {
                    // determine if one vehicle is needed
                    if (transportation.getMaxPassengers() >= num){ 
                        System.out.printf("\n%s%.2f","The total cost of transportation will be ",transportation.getCost());
                    // determine cost if multiple vehicles are needed
                    } else if (transportation.getMaxPassengers() <= num) {
                        double vehicles = (double) num / transportation.getMaxPassengers();
                        int numVehicles = (int) Math.ceil(vehicles);
                        System.out.printf("\n%s%d%s%.2f\n","The total cost for ",numVehicles," vehicles will be $",transportation.getComputedRentalCost());
                    }
                }

            }
        }
        //Print travel instructions.
        System.out.printf("%n%s", travelInstruction);
    }
}
