/**
 * Created by d.claudio.borgogno on 13/11/2019.
 */
public class Programma {

    //attributi
    private int codice;
    private String denominazione;
    private String produttore;
    private String sistemaOperativo;
    private int versione;
    private int annoUscita;


    //metodi
    //COSTRUTTORE

    public Programma() {
    }

    public Programma(int codice, String denominazione, String produttore, String sistemaOperativo, int versione, int annoUscita) {
        this.codice = codice;
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.sistemaOperativo = sistemaOperativo;
        this.versione = versione;
        this.annoUscita = annoUscita;
    }

    //SETTER/GETTER

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getVersione() {
        return versione;
    }

    public void setVersione(int versione) {
        this.versione = versione;
    }

    public int getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(int annoUscita) {
        this.annoUscita = annoUscita;
    }

    @Override
    public String toString() {
        return "Programma{" +
                "codice =" + codice +
                ", denominazione ='" + denominazione + '\'' +
                ", produttore ='" + produttore + '\'' +
                ", sistemaOperativo ='" + sistemaOperativo + '\'' +
                ", versione =" + versione +
                ", annoUscita =" + annoUscita +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programma)) return false;

        Programma programma = (Programma) o;

        if (getCodice() != programma.getCodice()) return false;
        if (getVersione() != programma.getVersione()) return false;
        if (getAnnoUscita() != programma.getAnnoUscita()) return false;
        if (getDenominazione() != null ? !getDenominazione().equals(programma.getDenominazione()) : programma.getDenominazione() != null)
            return false;
        if (getProduttore() != null ? !getProduttore().equals(programma.getProduttore()) : programma.getProduttore() != null)
            return false;
        return getSistemaOperativo() != null ? getSistemaOperativo().equals(programma.getSistemaOperativo()) : programma.getSistemaOperativo() == null;

    }

    public void caricaProgramma(){
        System.out.println("\n PROPRIETA DEL PROGRAMMA \n");
        this.codice = InputOutputUtility.leggiNumero("\tInserisci codice: ");
        this.denominazione = InputOutputUtility.leggiNome("\tInserisci denominazione: ");
        this.produttore = InputOutputUtility.leggiNome("\tInserisci produttore: ");
        this.sistemaOperativo = InputOutputUtility.leggiNome("\tInserisci sistema operativo: ");
        this.versione = InputOutputUtility.leggiNumero("\tInserisci versione: ");
        this.annoUscita = InputOutputUtility.leggiNumero("\tInserisci anno di uscita: ");
    }

}
