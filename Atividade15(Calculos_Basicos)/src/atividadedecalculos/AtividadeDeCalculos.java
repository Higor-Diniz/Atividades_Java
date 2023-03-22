package atividadedecalculos;

import javax.swing.JOptionPane;

public class AtividadeDeCalculos {

    public static void main(String[] args) {
        int n1, n2, n3, soma, div, sub, mult;
        String c1,c2,c3;
        
        c1=JOptionPane.showInputDialog("Informe o primeiro numero\n");
        n1=Integer.parseInt(c1);
        c2=JOptionPane.showInputDialog("Informe o segundo numero\n");
        n2=Integer.parseInt(c2);
        c3=JOptionPane.showInputDialog("Informe o terceiro numero\n");
        n3=Integer.parseInt(c3);
        
        soma=n1+n2+n3;
        div=n1/n2/n3;
        sub=n1-n2-n3;
        mult=n1*n2*n3;
        
        JOptionPane.showMessageDialog(null, "O resultado da Soma é: " +soma);
        JOptionPane.showMessageDialog(null, "O resultado da Divisão é: " +div);
        JOptionPane.showMessageDialog(null, "O resultado da Subtração é: " +sub);
        JOptionPane.showMessageDialog(null, "O resultado da Multiplicação é: " +mult);
    }    
}
