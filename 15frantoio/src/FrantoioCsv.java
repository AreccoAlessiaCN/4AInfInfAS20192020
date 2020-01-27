import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by inf.areccoa1405 on 19/12/2019.
 */
public class FrantoioCsv {
    public static final String FILE_PATH = "";
    public static final String FILE_NAME = "frantoio.csv";

    private String linea;

    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;

    public ArrayList<Oliva> leggiFile(){
        List<Oliva> lOliva = new ArrayList<Oliva>();

        bufferedReader = new BufferedReader(new FileReader(new File(FrantoioCsv.FILE_PATH +FrantoioCsv.FILE_NAME)));


        return lOliva;
    }

    public int scriviFile(){

    }

}
