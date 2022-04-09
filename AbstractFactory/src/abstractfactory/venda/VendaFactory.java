
package abstractfactory.venda;

import abstractfactory.boleto.Boleto;
import abstractfactory.nfe.NFE;

public interface VendaFactory {
 
    public NFE criarNFE();
            
    public Boleto criarBoleto();
}
