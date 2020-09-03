package nl.novi.foundation.inleidingprogrammeren;

public class Array {

    public static void main(String[] args) {

        String name1 = "Sjaak";
        String name2 = "Harry";
        String name3 = "Henk";



        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars[2]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println("De lengte van de array is: " + cars.length);

        int[] myNum = {10, 20, 30, 40};
    }
}
