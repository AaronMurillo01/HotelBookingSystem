// src/Booking.java
public class Booking {
    private String guestName;
    private Room room;
    private int nights;

    public Booking(String guestName, Room room, int nights) {
        this.guestName = guestName;
        this.room = room;
        this.nights = nights;
        room.bookRoom();  // Mark the room as booked
    }

    public String getGuestName() {
        return guestName;
    }

    public Room getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }

    @Override
    public String toString() {
        return "Booking [Guest: " + guestName + ", Room: " + room.getRoomNumber() + ", Nights: " + nights + "]";
    }
}
