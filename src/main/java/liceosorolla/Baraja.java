package main.java.liceosorolla;

import java.util.ArrayList;

public class Baraja {

	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public Baraja(){
		generarCartas();
		desordenar();
	}
	

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	private void generarCartas() {
		for(int j = 0; j < 8;j++) {
			for(int i = 1; i <= 13;i++) {
				switch(i) {
				case 1:
					cartas.add(new Carta(Figura.A));
					break;
				case 2:
					cartas.add(new Carta(Figura.dos));
					break;
				case 3:
					cartas.add(new Carta(Figura.tres));
					break;
				case 4:
					cartas.add(new Carta(Figura.cuatro));
					break;
				case 5:
					cartas.add(new Carta(Figura.cinco));
					break;
				case 6:
					cartas.add(new Carta(Figura.seis));
					break;
				case 7:
					cartas.add(new Carta(Figura.siete));
					break;
				case 8:
					cartas.add(new Carta(Figura.ocho));
					break;
				case 9:
					cartas.add(new Carta(Figura.nueve));
					break;
				case 10:
					cartas.add(new Carta(Figura.diez));
					break;
				case 11:
					cartas.add(new Carta(Figura.J));
					break;
				case 12:
					cartas.add(new Carta(Figura.Q));
					break;
				case 13:
					cartas.add(new Carta(Figura.K));
					break;
				default:
				}	
			}
		}	
	}
	
	private void desordenar() {
		ArrayList<Carta> cartas2 = new ArrayList<Carta>();
		for(int j = 0; j < 104 ;j++) {
			int random = (int) (Math.random() * cartas.size());
			    cartas2.add(new Carta(cartas.get(random).getFigura()));
				cartas.remove(random);
		}
		cartas = cartas2;	
	}
	
	public Carta sacarCarta() {
		Carta carta;
		carta = cartas.get(0);
		cartas.remove(0);	
		return carta;
	}
	
	
}
