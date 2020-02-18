package it.itis.cuneo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Calcolatrice extends  JFrame implements ActionListener {

    JLabel lFattore1;
    JLabel lFattore2;
    JLabel lRisultato;
    JTextField tFattore1;
    JTextField tFattore2;
    JButton bAddizione;
    JButton bSottrazione;
    JButton bMoltiplicazione;
    JButton bDivisione;

    public Calcolatrice()
    {
        setSize(800,600);
        setLocation(200, 200);
        setTitle("Fattori");
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
        lFattore1 = new JLabel("Primo fattore: ");
        this.add(lFattore1);
        tFattore1 = new JTextField(20);
        this.add(tFattore1);
        lFattore2 = new JLabel("Secondo fattore: ");
        this.add(lFattore2);
        tFattore2= new JTextField(20);
        this.add(tFattore2);

        //tasto addizione
        bAddizione= new JButton("Addizione");
        this.add(bAddizione);
        bAddizione.addActionListener(this);

        //tasto sottrazione
        bSottrazione = new JButton("Sottrazione");
        this.add(bSottrazione);
        bSottrazione.addActionListener(this);

        //tasto moltiplicazione
        bMoltiplicazione= new JButton("Moltiplicazione");
        this.add(bMoltiplicazione);
        bMoltiplicazione.addActionListener(this);

        //tasto divisione
        bDivisione = new JButton("Divisione");
        this.add(bDivisione);
        bDivisione.addActionListener(this);

        lRisultato = new JLabel("Risultato: ");
        this.add(lRisultato);
    }

    public String getSomma(String tFattore1, String tFattore2){

        int fattore1 = Integer.parseInt(tFattore1);
        int fattore2 = Integer.parseInt(tFattore2);

        String risultato = String.valueOf(fattore1 + fattore2);

        return risultato;

    }

    public String getDifferenza(String tFattore1, String tFattore2){

        int fattore1 = Integer.parseInt(tFattore1);
        int fattore2 = Integer.parseInt(tFattore2);

        String risultato = String.valueOf(fattore1 - fattore2);

        return risultato;

    }

    public String getProdotto(String tFattore1, String tFattore2){

        int fattore1 = Integer.parseInt(tFattore1);
        int fattore2 = Integer.parseInt(tFattore2);

        String risultato = String.valueOf(fattore1 * fattore2);

        return risultato;

    }
    public String getQuoziente(String tFattore1, String tFattore2){

        int fattore1 = Integer.parseInt(tFattore1);
        int fattore2 = Integer.parseInt(tFattore2);

        String risultato = String.valueOf(fattore1 / fattore2);

        return risultato;

    }


    //@Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        if (ae.getSource() == bAddizione)
        {
            lRisultato.setText(getSomma(tFattore1.getText(), tFattore2.getText()));
        } else {

            if (ae.getSource() == bSottrazione)
            {
                lRisultato.setText(getDifferenza(tFattore1.getText(), tFattore2.getText()));
            } else {

                if (ae.getSource() == bMoltiplicazione)
                {
                    lRisultato.setText(getProdotto(tFattore1.getText(), tFattore2.getText()));
                } else {

                    if (ae.getSource() == bDivisione)
                    {
                        lRisultato.setText(getQuoziente(tFattore1.getText(), tFattore2.getText()));
                    }
                }
            }
        }
    }



    public static void main(String[] args)
    {
        Calcolatrice fs = new Calcolatrice();

    }
}