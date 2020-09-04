package nl.novi.foundation.vrijdag.textfile;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Uitleg {


    public static void main(String[] args) throws IOException {

        File file = new File("output.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        bufferedWriter.write("Dit is mijn eerste weggeschreven tekst\n\r Nieuwe regel");

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        System.out.println("Dit is de inhoud van het tekstbestand:");
        String string;
        while((string = bufferedReader.readLine()) != null) {
            //Dit is telkens 1 regel uit het tekstbestand
            System.out.println(string);
        }

        bufferedReader.close();

    }

}

