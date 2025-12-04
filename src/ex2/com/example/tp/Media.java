package ex2.com.example.tp;

public class Media {

    protected String titre;

    public Media(String titre) {
        this.titre=titre;
    }

    public void lire(){
        System.out.println("Lecture de : " + titre);
    }

    public int getDuree(){
        return 0;
    }

    public void stop(){
        System.out.println("Stopped Playing: "+titre);
    }
}
