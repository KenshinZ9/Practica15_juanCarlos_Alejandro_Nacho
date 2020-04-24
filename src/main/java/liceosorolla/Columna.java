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
	
	public void girar() {
		columna.get(columna.size()-1).setX(true);
	}
	
	public ArrayList<Carta> eliminar(int numero){
		ArrayList<Carta> cartasEliminadas = new ArrayList<Carta>();
		for(int i=0;i < numero;i++) {
			cartasEliminadas.add(columna.get(columna.size()-1));
			columna.remove(columna.size()-1);
		}
		return cartasEliminadas;
	}
	
	public void agregarCartas(ArrayList<Carta> cartas){
		System.out.println("El tamaño es:"+cartas.size());
		for(int i=cartas.size()-1;i >= 0;i--) {
			columna.add(cartas.get(i));
			System.out.println(columna.size());
			System.out.println("CArta");
			System.out.println(cartas.get(i).toString());
	
		}
		
	}
	
	public ArrayList<Carta> guardar(int numero){
		ArrayList<Carta> cartasEliminadas = new ArrayList<Carta>();
		int tamaño = columna.size()-1;
		for(int i=0;i < numero;i++) {
			cartasEliminadas.add(columna.get(tamaño));
			tamaño--;
			System.out.println("Eo"+cartasEliminadas.toString());
			}
		return cartasEliminadas;
	}
	
	public static boolean correcto(ArrayList<Carta> cartas) {
		boolean si = false;
		int c = 0;
		for(int i=cartas.size()-1;i >= 0;i--) {
			System.out.println(cartas.get(i).getFigura().ordinal());
				if(i > 0 && cartas.get(i).isX()){
				c = cartas.get(i).getFigura().ordinal() - cartas.get(i-1).getFigura().ordinal();
				System.out.println("Esto menos"+cartas.get(i).getFigura().ordinal());
				System.out.println("Esto"+cartas.get(i-1).getFigura().ordinal());
				System.out.println("La suma es "+c);
				if(c == 1) {
					si = true;
				}else {
					return si = false;
				}
			}
		}
	return si;
	}
	
	
}

