package ex1.com.example.tp;

public class Forme implements Comparable<Forme>{
    protected String couleur;

    public Forme(String couleur) {
        this.couleur = couleur;
    }

    public void dessiner() {
        System.out.println("Dessiner une forme de couleur " + couleur);
    }

    public void color() {
        System.out.println("forme fun :)"+couleur);
    }

    double aire(){
        return 0.0;
    }



    @Override
    public int compareTo(Forme o) {
        return Double.compare(this.aire(), o.aire());
    }

    @Override
    public String toString() {
        return String.format("%s , aire=%.2f",
                this.getClass().getSimpleName(), aire());
    }
}
