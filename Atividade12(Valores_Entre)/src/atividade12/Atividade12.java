package atividade12;

import javax.swing.JOptionPane;

public class Atividade12 {

    public static void main(String[] args) {
        int n1;
        String c1;
        c1=JOptionPane.showInputDialog("Insira o Número: ");
        n1=Integer.parseInt(c1);
        
        if ((n1<=90)&&(n1>=20)){
            JOptionPane.showMessageDialog(null, "O número digitado está compreendido entre 20 e 90: " +n1);
        }
        else{
            JOptionPane.showMessageDialog(null, "O número digitado não está compreendido entre 20 e 90: " +n1);       
        }
    }    
}
