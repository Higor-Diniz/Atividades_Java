package obi1;

import javax.swing.JOptionPane;

public class OBI1 {

    public static void main(String[] args) {
         int N, X, Y, Z;
        int total1 = 1;
        int total2 = 2;
        int total3 = 3;
        String CN, CX, CY, CZ;
        
        CN=JOptionPane.showInputDialog("Por gentileza, informe o número de doces disponíveis: ");
        N=Integer.parseInt(CN);
        CX=JOptionPane.showInputDialog("Informe o número de doces necessários para a primeira pô-que-mão evoluir: ");
        X=Integer.parseInt(CX);
        CY=JOptionPane.showInputDialog("Informe o número de doces necessários para a Segunda pô-que-mão evoluir: ");
        Y=Integer.parseInt(CY);
        CZ=JOptionPane.showInputDialog("Informe o número de doces necessários para a terceira pô-que-mão evoluir: ");
        Z=Integer.parseInt(CZ);
        
        if ((N>=X)&&(N>=Y)&&(N>=Z))
            JOptionPane.showMessageDialog(null, "Existem um total de: " +total3+ " pô-que-mãos para evoluir!!!");    
        else if ((N>=X)&&(N>=Y)&&(N<=Z))
            JOptionPane.showMessageDialog(null, "Existem um total de: " +total2+ " pô-que-mãos para evoluir!!!");
        else if ((N>=X)&&(N>=Z)&&(N<=Y))
            JOptionPane.showMessageDialog(null, "Existem um total de: " +total2+ " pô-que-mãos para evoluir!!!");
        else if ((N>=Y)&&(N>=Z)&&(N<=X))
            JOptionPane.showMessageDialog(null, "Existem um total de: " +total2+ " pô-que-mãos para evoluir!!!");
        else if ((N>=X)&&(N<=Y)&&(N<=Z))
            JOptionPane.showMessageDialog(null, "Existem um total de: " +total1+ " pô-que-mãos para evoluir!!!");
        else if ((N>=Y)&&(N<=Z)&&(N<=X))
            JOptionPane.showMessageDialog(null, "Existem um total de: " +total1+ " pô-que-mãos para evoluir!!!");
        else if ((N>=Z)&&(N<=X)&&(N<=Y))
            JOptionPane.showMessageDialog(null, "Existem um total de: " +total1+ " pô-que-mãos para evoluir!!!");
        else
            JOptionPane.showMessageDialog(null, "Perdoe-nos ocorreu um erro dentro do sistema, informe novamente os valores!!!");
    }    
}
