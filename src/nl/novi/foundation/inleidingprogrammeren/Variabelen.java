package nl.novi.foundation.inleidingprogrammeren;

public class Variabelen {

    public static void main(String[] args) {
        // String, int, double
        String name = "Harry Mens";
        String name2 = "Sjaak Patat";

        int age = 30;
        int getal1 = 20;
        int getal2 = 40;
        double bankrekening = -10.20;

        System.out.println(name);
        System.out.println(name2);
        System.out.println(age);
        System.out.println(bankrekening);
        System.out.println("Dit is " + name + " en heeft als leeftijd: " + age);

        int uitkomst = getal1 + getal2;
        System.out.println(uitkomst);


    }

}
