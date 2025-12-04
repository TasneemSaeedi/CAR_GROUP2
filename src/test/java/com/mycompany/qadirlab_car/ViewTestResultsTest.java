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
public class ViewTestResultsTest {
    

    @Test
    public void testView() {
        ViewTestResults v = new ViewTestResults();

        String output = v.view(11, "X-Ray", "Normal");

        assertTrue(output.contains("Patient ID: 11"));
        assertTrue(output.contains("X-Ray"));
        assertTrue(output.contains("Normal"));
    }
}