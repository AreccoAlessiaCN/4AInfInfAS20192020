package it.itis.cuneo;

import java.util.Date;

/**
 * Created by inf.areccoa1405 on 30/10/2019.
 */
public class Libreria {

    //attributi

    public static final int MAX_LIBRI = 3;
    private Libro[] vLibri;
    private int cLibro; //<-- contatore

    public Libreria (){
        //costruttore di array
        vLibri = new Libro[MAX_LIBRI];
        cLibro = 0;
    }

    public void addLibro(Libro libro) throws LibreriaPienaException{
        if(cLibro > MAX_LIBRI)
            throw new LibreriaPienaException(1, "Troppi libri");
        vLibri[cLibro] = libro;
        cLibro++;
            }

    public static void main(String[] args) {
        Libro libro1 = new Libro ("Alice", "Lewis Carrol", "12243511445", InputOutputUtility.convertiDataOraToCalendar("30/10/2019", InputOutputUtility.dfDay));

        Libro libro2 = new Libro ("Pinocchio", "Collodi", "124972835910", InputOutputUtility.convertiDataOraToCalendar("23/12/1234", InputOutputUtility.dfDay));

        Libreria libreria = new Libreria();
        try{
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
        } catch (LibreriaPienaException e){
            e.printStackTrace();
            System.out.println(e.toString());
        }

        System.out.println(libreria.toString());

    }
}
