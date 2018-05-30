package it.polito.tdp.bar.model;

public class Gruppo {
	
	private int arrivo;
	private int durata;
	private int numeroPersone;
	private float tollerenza;
	
	
	public Gruppo(int arrivo, int durata, int numeroPersone, float tollerenza) {
		super();
		this.arrivo = arrivo;
		this.durata = durata;
		this.numeroPersone = numeroPersone;
		this.tollerenza = tollerenza;
	}

	public int getArrivo() {
		return arrivo;
	}

	public void setArrivo(int arrivo) {
		this.arrivo = arrivo;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getNumeroPersone() {
		return numeroPersone;
	}

	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}

	public float getTollerenza() {
		return tollerenza;
	}

	public void setTollerenza(float tollerenza) {
		this.tollerenza = tollerenza;
	}

	@Override
	public String toString() {
		return "Gruppo [arrivo=" + arrivo + ", durata=" + durata + ", numeroPersone=" + numeroPersone + ", tollerenza="
				+ tollerenza + "]";
	}


	

	
	

}
