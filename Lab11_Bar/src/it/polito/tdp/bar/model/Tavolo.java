package it.polito.tdp.bar.model;

public class Tavolo implements Comparable<Tavolo>{
	
	private int id;
	private int capienza;
	private boolean occupato;
	public Tavolo(int id, int capienza, boolean occupato) {
		super();
		this.id = id;
		this.capienza = capienza;
		this.occupato = occupato;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapienza() {
		return capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	public boolean isOccupato() {
		return occupato;
	}
	public void setOccupato(boolean occupato) {
		this.occupato = occupato;
	}
	@Override
	public String toString() {
		return "Tavolo [id=" + id + ", capienza=" + capienza + ", occupato=" + occupato + "]";
	}
	@Override
	public int compareTo(Tavolo t) {
		
		return capienza-t.getCapienza();
	}
	
	
	

}
