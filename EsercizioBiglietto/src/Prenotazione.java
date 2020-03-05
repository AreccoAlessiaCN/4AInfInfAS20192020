import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Prenotazione {

    public static final String PATH_FILE_CSV ="src\\prenotazioni.csv";
    public static final String SEPARATOR =",";
    public String array[] = new String[6];


    public void salvaSuArray(FinestraPrenotazione finestraPrenotazione){

        array[0] = "Nome: " + finestraPrenotazione.nomeField.getText();
        array[1] = "\n" +"Cognome: " + finestraPrenotazione.cognomeField.getText();
        array[2] = "\n" +"Telefono: " + finestraPrenotazione.telefonoField.getText();
        array[3] = "\n" +"Partenza: " + finestraPrenotazione.partenzaField.getText();
        array[4] = "\n" +"Destinazione" + finestraPrenotazione.destinazioneField.getText();
        array[5] = "\n" + "Data: " + finestraPrenotazione.dataField.getText();
    }

    public String toRowCsv(FinestraPrenotazione finestraPrenotazione){
        return "PRENOTAZIONE" +
                "\n" + array[0] + SEPARATOR +
                "\n" + array[1] + SEPARATOR +
                "\n" + array[2] + SEPARATOR +
                "\n" + array[3] + SEPARATOR +
                "\n" + array[4] + SEPARATOR +
                "\n" + array[5] + "\n \n";
    }


    public void salvaCSV(FinestraPrenotazione finestraPrenotazione) {

        File file = new File(PATH_FILE_CSV);
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(file, true));

            bw.write(this.toRowCsv(finestraPrenotazione));

            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
