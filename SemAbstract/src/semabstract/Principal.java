
package semabstract;

import java.math.BigDecimal;
import semabstract.modelo.Produto;
import semabstract.venda.NFE;

public class Principal {

    public static void main(String[] args) {
        
        Produto produto = new Produto();
        
        produto.setNome("Smartphone Samsumg A12");
        produto.setQuantidade(1);
        produto.setValorUnitario(new BigDecimal(1200));
        
                

           
    }
    
}
