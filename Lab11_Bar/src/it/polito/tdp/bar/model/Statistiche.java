package it.polito.tdp.bar.model;

public class Statistiche {
	
	private int clientiArrivati;
	private int clientiSoddisfatti;
	private int clientiInsoddisfatti;
	public Statistiche(int clientiArrivati, int clientiSoddisfatti, int clientiInsoddisfatti) {
		super();
		this.clientiArrivati = clientiArrivati;
		this.clientiSoddisfatti = clientiSoddisfatti;
		this.clientiInsoddisfatti = clientiInsoddisfatti;
	}
	public int getClientiArrivati() {
		return clientiArrivati;
	}
	public void setClientiArrivati(int clientiArrivati) {
		this.clientiArrivati = clientiArrivati;
	}
	public int getClientiSoddisfatti() {
		return clientiSoddisfatti;
	}
	public void setClientiSoddisfatti(int clientiSoddisfatti) {
		this.clientiSoddisfatti = clientiSoddisfatti;
	}
	public int getClientiInsoddisfatti() {
		return clientiInsoddisfatti;
	}
	public void setClientiInsoddisfatti(int clientiInsoddisfatti) {
		this.clientiInsoddisfatti = clientiInsoddisfatti;
	}
	
	
	
	

}
