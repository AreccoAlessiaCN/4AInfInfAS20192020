package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by Alessia Arecco on 03/11/2019.
 */
public class Bottiglia{
    private String nome;


    public Bottiglia() {
    }

    public Bottiglia(String nome){
        this.nome = nome;
    }

    public Bottiglia (Bottiglia bottiglia) {
        this.nome = getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
