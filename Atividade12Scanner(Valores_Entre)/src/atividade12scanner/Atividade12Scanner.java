
package atividade12scanner;

import java.util.Scanner;

public class Atividade12Scanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 ;
        System.out.println("Insira um valor: ");
        n1 = Integer.parseInt(entrada.nextLine());
        
        if ((n1>=20.0)&&(n1<=90.0)){
            System.out.println("O valor informado está entre 20 e 90: --" +n1+ "--");
        }
        else{
            System.out.println("O valor informado não está entre 20 e 90: --" +n1+ "--");
        }
    }
}
