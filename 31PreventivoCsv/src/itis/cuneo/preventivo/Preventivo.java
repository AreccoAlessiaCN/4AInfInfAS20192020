package itis.cuneo.preventivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Preventivo {

	//creo delle costanti
	public static final String FILE_NAME = "C:\\Users\\Emanuele\\Desktop\\workspaceEstivo\\Preventivo\\preventivo.csv";
	public static final String SEPARATOR = ",";

	//creo una lista per i clienti
	private List<Cliente> aCliente;

	//creo la variabile dell'IVA - che non verrà mai usata
	public static final int IVA= 22;

	//costruttore
	public Preventivo() {
		super();
		aCliente= new ArrayList<>();
	}

	//costruttore
	public Preventivo(List<Cliente> aCliente) {
		super();
		this.aCliente = aCliente;
	}

	//metodo per aggiungere un cliente alla lista
	public void aggiungiCliente(Cliente cliente) {
		
		this.aCliente.add(cliente);
	}
	
	
	//metodo di tipo lista che restituisce la lista di clienti
	public List<Cliente> getaCliente() {
		return aCliente;
	}

	//metodo che permette di settare la lista di clienti
	public void setaCliente(List<Cliente> aCliente) {
		this.aCliente = aCliente;
	}


	//metodo che inserisce dei clienti e degli articoli prefissati
	public void simula() {
		Cliente c= new Cliente("MARIO", "ROSSI", "VIA SOLE");
		Articolo a= new Articolo("sz1", "domestico", 100, 20, 2);
		Articolo b= new Articolo("sz2", "domestica", 15, 10, 1);
		c.aggiungiArticolo(a);
		c.aggiungiArticolo(b);
		this.aggiungiCliente(c);
		
		Cliente c2= new Cliente("LUCA", "MASI", "VIA LUNA");
		Articolo a2= new Articolo("sz3", "informatico", 200, 15, 3);
		Articolo b2= new Articolo("sz4", "domotico", 23, 10,8);
		c2.aggiungiArticolo(a2);
		c2.aggiungiArticolo(b2);
		this.aggiungiCliente(c2);
	}

	//metodo che carica nella lista il calcolo del preventivo per ogni clienti
	public void caricaClienti(Preventivo preventivo) {
		int numeroClienti=Tastiera.leggiNumero("Inserisci la quantita di clienti: ");
		
		Cliente c= new Cliente();
		for(int cntClienti=0;cntClienti<numeroClienti;cntClienti++) {
			c.caricaCliente(preventivo);
		}
	}
	
	

	@Override
	public String toString() {
		return "Preventivo [aCliente=" + aCliente + "]";
	}
	
	public void stampa() {
		System.out.println( this.toString() );
	}

	//metodo che stampa tutti i dati del cliente
	public void stampConFor() {
		float sumPreventivo=0;
		for(int cntCliente = 0; cntCliente<this.aCliente.size(); cntCliente++) {
			Cliente cliente = this.getaCliente().get(cntCliente);
			System.out.println("Cliente: " + cliente.toString());
			double totaleIvato = cliente.calcolaPrezzoTotale();
			System.out.println("Totale ivato: " + totaleIvato);
			
			sumPreventivo += totaleIvato;
		}
		System.out.println("Totale Preventivo: " + sumPreventivo);
		
	}

	//metodo che ordina l'elenco dei preventivi per cognome
	// ho dei dubbi su questa "Collections"
	public void ordinaPreventivoByCognomeCliente() {
		//richiama in automatico il metodo sort(Object) dell' elemento della lista,
		//   che implementa il metodo sort(Object) dell'interfaccia Comparable
		Collections.sort( this.aCliente );
	}

	//metodo di tipo "Cliene" per cercare un cliente attravers il suo cognome
	public Cliente ricercaClienteByCognomeAndNome(String cognome, String nome) {
		Cliente cliente=null;
		boolean foundCliente=false;
		
		for(int cntCliente = 0; cntCliente<this.aCliente.size() && !foundCliente; cntCliente++) {

			//assegna alla variabile cliente i dati del cliente che sta trattando
			cliente=this.aCliente.get(cntCliente);
			if(cliente.getCognome().equalsIgnoreCase(cognome)
				&& cliente.getNome().equalsIgnoreCase(nome)) {
				foundCliente=true;
			}
			else {
				cliente=null;
			}
		}
		
		return cliente;
	}
	
	//metodo per scrivere sul file CSV
	public void salvaCSV() {
		String str ="";

		//creo una variabile per scrivere su file
		BufferedWriter bw;

		try {
			//provo a creare un oggetto di tipo "bufferedWriter" e
			// gli passo come parametro un oggetto di tipo FileWriter
			bw= new BufferedWriter(new FileWriter(FILE_NAME));

			//per ogni cliente
			for(int cntCliente=0; cntCliente<this.aCliente.size(); cntCliente++)
			{
				//assegno i dati del cliente di turno ad un oggetto cliente
				Cliente cliente = this.aCliente.get(cntCliente);

				//scrivo sul file i valori del cliente
				bw.write(cliente.toRowCSV());

				//per ogni articolo
				for(int cntArticolo=0; cntArticolo<cliente.getaArticolo().size(); cntArticolo++) {

					//assegno i dati dell'articolo di turno ad un oggetto articolo
					Articolo articolo = cliente.getaArticolo().get(cntArticolo);

					//scrivo sul il fil ei valori dell'articolo del cliente
					bw.write(articolo.toRowCsv());
				}
			}
			
			//obbligatorio oppure il file rimane vuoto
			//forza lo svuotamento del buffer nel file, dopo di che lo chiude
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	
	}


	//metodo di apertura del file CSV
	public void apriCSV() {

		//crea un variabile di tipo BufferedReader
		BufferedReader br;
		//riga
		String rowLine;
		//creo un oggetto di tipo cliente al quale non assegno niente
		Cliente cliente= null;
		
		try {
			br = new BufferedReader(new FileReader(FILE_NAME));

			//per ogni riga che non vale null
			while((rowLine = br.readLine()) != null) {

				//creo un vettore di stringhe al cui interno inserisco tutti i valori
				// separati da un separatore
				String[] campi = rowLine.split(Preventivo.SEPARATOR);

				//serve per confrontare due stringhe senza considerare le maiuscole e minuscole
				if(campi[0].equalsIgnoreCase("Cliente")) {
					cliente = new Cliente(campi[1], campi[2], campi[3]);
					this.aggiungiCliente(cliente);
				}

				//serve per confrontare due stringhe senza considerare le maiuscole e minuscole
				if(campi[0].equalsIgnoreCase("Articolo")) {
					//public Articolo(String codice, String descrizione, double importoSenzaIVA, int scontoPercentuale, int quantita) 
					Articolo articolo = new Articolo(campi[1], campi[2], Double.parseDouble(campi[3]),
										Integer.parseInt(campi[4]), Integer.parseInt(campi[5]));
					cliente.aggiungiArticolo(articolo);
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public static void main(String[]args) {
		//metodo simula()
		Preventivo p= new Preventivo();
		p.simula();
		
		/*Cliente cliente = p.getaCliente().get(0);
		double totaleIvato = cliente.calcolaPrezzoTotale();
		System.out.println("totaleIvato: " + totaleIvato);
		*/
		//p.caricaClienti(p);
		
		System.out.println("\n\n\n*********<stampa preventivo..");
		p.stampa();
		
		System.out.println("\n\n\n*********stampa preventivo con for..");
		p.stampConFor();
		
		System.out.println("\n\n\n*********stampa preventivo ordinato..");
		p.ordinaPreventivoByCognomeCliente();
		p.stampa();
		
		System.out.println("\n\n\n*********stampa preventivo dopo rimuovi..");
		Cliente cliente = p.ricercaClienteByCognomeAndNome("Rossi", "Mario");
		if(cliente!= null) {
			cliente.eliminaArticolo("A1");
		}
		p.stampa();
		
		p.salvaCSV();
		
		Preventivo preventivo2 = new Preventivo();
		preventivo2.apriCSV();
		System.out.println("\n\n\n*********stampa preventivo dopo caricamento da CSV..");
		preventivo2.stampa();
	}

	
}
