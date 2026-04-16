package com.hotel;

public class Room {
    private int roomId;
    private boolean isBooked;

    public Room(int roomId) {
        this.roomId = roomId;
        this.isBooked = false;
    }

    public int getRoomId() {
        return roomId;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book() {
        this.isBooked = true;
    }

    public void cancel() {
        this.isBooked = false;
    }
}