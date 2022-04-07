
package farctorymethod;

import javax.swing.JOptionPane;

import farctorymethod.Mensagem.Mensagem;
import farctorymethod.Mensagem.MensagemFactory;


public class Principal {

  
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Insira seu texto",null);
        
        Mensagem mensagem = MensagemFactory.getMensagem(1);
        mensagem.enviar(texto);
    }
    
}
