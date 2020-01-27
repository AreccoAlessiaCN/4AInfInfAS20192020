import java.util.Calendar;

/**
 * Created by d.claudio.borgogno on 23/11/2019.
 */
public class Oliva {

    private String codiceOliva;
    private ColoreOliva coloreOliva;
    private MaturazioneOliva maturazioneOliva;
    private Calendar dataRaccolta;

    public Oliva() { super(); }
    public Oliva(String codiceOliva, ColoreOliva coloreOliva, MaturazioneOliva maturazioneOliva, Calendar dataRaccolta) {
        this.codiceOliva = codiceOliva;
        this.coloreOliva = coloreOliva;
        this.maturazioneOliva = maturazioneOliva;
        this.dataRaccolta = dataRaccolta;
    }

    public void setCodiceOliva(String codiceOliva) {this.codiceOliva = codiceOliva;}
    public void setColoreOliva(ColoreOliva coloreOliva) {this.coloreOliva = coloreOliva;}
    public void setMaturazioneOliva(MaturazioneOliva maturazioneOliva) {this.maturazioneOliva = maturazioneOliva;}
    public void setDataRaccolta(Calendar dataRaccolta) {this.dataRaccolta = dataRaccolta;}
    public String getCodiceOliva() {return codiceOliva;}
    public ColoreOliva getColoreOliva() {return coloreOliva;}
    public MaturazioneOliva getMaturazioneOliva() {return maturazioneOliva;}
    public Calendar getDataRaccolta() {return dataRaccolta;}

    public String toString() {
        return "Oliva{" +
                "codiceOliva='" + codiceOliva + '\'' +
                ", coloreOliva=" + coloreOliva +
                ", maturazioneOliva=" + maturazioneOliva +
                ", dataRaccolta=" + dataRaccolta +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oliva oliva = (Oliva) o;

        if (codiceOliva != null ? !codiceOliva.equals(oliva.codiceOliva) : oliva.codiceOliva != null) return false;
        if (coloreOliva != oliva.coloreOliva) return false;
        if (maturazioneOliva != oliva.maturazioneOliva) return false;
        return dataRaccolta != null ? dataRaccolta.equals(oliva.dataRaccolta) : oliva.dataRaccolta == null;

    }
}
