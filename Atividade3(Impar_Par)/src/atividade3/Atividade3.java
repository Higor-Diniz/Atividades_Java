package atividade3;

import javax.swing.JOptionPane;

public class Atividade3 {

    public static void main(String[] args) {
         int numero;
        String caixa;
        
        caixa=JOptionPane.showInputDialog("Insira um número inteiro: ");
        numero=Integer.parseInt(caixa);
        
        if(numero%2==0){
            JOptionPane.showMessageDialog(null,"O número informado é par");
        }
        else{
            JOptionPane.showMessageDialog(null,"O número informado é impar");
        }
    }    
}
