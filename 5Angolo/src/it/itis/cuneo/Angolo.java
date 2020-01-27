package it.itis.cuneo;

/**
 * Created by inf.areccoa1405 on 11/11/2019.
 */
public class Angolo {

    //attributi
    private int gradi;
    private int primi;
    private int secondi;


    //metiodi
    //COSTRUTTORI
    public Angolo(int g, int p, int s){
        this.gradi = g;
        this.primi = p;
        this.secondi = s;
    }

    //SETTER/GETTER
    public void setGradi(int g){
        this.gradi = g;
    }

    public void setPrimi(int p){
        this.primi = p;
    }

    public void setSecondi(int s){
        this.secondi = s;
    }

    public int getGradi(){
        return gradi;
    }

    public int getPrimi(){
        return primi;
    }

    public int getSecondi(){
        return secondi;
    }

    public int secondiAngolo(){
        int valore = 0;
        return valore;
    }

    //emissione risultato
    @Override
    public String toString(){
        return "gradi: " + this.gradi + ", primi: " + this.primi + ", secondi: " + this.secondi + "}";
    }


    //aggiungere i gradi all'angolo
    public int aggiungiGradi(){



        return this.gradi;
    }

    //somma degli angoli
    public int sommaAngoli(){
        int valore = 0;
        return valore;
    }


    //main
    public static void main(String[] args) {

        Angolo angolo1 = new Angolo(30, 30, 30);

        System.out.println("angolo{" + angolo1.toString());

        Angolo angolo2 = new Angolo(50,50,50);

        angolo1.sommaAngoli();
    }
}
