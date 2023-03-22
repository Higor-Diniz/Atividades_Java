package atividade9;

import javax.swing.JOptionPane;

public class Atividade9 {

    public static void main(String[] args) {
        int numero1, numero2, numero3, soma;
        String caixa1, caixa2, caixa3;
        
        caixa1=JOptionPane.showInputDialog("Insira o 1° número Real: ");
        numero1=Integer.parseInt(caixa1);
        caixa2=JOptionPane.showInputDialog("Insira o 2° número Real: ");
        numero2=Integer.parseInt(caixa2);
        caixa3=JOptionPane.showInputDialog("Insira o 3° número Real: ");
        numero3=Integer.parseInt(caixa3);
        soma=numero1+numero2+numero3;
        
        if((numero1==numero2)&&(numero1==numero3)&&(numero2==numero3)){
            JOptionPane.showMessageDialog(null,"O valor dos números resultaram em um triângulo Equilátero: "+soma);
        }
         else if((numero1!=numero2)&&(numero1!=numero3)&&(numero2!=numero3)){
            JOptionPane.showMessageDialog(null,"O valor dos números resultaram em um triângulo Escaleno: "+soma);
         }
         else if((numero1==numero2)&&(numero3!=numero1)&&(numero3!=numero2)){
            JOptionPane.showMessageDialog(null,"O valor dos números resultaram em um triângulo Isósceles: "+soma);
         }
        else if((numero1==numero3)&&(numero2!=numero1)&&(numero2!=numero3)){
            JOptionPane.showMessageDialog(null,"O valor dos números resultaram em um triângulo Isósceles: "+soma);
        }
        else if((numero3==numero2)&&(numero1!=numero3)&&(numero1!=numero2)){
            JOptionPane.showMessageDialog(null,"O valor dos números resultaram em um triângulo Isósceles: "+soma);
        }
        else{
            JOptionPane.showMessageDialog(null,"Tem parada errada no código, recapitula ae.");
        }
    }    
}
