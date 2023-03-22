package atividade2;

import javax.swing.JOptionPane;

public class Atividade2 {

    public static void main(String[] args) {
        int numero1, numero2;
        String caixa1, caixa2;
        
        caixa1=JOptionPane.showInputDialog("Insira o 1° número inteiro: ");
        numero1=Integer.parseInt(caixa1);
        caixa2=JOptionPane.showInputDialog("Insira o 2° número inteiro: ");
        numero2=Integer.parseInt(caixa2);
        
        if(numero1==numero2){
            JOptionPane.showMessageDialog(null,"Os números informados são iguais");
        }
        else{
            JOptionPane.showMessageDialog(null,"Os números informados são diferentes");
        }
    }    
}
