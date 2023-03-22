package atividade14;

import javax.swing.JOptionPane;

public class Atividade14 {

    public static void main(String[] args) {
        double salario, p1, p2, p3, p4, p5; 
        String caixa;
        
        caixa=JOptionPane.showInputDialog("Insira o valor do seu salário");
        salario =Double.parseDouble(caixa);
        p1=((salario*30)/100)+salario;
        p2=((salario*25)/100)+salario;
        p3=((salario*20)/100)+salario;
        p4=((salario*15)/100)+salario;
        p5=((salario*10)/100)+salario;
        
        if (salario<=600.00)
            JOptionPane.showMessageDialog(null,"O seu salário foi atualizado, tendo um aumento de 30%: " +p1);
        else if((salario>=600.01)&&(salario<=1100.00))
            JOptionPane.showMessageDialog(null,"O seu salário foi atualizado, tendo um aumento de 25%: " +p2);
        else if((salario>=1100.01)&&(salario<=2400.00))
            JOptionPane.showMessageDialog(null,"O seu salário foi atualizado, tendo um aumento de 20%: " +p3);
        else if((salario>=2400.01)&&(salario<=3550.00))
            JOptionPane.showMessageDialog(null,"O seu salário foi atualizado, tendo um aumento de 15%: " +p4);
        else if(salario>=3550.00)
            JOptionPane.showMessageDialog(null,"O seu salário foi atualizado, tendo um aumento de 10%: " +p5);
        else
            JOptionPane.showMessageDialog(null,"O seu salário não possuira nenhum aumento");
    }    
}
