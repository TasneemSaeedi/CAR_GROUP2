/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.qadirlab_car;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookAppointmentTest {
    @Test
    public void testBook() {
        BookAppointment b = new BookAppointment();

        AppointmentResult result = b.book("Alice", "2025-01-10", "Blood Test");

        assertEquals("Alice", result.getPatientName());
        assertEquals("2025-01-10", result.getDate());
        assertEquals("Blood Test", result.getReason());
        assertEquals("BOOKED", result.getStatus());
    }
}
