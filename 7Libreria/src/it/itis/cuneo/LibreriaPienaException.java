package it.itis.cuneo;

/**
 * Created by inf.areccoa1405 on 30/10/2019.
 */
public class LibreriaPienaException extends Exception {

    //attributi
    private int codice;
    private String descrizione;

    //metodi

    public LibreriaPienaException(int codcie, String descrizione){
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "LibreriaPienaException{ " +
                "codice --> " + codice +
                ", descrizione --> " + descrizione + " }";
    }
}
