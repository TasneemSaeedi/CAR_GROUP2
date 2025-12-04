/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qadirlab_car;

public class BookAppointment {
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
