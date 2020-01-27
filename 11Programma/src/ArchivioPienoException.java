/**
 * Created by inf.areccoa1405 on 13/11/2019.
 */
public class ArchivioPienoException extends Exception {

    //attributi
    private int codice;
    private String descrizione;

    //metodi
    //COSTRUTTORE

    public ArchivioPienoException() {
    }

    public ArchivioPienoException(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }
}
