
# Hotel Booking System

## Project Overview
The Hotel Booking System is a simple console-based Java application that allows users to book rooms, view available rooms, and manage hotel bookings. The system includes features to handle room availability and reservations.

## Features
- **View Available Rooms**: See all rooms that are currently available.
- **Book a Room**: Book a room by specifying room type and number of nights.
- **View All Bookings**: Display all current bookings.

## Folder Structure
```
HotelBookingSystem/
│
├── src/
│   ├── Room.java              # Class to represent each hotel room
│   ├── Booking.java           # Class to manage bookings
│   ├── Hotel.java             # Class to manage hotel operations (rooms and bookings)
│   └── Main.java              # Main class to run the hotel booking system
└── .vscode/                   # Optional (for debugging in VSCode)
    └── launch.json            # Optional (VSCode debugging config)
```

## Prerequisites
Before running the application, ensure you have the following installed:
1. **Java Development Kit (JDK)**: Download and install JDK (version 17 or later recommended). You can check if it's installed using:
   ```bash
   java -version
   ```

2. **Text Editor or IDE**: You can use any text editor or IDE. We recommend using [Visual Studio Code](https://code.visualstudio.com/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/).

## How to Run
1. Clone or download the project files to your local machine.
2. Open a terminal in the `HotelBookingSystem/` directory.
3. Navigate to the `src/` folder:
   ```bash
   cd src
   ```
4. Compile the Java files:
   ```bash
   javac Room.java Booking.java Hotel.java Main.java
   ```
5. Run the application:
   ```bash
   java Main
   ```

## Future Enhancements
- **User Authentication**: Allow users to log in and view their bookings.
- **Room Pricing**: Implement pricing for rooms based on type and nights.
- **Graphical User Interface (GUI)**: Build a GUI using JavaFX or Swing for a better user experience.
