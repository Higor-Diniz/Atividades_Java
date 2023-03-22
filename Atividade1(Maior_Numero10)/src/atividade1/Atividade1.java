package atividade1;

import javax.swing.JOptionPane;

public class Atividade1 {

    public static void main(String[] args) {
        
        int numero;
        String caixa;
        caixa=JOptionPane.showInputDialog("Insira um número inteiro: ");
        numero=Integer.parseInt(caixa);
        if(numero>10)
        JOptionPane.showMessageDialog(null,"O número informado é maior que 10");
        else
        JOptionPane.showMessageDialog(null,"O número informado é menor ou igual a 10");
    }
    
}
