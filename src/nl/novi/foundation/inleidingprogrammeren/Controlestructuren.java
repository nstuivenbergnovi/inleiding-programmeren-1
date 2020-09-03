package nl.novi.foundation.inleidingprogrammeren;

public class Controlestructuren {
    public static void main(String[] args) {
        // if/else/elseif
        // for lus
        // while-lus

        // Alles wat hier staat
        int breedtegraad = 45;


        int age = 15;
        if(age <= 17) {
            System.out.println("Jij mag bier drinken");
        } else if (age <= 15) {
            System.out.println("Jij geen biertje drinken");
        } else {
            System.out.println("Jij mag alle alcohol drinken.");
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        int teller = 0;
        System.out.println(cars);
        for (String car : cars) {
            System.out.println("Auto op positie: " + teller + "is: " + car);
            teller = teller + 1;
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + ": " + cars[i]);
        }

        int aantalsnoepjes = 22;
        while(aantalsnoepjes > 0) {
            aantalsnoepjes = aantalsnoepjes - 1;
            System.out.println("Er zitten nog " + aantalsnoepjes + " in de pot.");
        }

        System.out.println("De snoepjes zijn op.");


    }
}
