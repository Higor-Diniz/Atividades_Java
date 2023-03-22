package atividade11;

import javax.swing.JOptionPane;
 
public class Atividade11 {

    public static void main(String[] args) {
       float n1, n2, n3, nf, media;
       String c1, c2, c3, c4, c5, na;
       
        c5=JOptionPane.showInputDialog("Insira o nome do aluno: ");
        na=(c5);
        c1=JOptionPane.showInputDialog("Insira a 1° nota do aluno: ");
        n1=Float.parseFloat(c1);
        c2=JOptionPane.showInputDialog("Insira a 2° nota do aluno: ");
        n2=Float.parseFloat(c2);
        c3=JOptionPane.showInputDialog("Insira a 3° nota do aluno: ");
        n3=Float.parseFloat(c3);
        c4=JOptionPane.showInputDialog("Insira o número de faltas do aluno: ");
        nf=Float.parseFloat(c4);
        media=(n1+n2+n3)/3;
        
        if ((media>=7.0)&&(nf<=20)){
            JOptionPane.showMessageDialog(null, "O aluno " +na+ " está aprovado possuindo a média: " +media+ " e tendo um total de: " +nf+ " faltas");
        }
        else if ((media<7.0)&&(nf>=20)){
            JOptionPane.showMessageDialog(null, "O aluno " +na+ " está reprovado devido a média e o total de faltas, possuindo a média: " +media+ " e tendo um total de: " +nf+ " faltas");
        }
        else if ((media>=7.0)&&(nf>=20)){
            JOptionPane.showMessageDialog(null, "O aluno " +na+ " está reprovado devido ao total de faltas, possuindo a média: " +media+ " e tendo um total de: " +nf+ " faltas");
        }
        else if ((media<7.0)&&(nf<=20)){
            JOptionPane.showMessageDialog(null, "O aluno " +na+ " está reprovado devido a média, possuindo a média: " +media+ " e tendo um total de: " +nf+ " faltas");  
        }
        else{
            JOptionPane.showMessageDialog(null, "O sistema está com problemas \n verifique se as informações que inseriu estão corretas.");
        }
    }    
}
