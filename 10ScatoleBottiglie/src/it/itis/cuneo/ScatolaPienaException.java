package it.itis.cuneo;

/**
 * Created by Alessia Arecco on 03/11/2019.
 */
public class ScatolaPienaException extends Exception {
    private int codice;
    private String descrizione;

    public ScatolaPienaException(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "ScatolaPienaException{" +
                "codice=" + codice +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
