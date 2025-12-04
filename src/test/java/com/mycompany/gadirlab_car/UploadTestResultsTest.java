/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gadirlab_car;


       
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UploadTestResultsTest {

    @Test
    public void testUpload() {
        UploadTestResults uploadTest = new UploadTestResults();

        int patientId = 5;
        String testName = "CBC";
        String resultValue = "Normal";

        String expected =
                "Admin uploaded test result:\n" +
                "Patient ID: " + patientId +
                "\nTest Name: " + testName +
                "\nTest Result: " + resultValue;

        String actual = uploadTest.upload(patientId, testName, resultValue);

        assertEquals(expected, actual);
    }
}
