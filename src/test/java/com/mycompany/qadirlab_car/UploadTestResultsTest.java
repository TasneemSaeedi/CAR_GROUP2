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
public class UploadTestResultsTest {
    


    @Test
    public void testUpload() {
        UploadTestResults u = new UploadTestResults();

        String output = u.upload(7, "CBC", "High Hemoglobin");

        assertTrue(output.contains("CBC"));
        assertTrue(output.contains("High Hemoglobin"));
    }
}
