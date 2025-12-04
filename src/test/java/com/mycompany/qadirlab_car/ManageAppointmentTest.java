/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.qadirlab_car;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
;

public class ManageAppointmentTest {

    @Test
    public void testUpdate() {
        ManageAppointment m = new ManageAppointment();

        String updated = m.updateAppointment(3, "2025-02-01", "Follow-up test");

        assertTrue(updated.contains("2025-02-01"));
        assertTrue(updated.contains("Follow-up test"));
    }
}

