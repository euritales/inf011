package model;

public class Haltere extends Equipamento {

	private double peso;

	public Haltere() {
	}

	public Haltere(String identificador, int quantidade, double peso) {
		super(identificador, quantidade);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
