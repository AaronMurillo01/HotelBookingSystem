// src/Room.java
public class Room {
    private int roomNumber;
    private String type;
    private boolean isAvailable;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false;
    }

    public void freeRoom() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Room [Number: " + roomNumber + ", Type: " + type + ", Available: " + (isAvailable ? "Yes" : "No") + "]";
    }
}
