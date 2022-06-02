package factories;
import model.Acessorio;
import model.Equipamento;

public class AcessorioFactory extends EquipamentoFactory {

	@Override
	public Equipamento createEquipamento() {
		int Existe = EquipamentoFactory.posEquipamento(identificador, equipamentos);
		if (Existe == -1) {
			Acessorio acessorio = new Acessorio(this.identificador, this.quantidade, this.descricao);
			this.equipamentos.add(acessorio);
			return acessorio;
		} else {
			Equipamento a = equipamentos.get(Existe);
			int Qtd = a.getQuantidade() + this.quantidade;
			a.setQuantidade(Qtd);
			return a;
		}
	}
}
