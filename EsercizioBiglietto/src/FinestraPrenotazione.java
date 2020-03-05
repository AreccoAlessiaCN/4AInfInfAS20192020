import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class FinestraPrenotazione extends JFrame implements ActionListener {


    public static JLabel cognomeLabel = new JLabel("Cognome: ");
    public static JLabel nomeLabel = new JLabel("Nome: ");
    public static JLabel telefonoLabel = new JLabel("Telefono: ");
    public static JLabel partenzaLabel = new JLabel("Partenza: ");
    public static JLabel destinazioneLabel = new JLabel("Destinazione: ");
    public static JLabel dataLabel = new JLabel("Data: ");

    public static JTextField cognomeField = new JTextField(25);
    public static JTextField nomeField = new JTextField(25);
    public static JTextField telefonoField = new JTextField(25);
    public static JTextField partenzaField = new JTextField(25);
    public static JTextField destinazioneField = new JTextField(25);
    public static JTextField dataField = new JTextField(25);

    public static JButton confermaButton = new JButton("Conferma");
    public static JButton annullaButton = new JButton("Annulla");
    public static JButton salvaButton = new JButton("Salva");
    public static JButton stampaButton = new JButton("Stampa");


    public FinestraPrenotazione()
    {
        setTitle("Prenotazione");
        initComponets();
        setLocation(750, 250);
        setSize(400,400);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponets(){

        Container container = this.getContentPane();

        JPanel panel = new JPanel();

        panel.add(nomeLabel);
        panel.add(nomeField);

        panel.add(cognomeLabel);
        panel.add(cognomeField);

        panel.add(telefonoLabel);
        panel.add(telefonoField);

        panel.add(partenzaLabel);
        panel.add(partenzaField);

        panel.add(destinazioneLabel);
        panel.add(destinazioneField);

        panel.add(dataLabel);
        panel.add(dataField);

        container.add(panel);

        JPanel southPanel = new JPanel();

        southPanel.add(confermaButton);
        southPanel.add(annullaButton);
        southPanel.add(stampaButton);
        southPanel.add(salvaButton);

        container.add(southPanel, BorderLayout.SOUTH);

        confermaButton.addActionListener(this);
        annullaButton.addActionListener(this);
        salvaButton.addActionListener(this);
        stampaButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        Prenotazione prenotazione = new Prenotazione();
        if(e.getSource() == confermaButton){
            JOptionPane.showMessageDialog(this, "Prenotazione avvenuta con successo\nGrazie " + this.nomeField.getText());
            prenotazione.salvaSuArray(this);
            annullaButton.setEnabled(false);
        } else if (e.getSource() == annullaButton){
            JOptionPane.showMessageDialog(this, "Prenotazione annullata");
            togli();
        } else if (e.getSource() == salvaButton){
            prenotazione.salvaSuArray(this);
            JOptionPane.showMessageDialog(this, Arrays.toString(prenotazione.array));
        } else if (e.getSource() == stampaButton){
            prenotazione.salvaSuArray(this);
            JOptionPane.showMessageDialog(this, "Stamapto su file CSV");
            prenotazione.salvaCSV(this);
            togli();
            annullaButton.setEnabled(true);
        }
    }

    private void togli(){
        nomeField.setText("");
        cognomeField.setText("");
        telefonoField.setText("");
        partenzaField.setText("");
        destinazioneField.setText("");
        dataField.setText("");
    }

    public static void main(String[] args) {

        FinestraPrenotazione finestraPrenotazione = new FinestraPrenotazione();

    }


}
