package app;

import java.lang.reflect.InvocationTargetException;

import factories.EquipamentoFactory;
import model.Equipamento;
import model.EquipamentoEnum;

public class Main {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException {

		// Teste de acessorio
		System.out.println("Teste da fabrica de acessorio");
		EquipamentoFactory fabricaAcessorio = EquipamentoFactory.puxarFactory(EquipamentoEnum.ACESSORIO, "Anilha",
				25,"Anilha pra supino", 5.0, "");	
		Equipamento acessorio = fabricaAcessorio.createEquipamento();
		System.out.println(acessorio.getIdentificador());
		System.out.println(acessorio.getQuantidade());
		fabricaAcessorio.setIdentificador("Corda");
		fabricaAcessorio.setQuantidade(2);
		Equipamento acessorio2 = fabricaAcessorio.createEquipamento();
		System.out.println(acessorio2.getIdentificador());
		System.out.println(acessorio2.getQuantidade());
		fabricaAcessorio.setIdentificador("Anilha");
		fabricaAcessorio.setQuantidade(1);
		Equipamento acessorio3 = fabricaAcessorio.createEquipamento();
		System.out.println(acessorio3.getIdentificador());
		System.out.println(acessorio3.getQuantidade());
		
		
		// Teste de haltere
		System.out.println("Teste da fabrica de haltere");
		EquipamentoFactory fabricaHaltere = EquipamentoFactory.puxarFactory(EquipamentoEnum.HALTERE, "Haltere de ferro", 5,
				null, 20.0, null);
		Equipamento haltere = fabricaHaltere.createEquipamento();
		System.out.println(haltere.getIdentificador());
		System.out.println(haltere.getQuantidade());
		fabricaHaltere.setIdentificador("Haltere de bronze");
		fabricaHaltere.setQuantidade(4);
		Equipamento haltere2 = fabricaHaltere.createEquipamento();
		System.out.println(haltere2.getIdentificador());
		System.out.println(haltere2.getQuantidade());
		fabricaHaltere.setIdentificador("Barra emborrachada");
		fabricaHaltere.setQuantidade(2);
		Equipamento haltere3 = fabricaHaltere.createEquipamento();
		System.out.println(haltere3.getIdentificador());
		System.out.println(haltere3.getQuantidade());
		fabricaHaltere.setIdentificador("Haltere de ferro");
		fabricaHaltere.setQuantidade(-1);
		Equipamento haltere4 = fabricaHaltere.createEquipamento();
		System.out.println(haltere4.getIdentificador());
		System.out.println(haltere4.getQuantidade());
		
		// Teste de máquina
		System.out.println("Teste da fabrica de maquina");
		EquipamentoFactory fabricaMaquina = EquipamentoFactory.puxarFactory(EquipamentoEnum.MAQUINA, "Cross Over", 2,
				"Para treino de peito", 0, "Polishop");
		Equipamento maquina = fabricaMaquina.createEquipamento();
		System.out.println(maquina.getIdentificador());
		System.out.println(maquina.getQuantidade());
	
	}

}
