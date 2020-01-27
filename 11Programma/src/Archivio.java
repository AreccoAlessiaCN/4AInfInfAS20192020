import javafx.scene.shape.Arc;

import java.util.Arrays;

/**
 * Created by inf.areccoa1405 on 13/11/2019.
 */
public class Archivio {

    //attributi
    public static final int MAX_PROGRAMMI = 10;
    private int cProgrammi;
    private Programma[] vProgrammi;
    private int nProgrammi;


    //metodi
    //COSTRUTTORE
    public Archivio(){
        vProgrammi = new Programma[MAX_PROGRAMMI];
        cProgrammi = 0;
        nProgrammi = MAX_PROGRAMMI;
    }

    public Archivio(int nProgrammi) throws ArchivioPienoException {
        if(nProgrammi > MAX_PROGRAMMI){
            throw new ArchivioPienoException(1, "Limite massimo superato!");
        }
        vProgrammi = new Programma[nProgrammi];
        this.nProgrammi = nProgrammi;
        cProgrammi = 0;;
    }

    //SOTTOPROGRAMMI
    public Programma getProgramma(int posizione){
        Programma programma = null;
        if(posizione > 0 && posizione < nProgrammi)
            programma = this.vProgrammi[posizione];
        return programma;
    }


    public void setProgramma(Programma programma , int posizione) {
        int esito = 0;

        if (posizione > 0 && posizione < nProgrammi) {

            if (this.vProgrammi[posizione] != null) {
                //la cella è piena
                esito = -2;

            } else {
                //inserisco il programmma nella posizione
                this.cProgrammi = this.cProgrammi + 1;
                this.vProgrammi[posizione] = programma;
                esito = posizione;

            }

        } else {
            //non sono riuscito ad inserire
            esito = -1;
        }

    }

    public void killProgramma(int posizione){
        if(posizione > 0 && posizione < nProgrammi) {
            this.vProgrammi[posizione] = null;
            this.cProgrammi = this.cProgrammi - 1;
        }
    }

    public int getNProgrammi(){
        return this.nProgrammi;
    }

    public Programma cercaProgrammaDenominazione(String denominazione){
        Programma programma = null;
        boolean bTrovato = false;

        for(int cProgramma = 0; cProgramma < this.nProgrammi && !bTrovato; cProgramma ++){
            programma = this.vProgrammi[cProgramma];
            if(programma != null && denominazione.equalsIgnoreCase(programma.getDenominazione())){
               bTrovato = true;
            }
        }

        return programma;
    }

    @Override //sovrascrivo di un metodo con la stessa firma
    public String toString() {
        return "Archivio{" +
                "cProgrammi=" + cProgrammi +
                ", vProgrammi=" + Arrays.toString(vProgrammi) +
                ", nProgrammi=" + nProgrammi +
                '}';
    }

    public boolean equals(Archivio archivio){

        boolean bUguali = true;

        if(this.nProgrammi == archivio.getNProgrammi()){

            for(int cProgramma = 0; cProgramma < this.nProgrammi && !bUguali; cProgramma ++) {

                //programma interno (del programma che richiama la funzione)
                Programma programmaInterno = this.getProgramma(cProgramma);

                //programma esterno (del programma richiamato, passato come parametro)
                Programma programmaEsterno = archivio.getProgramma(cProgramma);

                //senza mettere ==, sennò confronta i puntatori alla prima cella
                if(!programmaInterno.equals(programmaEsterno)){
                    bUguali = false;
                }

            }

        } else {

            bUguali = false;

        }

        return bUguali;
    }

    public int contaProgrammiUguali(Archivio archivio){

        int programmiUguali = 0;

        for(int cProgramma = 0; cProgramma < this.nProgrammi; cProgramma ++) {

            //programma interno (del programma che richiama la funzione)
            Programma programmaInterno = this.getProgramma(cProgramma);

            //programma esterno (del programma richiamato, passato come parametro)
            Programma programmaEsterno = archivio.getProgramma(cProgramma);

            //senza mettere ==, sennò confronta i puntatori alla prima cella
            if (programmaInterno.equals(programmaEsterno)) {

                programmiUguali++;
            }
        }

        return programmiUguali;
    }

    public int contaProgrammiUgualiIncrociato(Archivio archivio){

        int programmiUguali = 0;

        boolean pUgualiTrovato = false;

        for(int contatoriProgramma = 0; contatoriProgramma < this.nProgrammi; contatoriProgramma ++) {

            //programma interno (del programma che richiama la funzione)
            Programma programmaInterno = this.getProgramma(contatoriProgramma);

            for(int contatoriProgramma2 = 0; contatoriProgramma2 < archivio.nProgrammi && !pUgualiTrovato; contatoriProgramma2++){

                //programma esterno (del programma richiamato, passato come parametro)
                Programma programmaEsterno = archivio.getProgramma(contatoriProgramma2);

                //senza mettere ==, sennò confronta i puntatori alla prima cella
                if (programmaInterno.equals(programmaEsterno)) {

                    pUgualiTrovato = true;

                    programmiUguali++;
                }

            }

        }

        return programmiUguali;

    }

    public void caricaArchivio(){

        this.nProgrammi = InputOutputUtility.leggiNumero("Quanti programmi per l'archivio: ");

        for(cProgrammi = 0; cProgrammi < nProgrammi; cProgrammi++){
            Programma programma  = new Programma();
            programma.caricaProgramma();
            this.setProgramma(programma, cProgrammi);
        }

    }


    public void stampaMenu(){

        String menu = "\t0) Esci \n" +
                    "\t1) Carica archivio \n" +
                    "\t2) Elimina programma \n" +
                    "\t3) Ricerca programma per denominazione\n" +
                    "\t4) Stampa archivio";

        System.out.println(menu);

    }

    public void simulaArchivio(){

        Programma programma1 = new Programma(1, "Office", "Microsoft", "Windows", 10, 2010);

        this.setProgramma(programma1, 0);

        Programma programma2 = new Programma(2, "Autocad", "Autodesk", "Linux", 10, 2010);

        this.setProgramma(programma2, 1);

    }

    //main
    public static void main(String[] args) {

        Archivio archivio = new Archivio();

        boolean bEsci = false;

        int sceltaMenu = -1;

        archivio.stampaMenu();

        while (!bEsci){

            sceltaMenu = InputOutputUtility.leggiNumero("Inserisci la scelta: ");

            switch (sceltaMenu){

                case 0: bEsci = true;
                        break;

                case 1: archivio.caricaArchivio();
                        break;

                case 2: int posDeleteProgramma = InputOutputUtility.leggiNumero("Inserisci la posizione da cancellare: ");
                        archivio.killProgramma(posDeleteProgramma);
                        break;

                case 3: String denominazione = InputOutputUtility.leggiNome("Inserisci denominazione: ");
                        Programma programma = archivio.cercaProgrammaDenominazione(denominazione);
                        System.out.println(programma);
                        break;

                case 4: System.out.println(archivio.toString());
                        break;

                case 99: simulaArchivio(archivio);
                         break;
            }
        }

    }
}