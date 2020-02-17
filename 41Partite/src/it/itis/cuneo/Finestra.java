import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Finestra extends  JFrame implements ActionListener {

    JLabel lSquadra1;
    JLabel lSquadra2;
    JTextField tSquadra1;
    JTextField tSquadra2;
    JButton bInvia;
    JLabel lCompleto;

    public Finestra()
    {
        setSize(800,600);
        setLocation(200, 200);
        setTitle("Squadre");
        initComponets();
        //pack();
        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.BLUE);
        Container container = this.getContentPane();
        container.add(myPanel);
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets() {
        // TODO Auto-generated method stub
        this.setLayout(new FlowLayout());
        lSquadra1 = new JLabel("Squadra 1");
        this.add(lSquadra1);
        tSquadra1 = new JTextField(20);
        this.add(tSquadra1);
        lSquadra2 = new JLabel("Squadra 2: ");
        this.add(lSquadra2);
        tSquadra2= new JTextField(20);
        this.add(tSquadra2);
        bInvia= new JButton("Invia");
        this.add(bInvia);
        lCompleto = new JLabel("Squadra 1 - Squadra 2");
        this.add(lCompleto);
        bInvia.addActionListener(this);
    }

    //@Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        if (ae.getSource() == bInvia)
        {
            lCompleto.setText(tSquadra1.getText()+" "+tSquadra2.getText());
        }
    }

    public static void main(String[] args)
    {
        Finestra fs = new Finestra();
    }
}
