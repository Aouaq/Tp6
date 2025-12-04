package ex2.com.example.tp;

public class Podcast extends Audio{
    protected String hote;

    public Podcast(String titre, int duree, String hote) {
        super(titre, duree);
        this.hote = hote;
    }

    @Override
    public void stop() {
        System.out.println("podcast stopped");
    }
}
