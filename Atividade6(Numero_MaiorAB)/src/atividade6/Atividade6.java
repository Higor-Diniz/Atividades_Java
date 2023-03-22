package atividade6;

import javax.swing.JOptionPane;

public class Atividade6 {

    public static void main(String[] args) {
        int valorA, valorB;
        String caixaA, caixaB;
        
        caixaA=JOptionPane.showInputDialog("Insira o Valor A: ");
        valorA=Integer.parseInt(caixaA);
        caixaB=JOptionPane.showInputDialog("Insira o Valor B: ");
        valorB=Integer.parseInt(caixaB);
        
        if ((valorA>valorB)&&(valorB<valorA)){
            JOptionPane.showMessageDialog(null, "O valor A: " +valorA+ " é maior que o valor B: " +valorB);
        }    
        else if ((valorA<valorB)&&(valorB>valorA)){
            JOptionPane.showMessageDialog(null, "O valor B: " +valorB+ " é maior que o valor A: " +valorA);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ambos os valores possuem igualdade: " +valorA+ " - " +valorB);       
        }
    }
}
