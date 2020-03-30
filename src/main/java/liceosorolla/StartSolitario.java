package main.java.liceosorolla;

import java.util.ArrayList;

import main.java.liceosorolla.Carta;

public class StartSolitario {
	
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		ArrayList<Carta> tablero = new ArrayList<Carta>();
		ArrayList<Carta> robar = new ArrayList<Carta>();
		
		System.out.println(baraja.getCartas().size());
		
		
		/*
		for(int j = 0; j < baraja.size() ;j++) {
			int random = sacarCarta(baraja.size());
			if(baraja.get(random).getNumero() == 0) {
				tablero.add(new Carta(baraja.get(random).getFigura()));
				baraja.remove(random);
			}else{
				tablero.add(new Carta(baraja.get(random).getNumero()));
				baraja.remove(random);
			}
			if(j == 54) {
				break;
			}
				
		}
		*/
		
		for(int j = 0; j < baraja.getCartas().size();j++) {
			System.out.println(baraja.getCartas().get(j));
		}
		
		
	}
	
}
