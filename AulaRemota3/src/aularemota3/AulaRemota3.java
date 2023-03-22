package aularemota3;

public class AulaRemota3 {

    public static void main(String[] args) {
        
        float valor1, valor2, soma, sub, div, mult;
        String caixa1, caixa2;
        caixa1=JOpitionPane.showMenssageDialog("Informe o Primeiro Valor:");
        valor1=Float.parseFloat(caixa1);
        caixa2=JOpitionPane.showMenssageDialog("Informe o Segundo Valor:");
        valor2=Float.parseFloat(caixa2);  
        soma=valor1+valor2;
        sub=valor1-valor2;
        div=valor1/valor2;
        mult=valor1*valor2;
        JOpitionPane.showMenssageDialog(null,"A Soma é: " +soma+ "A Subtração é: " +sub+ "A Divisão é: " +div+ "A multiplicação é: " +mult);
    }
    
}

   