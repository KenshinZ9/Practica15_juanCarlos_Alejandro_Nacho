package main.java.liceosorolla;

import java.util.ArrayList;

import main.java.liceosorolla.Carta;

public class StartSolitario {
	
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		ArrayList<Carta> tablero = new ArrayList<Carta>();
		
	
		for(int j = 0; j < baraja.getCartas().size();j++) {
			System.out.println(baraja.getCartas().get(j));
		}
		
		pasar(54,tablero,baraja);
		
		System.out.println(baraja.getCartas().size());
		
		for(int j = 0; j < tablero.size();j++) {
			System.out.println(tablero.get(j));
		}
		System.out.println(tablero.size());
		
		Tablero.tablero(tablero);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void pasar(int cantidad, ArrayList<Carta> tablero, Baraja baraja) {
		for(int j = 0; j < cantidad ;j++) {
			tablero.add(baraja.sacarCarta());
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
