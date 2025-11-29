package homework.homework10.medicalCenter.model;


import homework.homework10.medicalCenter.util.DateUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Patient extends Person implements Serializable {

    private Doctor doctor;
    private Date registerDateTime;
    private User user;


    public Patient(String name, String surname, String id, String phoneNumber, Doctor doctor, Date registerDateTime,User user) {
        super(name, surname, id, phoneNumber);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
        this.user = user;

    }

    public Patient() {

    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Patient patient)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(registerDateTime, patient.registerDateTime) && Objects.equals(user, patient.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, registerDateTime, user);
    }

    @Override
    public String toString() {
        return "Patient{" +
                super.toString() +
                "doctor=" + doctor +
                ", registerDateTime=" + DateUtil.fromDateToStr(registerDateTime) +
                ", user=" + user +
                '}';
    }

}
