/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.qadirlab_car;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hp
 */
public class CancelAppointmentTest {
    

    @Test
    public void testCancel() {
        CancelAppointment c = new CancelAppointment();

        String msg = c.cancel(12, "Bob");

        assertEquals("Appointment #12 for Bob has been CANCELLED successfully.", msg);
    }
}