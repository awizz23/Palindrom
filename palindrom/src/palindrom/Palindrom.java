package palindrom;

import java.util.*;

public class Palindrom {

    public static void main(String[] args) {

        String original, unazad = ""; 
        Scanner in = new Scanner(System.in);
        System.out.println("Unesi string koju treba provjeriti: ");
        original = in.nextLine();
        int duzina = original.length();
        for (int i = duzina - 1; i >= 0; i--) {
            unazad = unazad + original.charAt(i);
        }
        if (original.equals(unazad)) {
            System.out.println("Uneseni string jeste palindrom.");
        } else {
            System.out.println("Uneseni string nije palindrom.");
        }
    }

}
