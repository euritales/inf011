
package abstractfactory;

import abstractfactory.loja.LojaCentroDaInformatica;
import abstractfactory.modelo.Produto;
import abstractfactory.venda.Venda;
import abstractfactory.venda.VendaFactory;
import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto();
        
        produto.setNome("Smartphone Moto X5");
        produto.setQuantidade(1);
        produto.setValorUnitario(new BigDecimal(1200));

        VendaFactory factory = new LojaCentroDaInformatica();  
        
        Venda venda = new Venda(factory);
        venda.realizarVenda(produto);
    }

    
}
