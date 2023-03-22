package teste1;

import javax.swing.JOptionPane;

public class Teste1 {
    
    public static void main(String[] args) {
       int N; 
       int Aa1 = 100;
       int Aa2 = 99900;
       int Aa3 = 400000;
       int Aa4 = 500000;
       int Aa5 = 600000;
       int Aa6 = 900000;
       int Aa7 = 1000000;
       int Aa8 = 300000;
       int Aa9 = 200000;        
        int Vizualizacao = 1000000;
        String c1;
        c1=JOptionPane.showInputDialog("Insira a quantidade de número de dias que a lista contém: ");
        N=Integer.parseInt(c1);     
        switch (N) {
            case 1:
                JOptionPane.showMessageDialog(null, " O número de dias que foram necessários para a soma dos acessos à pagina de Alice e Bia chegar a 1000000, foram: " +N+ ", no 1° dia houve um total de: " +Aa7+ " Vizualizações");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, " O número de dias que foram necessários para a soma dos acessos à pagina de Alice e Bia chegar a 1000000, foram: " +N+ ", no 1° dia houve um total de: " +Aa3+ "\n Vizualizações e no 2° dia houve: " +Aa5+ " Vizualizações");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, " O número de dias que foram necessários para a soma dos acessos à pagina de Alice e Bia chegar a 1000000, foram: " +N+ ", no 1° dia houve um total de: " +Aa1+ "\n Vizualizações e no 2° dia houve: " +Aa2+ "\n Vizualizações e no 3° dia houve: " +Aa6+ " Vizualizações");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, " O número de dias que foram necessários para a soma dos acessos à pagina de Alice e Bia chegar a 1000000, foram: " +N+ ", no 1° dia houve um total de: " +Aa1+ "\n Vizualizações e no 2° dia houve: " +Aa2+ "\n Vizualizações e no 3° dia houve: " +Aa3+ "\n Vizualizações, e no 4° dia houve: " +Aa4+ " Vizualizações");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, " O número de dias que foram necessários para a soma dos acessos à pagina de Alice e Bia chegar a 1000000, foram: " +N+ ", no 1° dia houve um total de: " +Aa1+ "\n Vizualizações e no 2° dia houve: " +Aa2+ "\n Vizualizações e no 3° dia houve: " +Aa3+ "\n  Vizualizações, e no 4° dia houve: " +Aa8+ "\n Vizualizações, e no 5° dia houve:" +Aa9+ " Vizualizações");
                break;
            default:
                JOptionPane.showMessageDialog(null, " Perdoe-nos ocorreu um erro dentro do sistema, informe novamente os valores!!!");
                break;
        }
    }    
}
