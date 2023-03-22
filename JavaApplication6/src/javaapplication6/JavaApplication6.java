
package javaapplication6;

import javax.swing.JOptionPane;

public class JavaApplication6 {

    public static void main(String[] args) {
        int num;
        String caixa1;
        caixa1=JOptionPane.showInputDialog("Insira um número inteiro: ");
        num=Interger.parseInt(caixa1);
        if (num>10)
        JOptionPane.showMessageDialog(null,"O Número informado é maior que 10!" + soma);
        else
        JOptionPane.showMessageDialog(null,"A soma dos numeros e: " + soma);
 System.exit(0);
    }
    
}
