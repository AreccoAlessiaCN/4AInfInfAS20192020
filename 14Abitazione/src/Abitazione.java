/**
 * Created by inf.areccoa1405 on 20/11/2019.
 */
public class Abitazione {

    //attributi
    private int nStanze;
    private Double superficie;
    private String indirizzo;
    private String citta;

    //metodi
    //COSTRUTTORI

    public Abitazione() {
    }

    public Abitazione(Abitazione abitazione) {
        this.nStanze = abitazione.getnStanze();
        this.superficie = abitazione.getSuperficie();
        this.indirizzo = abitazione.getIndirizzo();
        this.citta = abitazione.getCitta();
    }

    public Abitazione(int nStanze, Double superficie, String indirizzo, String citta) {
        this.nStanze = nStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return  "nStanze = " + nStanze +
                ", superficie = " + superficie +
                ", indirizzo = '" + indirizzo + '\'' +
                ", citta = '" + citta + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abitazione)) return false;

        Abitazione that = (Abitazione) o;

        if (getnStanze() != that.getnStanze()) return false;
        if (getSuperficie() != null ? !getSuperficie().equals(that.getSuperficie()) : that.getSuperficie() != null)
            return false;
        if (getIndirizzo() != null ? !getIndirizzo().equals(that.getIndirizzo()) : that.getIndirizzo() != null)
            return false;
        return getCitta() != null ? getCitta().equals(that.getCitta()) : that.getCitta() == null;

    }

}



