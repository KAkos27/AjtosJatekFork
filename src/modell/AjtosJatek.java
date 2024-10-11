package modell;

import java.util.Random;

public class AjtosJatek {

    private static final Random rnd = new Random();

    private final Ajto[] ajtok;
    private final boolean[] kincsLehetosegek;
    private int valasztas;

    private int ajtoCserek;
    private int ajtoCsereGyozelmek;
    private int eredetiAjtok;
    private int eredetiAjtoGyozelmek;

    public AjtosJatek() {

        this.valasztas = -1;
        this.kincsLehetosegek = setKincsLehetosegek();

        this.ajtok = new Ajto[]{
            new Ajto(0, this.kincsLehetosegek[0]),
            new Ajto(1, this.kincsLehetosegek[1]),
            new Ajto(2, this.kincsLehetosegek[2])
        };
    }

    private boolean[] setKincsLehetosegek() {

        boolean[] kincs = new boolean[]{false, false, false};
        int index = rnd.nextInt(0, 3);

        kincs[index] = true;

        return kincs;
    }

    public String veglegesValasztas(int ajtoCsere) {

        String visszajelzes = "Gratulálok!\nMegtaláltad a kincset";
        String uresAjtoSzoveg = "Sajnom nem talált :(";

        if (ajtoCsere == 0) {
            this.eredetiAjtok++;
            this.eredetiAjtoGyozelmek += ajtok[this.valasztas].isKincs() ? 1 : 0;
        } else {
            this.valasztas = keresMasikAjtot().getSZAM();
            this.ajtoCserek++;
            this.ajtoCsereGyozelmek += ajtok[this.valasztas].isKincs() ? 1 : 0;
        }

        visszajelzes = ajtok[this.valasztas].isKincs() ? visszajelzes : uresAjtoSzoveg;
        return visszajelzes;
    }

    public Ajto keresUresAjtot() {

        Ajto uresAjto = ajtok[this.valasztas];

        for (Ajto ajto : ajtok) {
            if (ajto.getSZAM() != valasztas && !ajto.isKincs()) {
                uresAjto = ajto;
            }
        }

        return uresAjto;
    }

    public Ajto keresMasikAjtot() {

        Ajto uresAjto = keresUresAjtot();
        Ajto masikAjto = ajtok[this.valasztas];

        for (Ajto ajto : ajtok) {
            if (ajto.getSZAM() != valasztas && ajto.getSZAM() != uresAjto.getSZAM()) {
                masikAjto = ajto;
            }
        }

        return masikAjto;
    }

    public String uresAjtotMegmutat() {
        int valasztasSzam = this.valasztas + 1;

        String visszajelzes = "A választásod a(z) " + valasztasSzam + ". ajtó\nA(z) ";

        Ajto uresAjto = keresUresAjtot();
        int uresAjtoSzam = uresAjto.getSZAM() + 1;

        Ajto masikAjto = keresMasikAjtot();
        int masikAjtoSzam = masikAjto.getSZAM() + 1;

        visszajelzes += uresAjtoSzam + ". ajtó üres\nSzeretnéd a " + masikAjtoSzam + ". ajtót választani?";

        return visszajelzes;
    }

    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }

    public int getAjtoCserek() {
        return ajtoCserek;
    }

    public int getAjtoCsereGyozelmek() {
        return ajtoCsereGyozelmek;
    }

    public int getEredetiAjtok() {
        return eredetiAjtok;
    }

    public int getEredetiAjtoGyozelmek() {
        return eredetiAjtoGyozelmek;
    }
}
