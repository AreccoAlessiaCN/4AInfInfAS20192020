package it.itis.cuneo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

/**
 * Created by inf.areccoa1405 on 21/10/2019.
 */
public class Casello {

    //attributi

    private String identifier;
    private Calendar dataEntrata;
    private Calendar dataUscita;

    //metodi

    //COSTRUTTORI

    public Casello(){

    }

    public Casello(Casello casello){
        this.identifier = new String(casello.getIdentifier());

        Calendar cDataEntrata = Calendar.getInstance();
        cDataEntrata.setTime(casello.getDataEntrata().getTime());
        this.dataEntrata = cDataEntrata;

        Calendar cDataUscita = Calendar.getInstance();
        cDataUscita.setTime(casello.getDataUscita().getTime());
        this.dataUscita = cDataUscita;
    }

    public Casello(String identifier, Calendar dataEntrata, Calendar dataUscita){
        this.identifier = identifier;

        Calendar cDataEntrata = Calendar.getInstance();
        cDataEntrata.setTime(this.getDataEntrata().getTime());
        this.dataEntrata = cDataEntrata;

        Calendar cDataUscita = Calendar.getInstance();
        cDataUscita.setTime(this.getDataUscita().getTime());
        this.dataUscita = cDataUscita;
    }

    //SETTER/GETTER

    public void setDataEntrata(Calendar dataEntrata){
        this.dataUscita = dataEntrata;
    }

    public Calendar getDataEntrata() {
        return dataEntrata;
    }

    public void setDataUscita(Calendar dataUscita) {
        this.dataUscita = dataUscita;
    }

    public Calendar getDataUscita() {
        return dataUscita;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    //MAIN

    public static void main(String[] args) {

        //Stringa -> Data (simpleDateFormat)
        //23/10/2019 09:25:52 -> dd/mm/aaaa hh24:mi:ss (formato data stringa)
        final String FORMATO_DMY_HMS = "dd/MM/yyyy hh24:mi:ss";
        String dataPartenza = "28/09/2002 13:30:14";
        SimpleDateFormat sdf = new SimpleDateFormat()
        cDataEntrata.setTime(numeroSecondi);

        Casello caselloEntrata = new Casello("A1", );
        Casello caselloUscita = new Casello("A1", );
    }

}
