package it.itis.cuneo;

import java.util.Date;
import java.util.GregorianCalendar;

//FIGLIO --> ha tutti i metodi e gli attributi del padre
// il figlio specializza il padre
public class NavePasseggeri extends Nave {

    private int numPasseggeri;

    public NavePasseggeri() {
    }

    public NavePasseggeri(int tipoNave, float lunghezza, float larghezza, Date dataArrivo, int numeroPosizioneAttracco, String compagnia, GregorianCalendar tempoDiPermanenza, int passeggeri) {
        super(tipoNave, lunghezza, larghezza, dataArrivo, numeroPosizioneAttracco, compagnia, tempoDiPermanenza);
        this.numPasseggeri = passeggeri;
    }

    public int getNumPasseggeri() {
        return numPasseggeri;
    }

    public void setNumPasseggeri(int numPasseggeri) {
        this.numPasseggeri = numPasseggeri;
    }


    public static void creaNave (Nave elencoNavi[], int cntNave, InputOutputUtility t) {
        elencoNavi[cntNave] = new NavePasseggeri();
        Nave.caricaNave(elencoNavi, cntNave, t);

        System.out.println("Numero passeggeri :");
        ((NavePasseggeri)elencoNavi[cntNave]).setNumPasseggeri(t.leggiNumero());
    }

    public String toString() {
        String s = super.toString() + " Numero passeggeri: " + numPasseggeri;

        return s;
    }

}