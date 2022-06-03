package factories;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import model.Equipamento;
import model.EquipamentoEnum;

public abstract class EquipamentoFactory {

	protected String identificador;
	protected int quantidade;
	protected String descricao;
	protected double peso;
	protected String marca;
	public List<Equipamento> equipamentos = new ArrayList();

	public abstract Equipamento createEquipamento();

	public static EquipamentoFactory puxarFactory(EquipamentoEnum tipo, String identificador, int quantidade,
			String descricao, double peso, String marca)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException {
		EquipamentoFactory fabrica = (EquipamentoFactory) Class.forName(tipo.puxarNameFactory()).getConstructor()
				.newInstance();
		fabrica.setIdentificador(identificador);
		fabrica.setQuantidade(quantidade);
		fabrica.setDescricao(descricao);
		fabrica.setPeso(peso);
		fabrica.setMarca(marca);
		return fabrica;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static int posEquipamento(String identificador, List<Equipamento> equipamentos) {
		for (int i = 0; i < equipamentos.size(); i++) {
			if (identificador.equals(equipamentos.get(i).getIdentificador())) {
				return i;
			}
		}
		return -1;
	}
}