package Library.model;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;

    public Author(String name, String surname, int age, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author avthor = (Author) o;
        return age == avthor.age && Objects.equals(name, avthor.name) && Objects.equals(surname, avthor.surname) && Objects.equals(phoneNumber, avthor.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, phoneNumber);
    }

    @Override
    public String toString() {
        return "Avthor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
