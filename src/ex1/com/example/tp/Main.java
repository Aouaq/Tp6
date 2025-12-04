package ex1.com.example.tp;

import java.util.Arrays;
import java.util.Comparator;

public class Main {



    public static void main(String[] args) {

        Forme[] formes = new Forme[] {
                new Cercle("Rouge",   5.0),
                new Rectangle("Bleu", 4.0, 3.0),
                new Rectangle("Bleu", 10.0, 3.0),
                new Triangle("Vert",  6.0, 2.5),
                new Triangle("Vert",  610.0, 2.5),
                new Forme("Noir")     // Forme générique
        };



        for (Forme f : formes) {
            f.dessiner();
        }

        Forme f = new Cercle("Rouge", 5.0 );

        f.dessiner();
        f.color();

        System.out.println(f.compareTo(new Cercle("Rouge", 6.0 )));

        Arrays.sort(formes);

        for (Forme ff : formes) {
            System.out.println(ff);
        }

    }



}
