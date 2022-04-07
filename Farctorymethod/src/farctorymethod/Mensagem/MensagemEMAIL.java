
package farctorymethod.Mensagem;

import javax.swing.JOptionPane;

public class MensagemEMAIL implements Mensagem{
    
    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null, "E-MAIL: "+ mensagem);
    }
    
}
