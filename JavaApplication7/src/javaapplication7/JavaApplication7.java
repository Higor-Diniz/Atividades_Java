
package javaapplication7;

import javax.swing.JOptionPane;

public class JavaApplication7 {

    public static void main(String[] args) {
        int num;
        String caixa1;
        caixa1=JOptionPane.showInputDialog("Insira um número inteiro: ");
        num=Integer.parseInt(caixa1);
        if (num>10)
        JOptionPane.showMessageDialog(null, "O Número informado é maior que 10!");
        else
        JOptionPane.showMessageDialog(null, "O Número informado não é maior que 10!");
    }
    
}
