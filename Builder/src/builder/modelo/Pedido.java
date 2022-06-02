package builder.modelo;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
 
    private String numeroPedido;
    
    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;
    
    public BigDecimal getValores(){
        
        BigDecimal total = BigDecimal.ZERO;
        
        for(Produto produto : produtos){
            total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
        }
        return total;
            
    }
    
    public int getTotalProdutos(){
        int total = 0;
        for
    }
}
