package model;

public class Acessorio extends Equipamento {

	private String descricao;

	public Acessorio() {
	}

	public Acessorio(String identificador, int quantidade, String descricao) {
		super(identificador, quantidade);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
