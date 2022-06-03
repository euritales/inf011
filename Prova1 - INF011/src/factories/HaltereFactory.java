package factories;
import model.Equipamento;
import model.Haltere;

public class HaltereFactory extends EquipamentoFactory {

	@Override
	public Equipamento createEquipamento() {
		int Existe = EquipamentoFactory.posEquipamento(identificador, equipamentos);
		if (Existe == -1) {
			Haltere haltere = new Haltere(this.identificador, this.quantidade, this.peso);
			this.equipamentos.add(haltere);
			return haltere;
		}else {
			Equipamento h = equipamentos.get(Existe);
			int Qtd = h.getQuantidade() + this.quantidade;
			h.setQuantidade(Qtd);
			return h;
		}
	}
}