package atividade7;
import javax.swing.JOptionPane;
public class Atividade7 {
    public static void main(String[] args) {
        float valorA, valorB, valorC;
        double delta, raiz, valorx, valory;
        String caixaA, caixaB, caixaC;
        
        JOptionPane.showMessageDialog(null, "A seguir será realizado uma equação de segundo grau, levando consideração a existência de raízes reais. \n");
        caixaA = JOptionPane.showInputDialog("Insira o Valor A: ");
        valorA = Float.parseFloat(caixaA);
        caixaB = JOptionPane.showInputDialog("Insira o Valor B: ");
        valorB = Float.parseFloat(caixaB);
        caixaC = JOptionPane.showInputDialog("Insira o Valor C: ");
        valorC = Float.parseFloat(caixaC);
        delta = ((valorB*valorB)-(4*valorA)*valorC);
        raiz = Math.sqrt(delta);
        valorx = (-valorB + raiz)/(2*valorA);
        valory = (-valorB - raiz)/(2*valorA);
        
        if (delta>0){
            JOptionPane.showMessageDialog(null, "A equação possui duas raízes reais distintas:  " +delta+ "\n O valor de X1 é= " +valorx+ "\n O valor de X2 é= " +valory);
        }
        else if (delta==0){
            JOptionPane.showMessageDialog(null, "A equação possui raízes reais iguais:  " +delta+ "\n valor de X1 e X2 são ambas iguais: " +valorx+ " - " +valory);
        }
        else if (delta<0){    
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais:  " +delta);
        }
        else{
            JOptionPane.showMessageDialog(null, "O sistema está com alguma falha, por gentileza tente novamente");
        }
    }   
}