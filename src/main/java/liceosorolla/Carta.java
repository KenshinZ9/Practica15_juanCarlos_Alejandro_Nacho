package main.java.liceosorolla;

public class Carta {
	private int numero;
	private Figura figura;
	
	
	public Carta(Figura figura, int numero) {
		this.figura=figura;
		this.numero=numero;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Figura getFigura() {
		return figura;
	}
	public void setFigura(Figura figura) {
		this.figura = figura;
	}
	
	public String toString() {
		if(numero==0) {
			return "Carta [figura=" + figura + "]";
		}else {
			return "Carta [numero="+ numero+ "]";
		}
	}
}
