package it.polito.tdp.bar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


public class Simulazione {
	
	//simulazione
	
	
	//costanti
	
	private int NUM_EVENTI = 2000;
	
	
	//variabili di output
	private int numero_totale_clienti;
	private int numero_clienti_soddisfatti;
	private int numero_clienti_insoddisfatti;
	private Statistiche statistica;
	
	
	//coda
	PriorityQueue<Event> coda = new PriorityQueue<>(new EventComparator());
	
	//parametri simulazione
	private int DURATA_MINIMA = 60;
	private int DURATA_MASSIMA = 120;
	private List<Tavolo> tavoli = new ArrayList<>();
	
	//inizializzazione
	

	public void init() {
		
		creaTavoli();
		
		Collections.sort(tavoli);
		
		int tempo =0; 
		
		
		
		for(int i=0 ; i<2000; i++) {
			
			int arrivo =  (int) (1+10*Math.random()); 
			int numeroPersone = (int) (1+10*Math.random()); 
			int durata = (int) (61+60*Math.random()); 
			float tolleranza = (float) Math.random();
			tempo+=arrivo;
			Gruppo g = new Gruppo(tempo, durata, numeroPersone, tolleranza);
			Event e = new Event(tempo, EventType.ARRIVO_GRUPPO_CLIENTI,g );
			//System.out.println(e.getGruppo().toString());
			
			
			coda.add(e);
			numero_totale_clienti+=e.getGruppo().getNumeroPersone();
		}
		
	}
	
	private void creaTavoli() {
		for(int i =0 ; i< 2  ; i++) {
			tavoli.add(new Tavolo(i, 10, false));
		}
		for(int i = 2 ; i<6; i++) {
			tavoli.add(new Tavolo(i,8,false ));
		}
		for(int i = 6 ; i<10; i++) {
			tavoli.add(new Tavolo(i,6,false));
		}
		for(int i = 10 ; i<15; i++) {
			tavoli.add(new Tavolo(i,4,false));
		}
	}
	
	
	//simulazione
	
	public void run() {
		
		Event e;
		while((e = coda.poll())!=null) {    
			//System.out.println(e.getGruppo().toString());
			processEvent(e);
		}
		
		statistica = new Statistiche(numero_totale_clienti, numero_clienti_soddisfatti, numero_clienti_insoddisfatti);
	}
	
	
	private void processEvent(Event e) {
		
		switch(e.getTipo()) {
		case ARRIVO_GRUPPO_CLIENTI:
			int numClienti = e.getGruppo().getNumeroPersone();
			Tavolo tavDisp = tavoloDisponibile(numClienti);
			if(tavDisp==null){
				float probabilita = (float) Math.random();
				if(probabilita>e.getGruppo().getTollerenza()) {
					numero_clienti_insoddisfatti+=e.getGruppo().getNumeroPersone();
				}else {
					numero_clienti_soddisfatti+=e.getGruppo().getNumeroPersone();
				}
			}else {
				Event e1 = new Event(e.getTime()+e.getGruppo().getDurata(), EventType.PARTENZA_GRUPPO_CLIENTI, e.getGruppo());
				e1.setTavolo(tavDisp);
				e1.getTavolo().setOccupato(true);
				coda.add(e1);
				numero_clienti_soddisfatti+=e.getGruppo().getNumeroPersone();	
			}
			break;
			
		case PARTENZA_GRUPPO_CLIENTI:
			
			e.getTavolo().setOccupato(false);
			
			
			break;
		}
		
		
	}

	

	private Tavolo tavoloDisponibile(int numClienti) {

		for(Tavolo t : tavoli) {
			if(!t.isOccupato() && t.getCapienza()>=numClienti && numClienti>=0.5*t.getCapienza()) {
				return t;
			}
		}
		return null;
	}

	public List<Tavolo> getTavoli() {
		return tavoli;
	}

	public int getNumero_totale_clienti() {
		return numero_totale_clienti;
	}

	public int getNumero_clienti_soddisfatti() {
		return numero_clienti_soddisfatti;
	}

	public int getNumero_clienti_insoddisfatti() {
		return numero_clienti_insoddisfatti;
	}

	public Statistiche getStatistica() {
		return statistica;
	}


	
	
	
	
	
	

}
