package ex3.com.example.tp;

public class Manager extends Personne {


    public Manager(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    public Manager(String nom, double salaireBase, int anciennete) {
        super(nom, salaireBase,anciennete);
    }

    @Override
    public double calculerSalaire() {
        return (anciennete == 0) ? salaireBase : salaireBase * 1.30;  // +30%
    }

    @Override
    public void affiche() {
        System.out.printf("Nom: %s, Job: %s, Salaire: %.2f%n",nom,"Manager",calculerSalaire());
    }
}
