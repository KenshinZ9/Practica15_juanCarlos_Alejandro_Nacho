package main.java.liceosorolla;

import java.util.ArrayList;

public class Columna {
	
	private ArrayList<Carta> columna = new ArrayList<Carta>();
	
	
	public Columna() {
	}

	public ArrayList<Carta> getColumna() {
		return columna;
	}
	public void setColumna(ArrayList<Carta> columna) {
		this.columna = columna;
	}
	
	public void  agregarCarta(Carta carta) {
		columna.add(carta);	
	}
}

