package atividade5;

import javax.swing.JOptionPane;

public class Atividade5 {

    public static void main(String[] args) {
        int numero1, numero2;
        String caixa1, caixa2;
        
        caixa1=JOptionPane.showInputDialog("Insira o 1° número inteiro: ");
        numero1=Integer.parseInt(caixa1);
        caixa2=JOptionPane.showInputDialog("Insira o 2° número inteiro: ");
        numero2=Integer.parseInt(caixa2);
        
        if(numero1>numero2){
        JOptionPane.showMessageDialog(null,"O número informado é o maior: " +numero1);
        }
        else{
        JOptionPane.showMessageDialog(null,"O número informado é o maior: " +numero2);
        }
    }    
}
