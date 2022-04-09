package abstractfactory.boleto;

import abstractfactory.modelo.Produto;

public interface Boleto {

    public void emitir(Produto produto, double imposto); 
}
