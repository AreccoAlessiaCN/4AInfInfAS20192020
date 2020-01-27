import java.util.DoubleSummaryStatistics;

/**
 * Created by inf.areccoa1405 on 20/11/2019.
 */
public class Villa extends Abitazione{

    //attributi

    private int nPiani;
    private int superficieGiardino;
    private boolean piscina;

    //metodi

    public Villa(){

    }

    public Villa(int nPiani, int superficieGiardino, boolean piscina) {
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public Villa(Abitazione abitazione, int nPiani, int superficieGiardino, boolean piscina) {
        super(abitazione);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public Villa(int nStanze, Double superficie, String indirizzo, String citta, int nPiani, int superficieGiardino, boolean piscina) {
        super(nStanze, superficie, indirizzo, citta);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public int getnPiani() {
        return nPiani;
    }

    public void setnPiani(int nPiani) {
        this.nPiani = nPiani;
    }

    public int getSuperficieGiardino() {
        return superficieGiardino;
    }

    public void setSuperficieGiardino(int superficieGiardino) {
        this.superficieGiardino = superficieGiardino;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                ", nPiani = " + nPiani +
                ", superficieGiardino = " + superficieGiardino +
                ", piscina = " + piscina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Villa)) return false;
        if (!super.equals(o)) return false;

        Villa villa = (Villa) o;

        if (getnPiani() != villa.getnPiani()) return false;
        if (getSuperficieGiardino() != villa.getSuperficieGiardino()) return false;
        return isPiscina() == villa.isPiscina();

    }
}

















