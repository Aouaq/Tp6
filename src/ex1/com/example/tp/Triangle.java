package ex1.com.example.tp;

public class Triangle extends Forme{

    private double base, hauteur;

    public Triangle(String couleur, double largeur, double hauteur) {
        super(couleur);
        this.base = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void dessiner() {
        System.out.println("Dessiner un triangle de couleur "
                + couleur + ", base=" + base
                + ", hauteur=" + hauteur);
    }

    @Override
    public double aire() {
        return (base * hauteur) / 2;
    }
}
