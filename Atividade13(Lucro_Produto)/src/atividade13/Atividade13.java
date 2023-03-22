package atividade13;

import javax.swing.JOptionPane;

public class Atividade13 {

    public static void main(String[] args) {
        float produto, produto1, produto2; 
        String Caixa;
        
        JOptionPane.showMessageDialog(null, "A seguir será realizado um cáculo de lucro dependendo do valor do mesmo. \n");
        Caixa=JOptionPane.showInputDialog("Insira o valor do prduto: ");
        produto =Float.parseFloat(Caixa);
        produto1=((produto*45)/100)+produto;
        produto2=((produto*30)/100)+produto;
        
        if (produto<20.0){
            JOptionPane.showMessageDialog(null,"O produto tendo um lucro de 45%, assim, um lucro de: "+produto1);
        }
        else if (produto>=20.0){
            JOptionPane.showMessageDialog(null,"O produto tendo um lucro de 30%, assim, um lucro de: " +produto2);
        }
        else{
            JOptionPane.showMessageDialog(null,"O produto não possuirá lucro: ");
        }
    } 
}
