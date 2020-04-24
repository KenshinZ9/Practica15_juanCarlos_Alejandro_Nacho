package main.java.liceosorolla;

import java.util.ArrayList;

public class Tablero {

	private ArrayList<Columna> columnas = new ArrayList<Columna>();
	
	
	public Tablero(){
		for(int i=0;i < 10;i++) {
			columnas.add(new Columna());
		}
	}
	                
	public void pasar(ArrayList<Carta> cartas,int numero) {
		for(int j=0;j < numero;j++) {
			columnas.get(j%10).agregarCarta(cartas.get(j));
		}		
	}
	
	public void imprimir() {
		int mayor = maximo();
		for(int i=0;i < mayor;i++) {
			for(int j=0;j < 10;j++) {
				if(columnas.get(j).getColumna().size() > i) {
					System.out.print(columnas.get(j).getColumna().get(i));	
				}else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}		
	}
	
	public int maximo() {	
		int mayor = columnas.get(0).getColumna().size();
		for(int i=1;i < 10;i++) {
			if(mayor < columnas.get(i).getColumna().size()) {
				mayor = columnas.get(i).getColumna().size();			}
		}
		return mayor;	
	}
	
	public void girar(){
		for(int i=0;i < 10;i++) {
				columnas.get(i).girar();
		}
	}

	
	public void mover(int numero,int numero2,int cantidad){
	if(cantidad == 1) {
		if(columnas.get(numero2).getColumna().get(columnas.get(numero2).getColumna().size()-1).getFigura().ordinal() - 1  ==  columnas.get(numero).getColumna().get(columnas.get(numero).getColumna().size()-1).getFigura().ordinal()) {
			columnas.get(numero2).agregarCartas(columnas.get(numero).eliminar(cantidad));	
		}
	}else {	
		if(columnas.get(numero2).correcto(columnas.get(numero).guardar(cantidad)) && columnas.get(numero2).comprobarPasar(columnas.get(numero).guardar(cantidad)))
			columnas.get(numero2).agregarCartas(columnas.get(numero).eliminar(cantidad));	
		}
	
	}
}	