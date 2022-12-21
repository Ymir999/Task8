package Task80;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private String age;
    private String number;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Person(String name, String surname, String age, String number) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.number = number;
    }

    public String toString() {
        return getName() + ";" + getSurname() + ";" + getAge() + ";" + getNumber() + ";";
    }
}