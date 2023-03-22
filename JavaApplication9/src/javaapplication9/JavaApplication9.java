
package javaapplication9;

import javax.swing.JOptionPane;

public class JavaApplication9 {

    public static void main(String[] args) {
        int num;
        String caixa;
        caixa=JOptionPane.showInputDialog("Insira um número inteiro: ");
        num=Integer.parseInt(caixa);
        if (num%2==0)
        JOptionPane.showMessageDialog(null, "O Número informado é Par");
        else
        JOptionPane.showMessageDialog(null, "O Número informado é Impar");
    }
    
}
