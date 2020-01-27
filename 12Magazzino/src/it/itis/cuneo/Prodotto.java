package it.itis.cuneo;

/**
 * Created by inf.areccoa1405 on 13/11/2019.
 */
public class Prodotto {

    //attributi
    private int codice;
    private String descrizione;

    //metodi
    //COSTRUTTORI
    public Prodotto(){

    }

    public Prodotto(int codice, String descrizione){
        this.codice = codice;
        this.descrizione = descrizione;
    }


    //SETTER/GETTER
    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    //MAIN

}
