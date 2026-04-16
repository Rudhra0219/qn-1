package com.hotel;

import java.util.HashMap;
import java.util.Map;

public class BookingService {

    private Map<Integer, Room> rooms = new HashMap<>();

    // Initialize 5 rooms
    public BookingService() {
        for (int i = 1; i <= 5; i++) {
            rooms.put(i, new Room(i));
        }
    }

    // Book Room
    public String bookRoom(int roomId) {
        Room room = rooms.get(roomId);

        if (room == null) {
            return "Room not found";
        }

        if (room.isBooked()) {
            return "Room already booked!";
        }

        room.book();
        return "Booking successful";
    }

    // Cancel Booking
    public String cancelBooking(int roomId) {
        Room room = rooms.get(roomId);

        if (room == null) {
            return "Room not found";
        }

        if (!room.isBooked()) {
            return "Room not booked yet!";
        }

        room.cancel();
        return "Booking cancelled";
    }
}