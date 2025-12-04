/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qadirlab_dar;

public class ManageAppointment {

    public String updateAppointment(int appointmentId, String newDate, String newReason) {
        return "Appointment #" + appointmentId +
               " updated:\nNew Date: " + newDate +
               "\nNew Reason: " + newReason;
    }
}