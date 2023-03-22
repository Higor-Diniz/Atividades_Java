package atividade4;

import javax.swing.JOptionPane;

public class Atividade4 {

    public static void main(String[] args) {
        int numeroA, numeroB;
        String caixa1, caixa2;
        
        caixa1=JOptionPane.showInputDialog("Insira o 1° número inteiro: ");
        numeroA=Integer.parseInt(caixa1);
        caixa2=JOptionPane.showInputDialog("Insira o 2° número inteiro: ");
        numeroB=Integer.parseInt(caixa2);
        
        if(numeroA%numeroB==0){
            JOptionPane.showMessageDialog(null,"O Número A é Divisível Pelo Número B");
        }
        else{
        JOptionPane.showMessageDialog(null,"O Número A não é Divisível Pelo Número B");
        }
    }    
}
