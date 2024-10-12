package modell;

public class Ajto {

    private boolean kincs;
    private final int SZAM;

    public Ajto(int szam, boolean kincs) {

        this.SZAM = szam;
        this.kincs = kincs;
    }

    public boolean isKincs() {

        return kincs;
    }

    public int getSZAM() {

        return SZAM;
    }
}
