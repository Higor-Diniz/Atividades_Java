package solucaodonamonica;

import javax.swing.JOptionPane;

public class SolucaoDonaMonica {
    
    public static void main(String[] args) {
        int M, A, B, C;
        String c1, c2, c3;
        
        c1=JOptionPane.showInputDialog("Insira a idade de Dona Mônica: ");
        M=Integer.parseInt(c1);
        c2=JOptionPane.showInputDialog("Insira a idade do primeiro filho de Dona Mônica: ");
        A=Integer.parseInt(c2);
        c3=JOptionPane.showInputDialog("Insira a idade do segundo filho de Dona Mônica: ");
        B=Integer.parseInt(c3);
        C=M-(A+B);
        JOptionPane.showMessageDialog(null, "A idade do terceiro filho é: " +C);  
        
        if ((A>=B)&&(A>=C)&&(B>=C)){
            JOptionPane.showMessageDialog(null, "O filho mais velho de Dona Mônica têm: " +A+ " Anos," + " o filho do meio têm: " +B+ " Anos" + " e o filho mais novo têm: " +C+ " Anos.");
        }    
        else if ((A>=B)&&(A>=C)&&(C>=B)){
            JOptionPane.showMessageDialog(null, "O filho mais velho de Dona Mônica têm: " +A+ " Anos," + " o filho do meio têm: " +C+ " Anos" + " e o filho mais novo têm: " +B+ " Anos."); 
        }   
        else if ((B>=A)&&(B>=C)&&(A>=C)){
            JOptionPane.showMessageDialog(null, "O filho mais velho de Dona Mônica têm: " +B+ " Anos," + " o filho do meio têm: " +A+ " Anos" + " e o filho mais novo têm: " +C+ " Anos."); 
        }    
        else if ((B>=A)&&(B>=C)&&(C>=A)){
            JOptionPane.showMessageDialog(null, "O filho mais velho de Dona Mônica têm: " +B+ " Anos," + " o filho do meio têm: " +C+ " Anos" + " e o filho mais novo têm: " +A+ " Anos."); 
        }    
        else if ((C>=A)&&(C>=B)&&(A>=B)) { 
            JOptionPane.showMessageDialog(null, "O filho mais velho de Dona Mônica têm: " +C+ " Anos," + " o filho do meio têm: " +A+ " Anos" + " e o filho mais novo têm: " +B+ " Anos."); 
        }    
        else if ((C>=A)&&(C>=B)&&(B>=A)){
            JOptionPane.showMessageDialog(null, "O filho mais velho de Dona Mônica têm: " +C+ " Anos," + " o filho do meio têm: " +B+ " Anos" + " e o filho mais novo têm: " +A+ " Anos."); 
        }    
        else{
        JOptionPane.showMessageDialog(null, "O sistema de idades está com falha, tente novamente..."); 
        }
    }       
}
