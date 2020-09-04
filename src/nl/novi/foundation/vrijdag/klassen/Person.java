package nl.novi.foundation.vrijdag.klassen;

public class Person {

    private String name;
    private String tussenvoegsel;
    private String lastName;
    private String email;
    private int age;
    private int bsnNummer;

    // Dit is een lege constructor
    public Person() {

    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person(String fullName, String email, int age, int bsnNummer) {
        this.name = fullName;
        this.email = email;
        this.age = age;
        this.bsnNummer = bsnNummer;
    }

    public String getName() {
        return name;
    }

    public int getBsnNummer() {
        return bsnNummer;
    }

    public void setName(String name) {
        this.name = name;
    }

}
