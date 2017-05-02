package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aaronlong on 5/1/17.
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = 0;
        int index = 0;
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            if (numberOfPets == 0) {
                numberOfPets = scan.nextInt();
                System.out.println(numberOfPets);
            }
            if (index < 1) {
                System.out.println("Please list their name and what animal they are on a new like");
                System.out.println("Like this: Andre dog");
            }
            if (scan.hasNext()) {
                list.add(scan.next());
                System.out.println(list.size());
                index += 1;
            }
        }
    }
}
