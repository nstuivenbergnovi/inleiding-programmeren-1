package nl.novi.foundation.inleidingprogrammeren;


import java.util.Calendar;

public class Methodes {

    public static void main(String[] args) {
        // Methode zonder void.
        // Methode met input
        // Methode met return
        // Methode met return en input
        printHelloWorld();
        greetName("Nick");
        greetName("Harry");
        greetName("Sjaak");

        String anotherName = "Beatrix";

        greetName(anotherName);

        int gevondenJaar = giveCurrentYear();
        if(gevondenJaar == 2020) {
            System.out.println("We zitten in 2020!");
        }

        int getal = 20;
        System.out.println(addFive(getal));
        System.out.println(multiplier(10));
        System.out.println(multi(6,
                3));
    }

    protected static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static void greetName(String name) {
        System.out.println("Hello " + name);
    }

    public static int giveCurrentYear() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year;
    }

    public static int addFive(int number) {
        int result = number + 5;
        return result;
    }

    public static int multiplier(int number) {
        int uitkomst = number * 2;
        return uitkomst;
    }

    public static int multi(int number, int multiplier) {
        int uitkomst = number * multiplier;
        return uitkomst;
    }
}
