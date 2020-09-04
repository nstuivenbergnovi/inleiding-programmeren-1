package nl.novi.foundation.vrijdag.raadspel;

import java.util.Random;
import java.util.Scanner;

// Hier gaan we een raad spelletje met twee spelers doen
public class Main {

    /*
     * Zorg ervoor dat de resultaten in het tekstbestand worden opgeslagen.
     * Wanneer een nieuw spel begint, kijk of de gebruiker al voorkomt in het tekstbestand
     * en laat deze dan zijn oude score ophalen en ga daarmee verder tellen.
     * Aan het eind van het spel sla je de nieuwe score weer op.
     *
     * Success!
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Spelers geven hun naam op
        System.out.println("Wat is uw naam, speler 1?");
        String nameOfPlayerOne = input.nextLine();

        Player playerOne = new Player(nameOfPlayerOne);
        System.out.println("Welkom " + playerOne.getName() +  ", uw score is: " + playerOne.getScore());

        System.out.println("Wat is uw naam, speler 2?");
        String nameOfPlayerTwo = input.nextLine();
        Player playerTwo = new Player(nameOfPlayerTwo);
        System.out.println("Welkom " + playerTwo.getName() +  ", uw score is: " + playerTwo.getScore());

        Random rand = new Random();

        boolean wantsToPlay = true;

        while(wantsToPlay) {
            int numberToGuess = rand.nextInt(20);
            numberToGuess += 1;

            boolean numberNotGuessed = true;
            Player currentPlayer = playerTwo;


            while (numberNotGuessed) {

                if (currentPlayer == playerTwo) {
                    currentPlayer = playerOne;
                } else {
                    currentPlayer = playerTwo;
                }

                System.out.println(currentPlayer.getName() + ", raad een getal tussen de 1 en 20");

                String leNumber = input.nextLine();

                int guessedNumber = Integer.parseInt(leNumber);

                if (guessedNumber == numberToGuess) {
                    System.out.println(currentPlayer.getName() + " heeft gewonnen!");
                    numberNotGuessed = false;
                    currentPlayer.addOneToScore();
                    System.out.println(playerOne.getName() + ":" + playerOne.getScore());
                    System.out.println(playerTwo.getName() + ":" + playerTwo.getScore());
                }
            }

            System.out.println("Wilt u nog een keer speler? (type ja of nee)");
            String ingetypte = input.nextLine();
            if(ingetypte.equalsIgnoreCase("nee")) {
                wantsToPlay = false;
            }


        }
        System.out.println("Spel afgelopen");





        // Deze namen zetten we in een Player-object
        // computer genereert een getal tussen de 1 en 20
        // Speler 1 raadt
        // Computer checkt
        // Speler 2 raadt
        // etc.
        // Winnaar wordt bepaald, speler krijgt punt.
        // beginnen opnieuw
    }

}
