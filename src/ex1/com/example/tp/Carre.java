package ex1.com.example.tp;

public class Carre extends Forme{

    private double cote;

    public Carre(String couleur,double cote) {
        super(couleur);
        this.cote = cote;
    }

    @Override
    public void dessiner() {
        System.out.println("Dessiner un rectangle de couleur "
                + couleur + ", cote=" + cote);
    }

    @Override
    public double aire() {
        return Math.pow(2,cote) ;
    }
}
