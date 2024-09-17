// src/Hotel.java
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;

    public Hotel() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        rooms.add(new Room(101, "Single"));
        rooms.add(new Room(102, "Double"));
        rooms.add(new Room(103, "Suite"));
        rooms.add(new Room(104, "Single"));
        rooms.add(new Room(105, "Suite"));
    }

    public void viewAvailableRooms() {
        System.out.println("\nAvailable Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println(room);
            }
        }
    }

    public Room findAvailableRoom(String type) {
        for (Room room : rooms) {
            if (room.isAvailable() && room.getType().equalsIgnoreCase(type)) {
                return room;
            }
        }
        return null;
    }

    public void bookRoom(String guestName, String roomType, int nights) {
        Room room = findAvailableRoom(roomType);
        if (room != null) {
            Booking booking = new Booking(guestName, room, nights);
            bookings.add(booking);
            System.out.println("Booking successful: " + booking);
        } else {
            System.out.println("No available rooms of type: " + roomType);
        }
    }

    public void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            System.out.println("\nAll Bookings:");
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }
}
