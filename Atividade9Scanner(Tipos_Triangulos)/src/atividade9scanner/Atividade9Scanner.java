package atividade9scanner;

import java.util.Scanner;

public class Atividade9Scanner {

    public static void main(String[] args) {
        Scanner caixa = new Scanner(System.in);
        int n1, n2, n3, s;
        
        System.out.println("Informe o primeiro valor: ");
        n1 = Integer.parseInt(caixa.nextLine());
        System.out.println("Informe o segundo valor: ");
        n2 = Integer.parseInt(caixa.nextLine());
        System.out.println("Informe o terceiroiro valor: ");
        n3 = Integer.parseInt(caixa.nextLine());
        s = n1+n2+n3;
        
        if ((n1==n2)&&(n1==n3)&&(n2==n3)){
            System.out.println("O valor dos números resultaram em um triângulo Equilátero: " +s);  
        }
        else if ((n1!=n2)&&(n1!=n3)&&(n2!=n3)){
            System.out.println("O valor dos números resultaram em um triângulo Escaleno: " +s);
        }
        else if((n1==n2)&&(n3!=n1)&&(n3!=n2)){
            System.out.println("O valor dos números resultaram em um triângulo Isósceles: " +s);
        }  
        else if ((n1==n3)&&(n2!=n1)&&(n2!=n3)){
            System.out.println("O valor dos números resultaram em um triângulo Isósceles: " +s);
        }  
        else if((n3==n2)&&(n1!=n3)&&(n1!=n2)){
            System.out.println("O valor dos números resultaram em um triângulo Isósceles: " +s);
        }
        else{
            System.out.println("Te parada errada no código ae meu nobre, tente novamente...");
        }        
    }    
}