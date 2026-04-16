package com.hotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingServiceTest {

    BookingService service = new BookingService();

    @Test
    void testBookingSuccess() {
        String result = service.bookRoom(1);
        assertEquals("Booking successful", result);
    }

    @Test
    void testDoubleBookingFail() {
        service.bookRoom(2);
        String result = service.bookRoom(2);
        assertEquals("Room already booked!", result);
    }

    @Test
    void testCancelBooking() {
        service.bookRoom(3);
        String result = service.cancelBooking(3);
        assertEquals("Booking cancelled", result);
    }

    @Test
    void testCancelWithoutBooking() {
        String result = service.cancelBooking(4);
        assertEquals("Room not booked yet!", result);
    }

    @Test
    void testInvalidRoom() {
        String result = service.bookRoom(10);
        assertEquals("Room not found", result);
    }
}