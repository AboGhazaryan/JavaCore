package homework.homework10.medicalCenter.human;

import homework.homework10.medicalCenter.Profession;

import java.io.Serializable;
import java.util.Objects;

public class Doctor extends Person implements Serializable {
    private String email;
    private Profession profession;

    public Doctor(String name, String surname,String id,String phoneNumber, String email, Profession profession) {
        super(name, surname, id, phoneNumber);
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Doctor doctor)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(email, doctor.email) && profession == doctor.profession;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                super.toString()+
                "email='" + email + '\'' +
                ", profession=" + profession +
                '}';
    }
}
