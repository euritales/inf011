package factories;
import model.Equipamento;
import model.Maquina;

public class MaquinaFactory extends EquipamentoFactory {

	@Override
	public Equipamento createEquipamento() {
		int Existe = EquipamentoFactory.posEquipamento(identificador, equipamentos);
		if (Existe == -1) {
			Maquina maquina = new Maquina(this.identificador, this.quantidade, this.descricao, this.marca);
			this.equipamentos.add(maquina);
			return maquina;
		} else {
			Equipamento m = equipamentos.get(Existe);
			int Qtd = m.getQuantidade() + this.quantidade;
			m.setQuantidade(Qtd);
			return m;
		}
	}
}
