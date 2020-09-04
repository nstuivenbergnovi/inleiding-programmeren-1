package nl.novi.foundation.vrijdag.werkenmetstrings;

public class SpelenMetStrings {
    public static void main(String[] args) {
        String firstName = "Nick";
        String lastName = "Stuivenberg";

        String fullName = firstName + lastName;

        String anotherFullName = firstName.concat(lastName);

        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(lastName);

        System.out.println(fullName);
        System.out.println(anotherFullName);
        System.out.println(sb.toString());

        //length
        //Letter op positie
        System.out.println("De lengte van variabele fullName is: " + fullName.length());

        fullName = fullName + " Hello World en nog een spatie";
        System.out.println(fullName);
        System.out.println(fullName.replaceAll("\\s+",""));

        //Hoofd & kleine letters
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());

        // Vinden van char-combinatie met indexOf
        System.out.println("De positie: " +fullName.indexOf("sjaak"));

        //splitten met split
        String resultFromTextfile = "Nick | Stuivenberg | 30 | n.stuivenberg@novi.nl";

        String[] result = resultFromTextfile.split("\\|");
        System.out.println("Size of array is: " + result.length);
        System.out.println("Emailadres is: " + result[3]);

        String str = "This is tutorials point";
        String substr = "";

        // prints the substring after index 8 till index 17
        substr = str.substring(8, str.length());
        System.out.println("substring = " + substr);

    }
}
