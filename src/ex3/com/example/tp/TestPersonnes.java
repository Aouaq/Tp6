package ex3.com.example.tp;

import java.util.ArrayList;
import java.util.List;

public class TestPersonnes {
    public static void main(String[] args) {
        List<Personne> equipe = new ArrayList<>();

        List<Developpeur> developpeurs = new ArrayList<>();
        developpeurs.add(new Developpeur("Ali", 2000));
        developpeurs.add(new Developpeur("Hmadi", 2000,2));
        developpeurs.add(new Developpeur("Tibari", 2000,2));

        equipe.add(new Developpeur("Ali", 2000,2));
        equipe.add(new Developpeur("Ali", 2000));
        equipe.add(new Manager("Hamid",      3000));
        equipe.add(new Developpeur("Hanane", 2200));

        // Affiche chaque personne via la méthode générique
        Utils.listerPersonnes(equipe);
        System.out.println();
        System.out.println("========= List<Developpeur> =========");
        System.out.println();
        Utils.listerPersonnes(developpeurs);

    }

}
