package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.areccoa1405 on 30/10/2019.
 */
public class Libro {

    //attributi
    private String titolo;
    private String autore;
    private String isbn;
    private Calendar dataPubblicazione;

    public Libro() {
    }

    public Libro(String titolo, String autore, String isbn, Calendar dataPubblicazione) {
        this.titolo = titolo;
        this.dataPubblicazione = dataPubblicazione;
        this.isbn = isbn;
        this.autore = autore;
    }

    public Libro(Libro libro){
        this.titolo = libro.getTitolo();
        this.dataPubblicazione = libro.getDataPubblicazione();
        this.autore = libro.getAutore();
        this.isbn = libro.getIsbn();
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public Calendar getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setDataPubblicazione(Calendar dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public boolean equals (Libro libro){
        boolean bEquals = false;

        if(titolo!=null && titolo.equals(libro.getTitolo()) &&
                autore!=null && autore.equals(libro.getAutore()) &&
                        isbn!=null && isbn.equals(libro.getIsbn()) &&
                                dataPubblicazione!=null && dataPubblicazione.equals(libro.getDataPubblicazione())){
            bEquals = true;
        }

        return bEquals;

    }
}
