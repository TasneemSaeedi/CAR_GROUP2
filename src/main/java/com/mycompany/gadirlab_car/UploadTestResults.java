/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//u
package com.mycompany.gadirlab_car;

public class UploadTestResults {

    public String upload(int patientId, String testName, String resultValue) {
        return "Admin uploaded test result:\n" +
               "Patient ID: " + patientId +
               "\nTest Name: " + testName +
               "\nTest Result: " + resultValue;
    }
}