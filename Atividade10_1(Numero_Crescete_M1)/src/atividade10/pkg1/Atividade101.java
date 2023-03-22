package atividade10.pkg1;

import javax.swing.JOptionPane;

public class Atividade101 {

    public static void main(String[] args) {
    int  n1, n2, n3;
    String c1, c2, c3;
    
    c1=JOptionPane.showInputDialog("Insira o 1° número inteiro: ");
    n1=Integer.parseInt(c1);
    c2=JOptionPane.showInputDialog("Insira o 2° número inteiro: ");
    n2=Integer.parseInt(c2);
    c3=JOptionPane.showInputDialog("Insira o 3° número inteiro: ");
    n3=Integer.parseInt(c3);
    
        if (n1<n2){
            if (n2<n3)
                JOptionPane.showMessageDialog(null,"A sequência crescente é: " +n1+ " - " +n2+ " - " +n3);
            else if (n1<n3)
                JOptionPane.showMessageDialog(null,"A sequência crescente é: " +n1+ " - " +n3+ " - " +n2);
            else
                JOptionPane.showMessageDialog(null,"A sequência crescente é: " +n3+ " - " +n1+ " - " +n2);
        }    
        else if (n2<n3){
            if(n1<n3)
            JOptionPane.showMessageDialog(null,"A sequência crescente é: " +n2+ " - " +n1+ " - " +n3);
            else
            JOptionPane.showMessageDialog(null,"A sequência crescente é: " +n2+ " - " +n3+ " - " +n1);
        }    
        else
            JOptionPane.showMessageDialog(null,"A sequência crescente é: " +n3+ " - " +n2+ " - " +n1);
    } 
}

