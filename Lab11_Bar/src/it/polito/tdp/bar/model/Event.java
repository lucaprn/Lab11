package it.polito.tdp.bar.model;



public class Event {
	
	private int time; 
	private EventType tipo;
	private Gruppo gruppo;
	private Tavolo tavolo;
	
	
	public Event(int time, EventType tipo, Gruppo gruppo) {
		super();
		this.time = time;
		this.tipo = tipo;
		this.gruppo = gruppo;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public EventType getTipo() {
		return tipo;
	}


	public void setTipo(EventType tipo) {
		this.tipo = tipo;
	}


	public Gruppo getGruppo() {
		return gruppo;
	}


	public void setGruppo(Gruppo gruppo) {
		this.gruppo = gruppo;
	}


	@Override
	public String toString() {
		return "Event [time=" + time + ", tipo=" + tipo + ", gruppo=" + gruppo + "]";
	}


	public Tavolo getTavolo() {
		return tavolo;
	}


	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}
	
	
	
	

	
	
	
	
	

}
