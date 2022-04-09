
package abstractfactory.loja;

import abstractfactory.boleto.BoletoBancoBrasil;
import abstractfactory.nfe.NFESaoPaulo;
import abstractfactory.boleto.Boleto;
import abstractfactory.nfe.NFE;
import abstractfactory.venda.VendaFactory;

public class LojaCentroDaInformatica implements VendaFactory{

    @Override
    public NFE criarNFE() {
        
        NFE notaFiscal = new NFESaoPaulo();
        return notaFiscal;
    }

    @Override
    public Boleto criarBoleto() {
        Boleto boleto = new BoletoBancoBrasil();
        
        return boleto;
    }
    
}
