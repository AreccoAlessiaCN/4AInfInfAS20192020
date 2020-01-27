package it.itis.cuneo;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Alessia Arecco on 03/11/2019.
 */

public class Scatola{
    public static final int MAX_BOTTIGLIE = 3;
    private Bottiglia[] vBottiglie;
    private int cntBottiglie;

    public Scatola(){
        //costruttore di Array []
        vBottiglie= new Bottiglia[MAX_BOTTIGLIE];
        cntBottiglie= 0;
    }

    public void addBottiglia(Bottiglia bottiglia)throws ScatolaPienaException{
        if(cntBottiglie > MAX_BOTTIGLIE)
            throw new ScatolaPienaException(1, "Troppe bottiglie!!");
        vBottiglie[cntBottiglie] = bottiglia;
        cntBottiglie++;
    }

    @Override
    public String toString() {
        return "Scatola{" +
                "vBottiglie=" + Arrays.toString(vBottiglie) +
                ", cntBottiglie=" + cntBottiglie +
                '}';
    }

    public static void main(String[] args) {

        Bottiglia bottiglia = new Bottiglia("NomeBottiglia");
        Bottiglia bottiglia1 = new Bottiglia("NomeBottiglia1");
        Bottiglia bottiglia2 = new Bottiglia("NomeBottiglia2");
        Bottiglia bottiglia3 = new Bottiglia("NomeBottiglia3");


        Scatola scatola = new Scatola();


        try {
            scatola.addBottiglia(bottiglia);
        } catch (ScatolaPienaException e) {
            e.printStackTrace();
        }

        System.out.println(scatola.toString());

    }

}
