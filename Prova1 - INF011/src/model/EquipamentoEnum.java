package model;

public enum EquipamentoEnum {

	MAQUINA("factories.MaquinaFactory"),
	HALTERE("factories.HaltereFactory"),
	ACESSORIO("factories.AcessorioFactory");

	public String tipo;

	EquipamentoEnum(String tipo) {
		this.tipo = tipo;}
	
	public String puxarNameFactory() {
		return this.tipo;
	}

}