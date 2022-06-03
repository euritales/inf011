package model;

public class Maquina extends Equipamento {

	private String descricao;
	private String marca;

	public Maquina() {
	}

	public Maquina(String identificador, int quantidade, String descricao, String marca) {
		super(identificador, quantidade);
		this.descricao = descricao;
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
