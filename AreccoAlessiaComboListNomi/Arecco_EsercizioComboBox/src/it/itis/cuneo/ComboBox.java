import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

public class ComboBox extends JFrame implements ActionListener  {
    JList<String> listaStudenti;
    JTextField nome;
    JTextField cognome;
    JLabel labelNome;
    JLabel labelCognome;
    JButton inserisci;
    DefaultListModel defaultListaStudenti;
    JComboBox comboBox;

    public ComboBox()
    {
        setTitle("ComboBox");
        initComponets();
        setLocation(750, 250);
        setSize(600, 600);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void initComponets(){
        Container container = this.getContentPane();
        JPanel panel = new JPanel();

        labelNome = new JLabel("Nome");
        nome = new JTextField(15);
        labelCognome = new JLabel("Cognome");
        cognome = new JTextField(15);
        inserisci = new JButton("Inserisci");
        inserisci.addActionListener(this);
        panel.add(labelNome);
        panel.add(nome);
        panel.add(labelCognome);
        panel.add(cognome);
        panel.add(inserisci);

        container.add(panel, BorderLayout.NORTH);

        JPanel cpanel = new JPanel();

        comboBox = new JComboBox();
        cpanel.add(comboBox);


        defaultListaStudenti = new DefaultListModel();
        this.listaStudenti= new JList<String>(defaultListaStudenti);

        JScrollPane scrollPane = new JScrollPane(listaStudenti);

        cpanel.add(scrollPane);
        container.add(cpanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        ComboBox combo = new ComboBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==inserisci){
            if (nome.getText() != null && cognome.getText() != null){
                comboBox.addItem(nome.getText() +" "+ cognome.getText());
                defaultListaStudenti.addElement(nome.getText() +" "+ cognome.getText());
                nome.setText("");
                cognome.setText("");
            }
        }
    }
}
