package lanche1;

import javax.swing.JOptionPane;

public class Lanche1 {

    public static void main(String[] args) {
        Double cod, quantidade, calculo1, calculo2, calculo3, calculo4, calculo5;  
        String c1, c2, c3, na;
        
        JOptionPane.showMessageDialog(null, "Código   Especificação   Preço\n" + "1   Cachorro Quente        R$4.00\n" + "2   X-Salada                       R$4.50\n" + "3   X-Bacon                        R$5.00\n" + "4   Torrada Simples         R$2.00\n" + "5   Refrigerante                R$1.50\n");
        c3=JOptionPane.showInputDialog("Por gentileza, informe seu nome: "); 
        na=(c3);
        c1=JOptionPane.showInputDialog("Informe o código do produto: ");
        cod=Double.parseDouble(c1);
        c2=JOptionPane.showInputDialog("Informe a quantidade desejada: ");        
        quantidade=Double.parseDouble(c1);
        calculo1=4.0*quantidade;
        calculo2=4.50*quantidade;
        calculo3=5.0*quantidade;
        calculo4=2.0*quantidade;
        calculo5=1.50*quantidade;
        
        if(cod==1){
            JOptionPane.showMessageDialog(null,"Sr(a) " +na+ ", o valor total é: R$"+calculo1);
        }   
        else if(cod==2){
            JOptionPane.showMessageDialog(null,"Sr(a) " +na+ ", o valor total é: R$"+calculo2);
        }    
        else if(cod==3){
            JOptionPane.showMessageDialog(null,"Sr(a) " +na+ ", o valor total é: R$"+calculo3);
        }    
        else if(cod==4){
            JOptionPane.showMessageDialog(null,"Sr(a) " +na+ ", o valor total é: R$"+calculo4);
        }
        else if(cod==5){
            JOptionPane.showMessageDialog(null,"Sr(a) " +na+ ", o valor total é: R$"+calculo5);
        }
        else{
        JOptionPane.showMessageDialog(null, "Erro");
        }
    }    
}
