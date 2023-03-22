
package Atividade8;

import javax.swing.JOptionPane;

public class Atividade8 {

    public static void main(String[] args) {
        int senha;
        String caixa ;
        
        caixa= JOptionPane.showInputDialog(null,"Por gentileza informe o número corespondente a senha para acessar o sistema: \n"
                                          + "Insira 1-Para Batata Frita\nInsira 2-Para Batata Cozida\nInsira 3-Para Batata Assada");
        senha=Integer.parseInt(caixa);
        
        if (senha==1){
            JOptionPane.showMessageDialog(null,"Acesso Permitido");
        }
        else{
            JOptionPane.showMessageDialog(null,"Acesso negado");
        }
    }    
}
