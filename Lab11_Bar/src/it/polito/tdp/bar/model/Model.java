package it.polito.tdp.bar.model;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class Model {
	
private Simulazione simulazione;

public Model() {
	
	
}
public void simula() {
	simulazione=new Simulazione();
	simulazione.init();
	simulazione.run();
}
public Statistiche getStat() {
	return simulazione.getStatistica();
}

}
