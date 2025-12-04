/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gadirlab_car;

public class BookAppointment {

    // Simulate auto-increment appointment ID
    private int nextId = 1;

    public AppointmentResult book(String patientName, String date, String reason) {
        int appointmentId = nextId++;

        return new AppointmentResult(
                appointmentId,
                patientName,
                date,
                reason,
                "BOOKED",
                "Appointment booked successfully."
        );
    }
}