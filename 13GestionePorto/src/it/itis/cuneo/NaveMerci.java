package it.itis.cuneo;

import java.util.Date;
import java.util.GregorianCalendar;

//FIGLIO --> ha tutti i metodi e gli attributi del padre
// il figlio specializza il padre
public class NaveMerci extends Nave {

    public NaveMerci() {
        super();
    }

    public NaveMerci(int tipoNave, float lunghezza, float larghezza, Date dataArrivo, int numeroPosizioneAttracco, String compagnia, GregorianCalendar tempoDiPermanenza) {
        super(tipoNave, lunghezza, larghezza, dataArrivo, numeroPosizioneAttracco, compagnia, tempoDiPermanenza);
        // TODO Auto-generated constructor stub
    }

    public static void creaNave (Nave elencoNavi[], int cntNave, InputOutputUtility t) {
        elencoNavi[cntNave] = new NaveMerci();
        Nave.caricaNave(elencoNavi, cntNave);
    }

    public String toString() {

        //per usare la toString di NAVE devo scrivere super.toString
        // mentre se voglio usare quella della classe che sto usando
        // devo scrivere this.toString
        String s = super.toString();

        return s;
    }
}