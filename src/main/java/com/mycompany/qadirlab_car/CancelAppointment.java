/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qadirlab_car;

/**
 *
 * @author tasne
 */
public class CancelAppointment {
    public String cancel(int appointmentId, String patientName) {
        return "Appointment #" + appointmentId +
               " for " + patientName +
               " has been CANCELLED successfully.";
    }
}
