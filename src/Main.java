// src/Main.java
import java.util.Scanner;

public class Main {
    private static Hotel hotel = new Hotel();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        System.out.println("Welcome to the Hotel Booking System!");

        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewAvailableRooms();
                    break;
                case 2:
                    bookRoom();
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nHotel Booking Menu:");
        System.out.println("1. View Available Rooms");
        System.out.println("2. Book a Room");
        System.out.println("3. View All Bookings");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private static void viewAvailableRooms() {
        hotel.viewAvailableRooms();
    }

    private static void bookRoom() {
        System.out.print("Enter guest name: ");
        String guestName = scanner.nextLine();

        System.out.print("Enter room type (Single, Double, Suite): ");
        String roomType = scanner.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        hotel.bookRoom(guestName, roomType, nights);
    }

    private static void viewBookings() {
        hotel.viewBookings();
    }
}
