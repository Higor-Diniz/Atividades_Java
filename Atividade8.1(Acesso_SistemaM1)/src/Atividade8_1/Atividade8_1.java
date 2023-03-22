
package Atividade8_1;

import javax.swing.JOptionPane;

public class Atividade8_1 {

    public static void main(String[] args) {
        String senha;
        String caixa ;
        caixa= JOptionPane.showInputDialog(null,"Digite a Senha para adentrar ao sistema: ");
        
        if ("batatafrita".equals(caixa)){
            JOptionPane.showMessageDialog(null,"Acesso Permitido");
        }
        else {
            JOptionPane.showMessageDialog(null,"Acesso negado");
        }
    }
    
}
