package ex3.com.example.tp;

public abstract class Personne {
    protected final String nom;
    protected final double salaireBase;
    protected int anciennete; // en années

    public Personne(String nom, double salaireBase, int anciennete) {
        this.nom = nom;
        this.salaireBase = salaireBase;
        this.anciennete = anciennete;
    }

    public Personne(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }


    public abstract double calculerSalaire();

    public void affiche() {
        System.out.printf(
                "Je suis %s, salaire = %.2f%n",
                nom, calculerSalaire()
        );
    }


}
