/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qadirlab_car;

/**
 *
 * @author tasne
 */
public class Qadirlab_CAR {

     public static void main(String[] args) {

      
        BookAppointment book = new BookAppointment();
        CancelAppointment cancel = new CancelAppointment();
        ViewTestResults view = new ViewTestResults();
        UploadTestResults upload = new UploadTestResults();
        ManageAppointment manage = new ManageAppointment();

        System.out.println("=== QadirLab System ===");

        // Book appointment
        System.out.println("\n--- Book Appointment ---");
        AppointmentResult result = book.book("Alice", "2025-01-10", "General Checkup");
        System.out.println("ID: " + result.getAppointmentId());
        System.out.println("Patient: " + result.getPatientName());
        System.out.println("Date: " + result.getDate());
        System.out.println("Reason: " + result.getReason());

        // Cancel appointment
        System.out.println("\n--- Cancel Appointment ---");
        System.out.println(cancel.cancel(result.getAppointmentId(), "Alice"));

        // Upload test result (Admin)
        System.out.println("\n--- Upload Test Result ---");
        System.out.println(upload.upload(5, "CBC", "Normal"));

        // View test results (Patient)
        System.out.println("\n--- View Test Results ---");
        System.out.println(view.view(5, "CBC", "Normal"));

        // Manage appointment (Admin)
        System.out.println("\n--- Manage Appointment ---");
        System.out.println(manage.updateAppointment(3, "2025-02-01", "Follow-up Check"));
    }
}
