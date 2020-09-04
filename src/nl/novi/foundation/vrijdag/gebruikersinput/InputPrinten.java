package nl.novi.foundation.vrijdag.gebruikersinput;

import nl.novi.foundation.vrijdag.klassen.Person;

import java.util.Scanner;

public class InputPrinten {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Wat is uw naam?");

        String name = userInput.nextLine();

        System.out.println("Wat is uw email?");
        String email = userInput.nextLine();

        System.out.println(name + ":" + email);

        Person person = new Person(name, email);


    }
}
