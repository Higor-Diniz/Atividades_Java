package funcionario;

import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        float salario, bonus1, bonus2, bonus3;
        
        System.out.println("Informe o seu Nome: ");
        String Nome = ler.next();
        System.out.println("Informe o seu Cargo: \nAnalista \nGerente \nCoordenador ");
        String Cargo = ler.next();
        System.out.println("Informe o seu Salário: ");
        salario = Float.parseFloat(entrada.nextLine());
        bonus1 =((salario*10)/100)+salario;
        bonus2 =((salario*20)/100)+salario;
        bonus3 =((salario*30)/100)+salario;
        
        if ("Analista".equals(Cargo)){
            System.out.println("O salário do(a) Analista " +Nome+ ", incluindo o bônus, é de R$"+bonus1);  
        }
        else if ("Gerente".equals(Cargo)){
            System.out.println("O salário do(a) Gerente " +Nome+ ", incluindo o bônus, é de R$"+bonus2);  
        }
        else if ("Coordenador".equals(Cargo)){
            System.out.println("O salário do(a) Coordenador(a) " +Nome+ ", incluindo o bônus, é de R$"+bonus3);  
        }
        else{
            System.out.println("Ocorreu um erro no sistema, tente novamente...");        
                }
    }    
}
