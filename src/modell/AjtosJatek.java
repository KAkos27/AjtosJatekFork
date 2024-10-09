package modell;

import java.util.Random;

public class AjtosJatek {

    private static final Random rnd = new Random();

    private Ajto[] ajtok;
    private boolean[] kincsLehetosegek;

    public AjtosJatek() {

        this.kincsLehetosegek = setKincsLehetosegek();

        this.ajtok = new Ajto[]{
            new Ajto(1, this.kincsLehetosegek[0]),
            new Ajto(2, this.kincsLehetosegek[1]),
            new Ajto(3, this.kincsLehetosegek[2])
        };
    }

    public boolean[] setKincsLehetosegek() {

        boolean[] kincs = new boolean[]{false, false, false};
        int index = rnd.nextInt(0, 3);

        kincs[index] = true;

        return kincs;
    }
}
