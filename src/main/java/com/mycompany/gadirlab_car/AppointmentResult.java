/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gadirlab_car;

public class AppointmentResult {
    private int appointmentId;
    private String patientName;
    private String date;
    private String reason;
    private String status;
    private String message;

    public AppointmentResult(int appointmentId, String patientName, String date,
                             String reason, String status, String message) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.date = date;
        this.reason = reason;
        this.status = status;
        this.message = message;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDate() {
        return date;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}