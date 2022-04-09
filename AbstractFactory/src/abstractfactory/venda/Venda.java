package abstractfactory.venda;

import abstractfactory.boleto.Boleto;
import abstractfactory.modelo.Produto;
import abstractfactory.nfe.NFE;

public class Venda {
    
    private NFE notafiscal;
    private Boleto boleto;
    
    public Venda(VendaFactory factory){
        this.notafiscal = factory.criarNFE();
        
        this.boleto = factory.criarBoleto();
        
    }
    
    public void realizarVenda(Produto produto){
        double imposto = notafiscal.calcularImposto(produto);
        
        boleto.emitir(produto, imposto);
        
    }
}
