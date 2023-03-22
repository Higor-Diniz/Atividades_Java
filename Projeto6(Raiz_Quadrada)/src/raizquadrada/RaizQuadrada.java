package raizquadrada;

import javax.swing.JOptionPane;

public class RaizQuadrada {

    public static void main(String[] args) {
        int numero;
        double raiz;
        String caixa;
        caixa=JOptionPane.showInputDialog("insira ae o numero que iremos realizar a raiz quadrada: ");
        numero=Integer.parseInt(caixa);
        raiz = Math.sqrt(numero);
        JOptionPane.showMessageDialog(null, "a raiz quadrada é: " +raiz);        
    }    
}
