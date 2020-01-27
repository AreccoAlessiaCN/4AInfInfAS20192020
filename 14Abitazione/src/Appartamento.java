/**
 * Created by inf.areccoa1405 on 20/11/2019.
 */
public class Appartamento extends Abitazione{

    //attributi

    private int nPiano;
    private boolean ascensore;
    private int nTerrazzi;

    //metodi

    public Appartamento(){}


    public Appartamento(boolean ascensore, int nTerrazzi, int nPiano) {
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
        this.nPiano = nPiano;
    }

    public Appartamento(Abitazione abitazione, boolean ascensore, int nTerrazzi, int nPiano) {
        super(abitazione);
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
        this.nPiano = nPiano;
    }

    public Appartamento(int nStanze, Double superficie, String indirizzo, String citta, boolean ascensore, int nTerrazzi, int nPiano) {
        super(nStanze, superficie, indirizzo, citta);
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
        this.nPiano = nPiano;
    }

    public int getnPiano() {
        return nPiano;
    }

    public void setnPiano(int nPiano) {
        this.nPiano = nPiano;
    }

    public int getnTerrazzi() {
        return nTerrazzi;
    }

    public void setnTerrazzi(int nTerrazzi) {
        this.nTerrazzi = nTerrazzi;
    }

    public boolean isAscensore() {
        return ascensore;
    }

    public void setAscensore(boolean ascensore) {
        this.ascensore = ascensore;
    }

    @Override
    public String toString() {
        return "Appartamento{" + super.toString() +
                ", nPiano = " + nPiano +
                ", ascensore = " + ascensore +
                ", nTerrazzi = " + nTerrazzi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appartamento)) return false;
        if (!super.equals(o)) return false;

        Appartamento that = (Appartamento) o;

        if (getnPiano() != that.getnPiano()) return false;
        if (isAscensore() != that.isAscensore()) return false;
        return getnTerrazzi() == that.getnTerrazzi();

    }

}
