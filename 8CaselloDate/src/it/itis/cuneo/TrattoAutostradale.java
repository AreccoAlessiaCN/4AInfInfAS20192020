package it.itis.cuneo;

/**
 * Created by inf.areccoa1405 on 21/10/2019.
 */
public class TrattoAutostradale {

    //attributi

    private Casello caselloEntrata;
    private Casello caselloUscita;
    private int distanza;

    //metodi

    //COSTRUTTORI

    public TrattoAutostradale(){

    }

    public TrattoAutostradale(TrattoAutostradale trattoAutostradale){
        this.caselloEntrata = new Casello(trattoAutostradale.getCaselloEntrata());
        this.caselloUscita = new Casello(trattoAutostradale.getCaselloUScita());
        this.distanza = trattoAutostradale.getDistanza();
    }

    public TrattoAutostradale(Casello caselloEntrata, Casello caselloUscita, int distanza){
        this.caselloEntrata = caselloEntrata;
        this.caselloUscita = caselloUscita;
        this.distanza = distanza;
    }

    //SETTER/GETTER

    public Casello getCaselloEntrata() {
        return caselloEntrata;
    }

    public void setCaselloEntrata(Casello caselloEntrata) {
        this.caselloEntrata = caselloEntrata;
    }

    public Casello getCaselloUscita() {
        return caselloUscita;
    }

    public void setCaselloUscita(Casello caselloUscita) {
        this.caselloUscita = caselloUscita;
    }

    public int getDistanza() {
        return distanza;
    }

    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }
}
