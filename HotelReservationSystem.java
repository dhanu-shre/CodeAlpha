import java.util.Scanner;

class HotelReservationSystem {

    // Constants for room prices
    private static final double SINGLE_ROOM_PRICE = 100.0;
    private static final double DOUBLE_ROOM_PRICE = 150.0;
    private static final double SUITE_ROOM_PRICE = 250.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hotel Reservation System!");
        System.out.println("Choose the room type for your stay:");
        System.out.println("1. Single Room - $100 per night");
        System.out.println("2. Double Room - $150 per night");
        System.out.println("3. Suite Room - $250 per night");

        System.out.print("Enter the number corresponding to your room choice: ");
        int roomChoice = scanner.nextInt();

        System.out.print("Enter the number of nights you want to stay: ");
        int numberOfNights = scanner.nextInt();

        double totalCost = 0;

        switch (roomChoice) {
            case 1:
                totalCost = SINGLE_ROOM_PRICE * numberOfNights;
                break;
            case 2:
                totalCost = DOUBLE_ROOM_PRICE * numberOfNights;
                break;
            case 3:
                totalCost = SUITE_ROOM_PRICE * numberOfNights;
                break;
            default:
                System.out.println("Invalid room choice.");
                System.exit(0);
        }

        System.out.println("Reservation Details:");
        System.out.println("Room Type: " + getRoomType(roomChoice));
        System.out.println("Number of Nights: " + numberOfNights);
        System.out.println("Total Cost: $" + totalCost);

        System.out.print("Would you like to confirm the reservation? (yes/no): ");
        String confirm = scanner.next();

        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Your reservation has been confirmed! Enjoy your stay.");
        } else {
            System.out.println("Reservation has been canceled.");
        }

        scanner.close();
    }

    // Helper method to get room type by its choice
    private static String getRoomType(int roomChoice) {
        switch (roomChoice) {
            case 1:
                return "Single Room";
            case 2:
                return "Double Room";
            case 3:
                return "Suite Room";
            default:
                return "Unknown";
        }
    }
}
