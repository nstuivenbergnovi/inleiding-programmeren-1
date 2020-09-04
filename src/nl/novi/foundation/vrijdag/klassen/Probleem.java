package nl.novi.foundation.vrijdag.klassen;

public class Probleem {
    public static void main(String[] args) {
        // Stel je wilt van meerdere personen zijn naam, leeftijd en emailadres gebruiken.

        Person persoon1 = new Person("Nick", "n.stuivenberg@novi.nl", 30, 1);
        Person persoon2 = new Person("Sjaak", "sjaak@sjaak.nl", 22, 2);


        persoon2.setName("Harry");

        System.out.println(persoon1.getName());
        System.out.println(persoon1.getBsnNummer());
        System.out.println("Dit is persoon 2: " + persoon2.getName());


        String naam2 = "Sjaak";
        String email2 = "sjaak@sjaak.nl";
        int age2  = 22;

    }
}
