package bibliotecaeletronicapoo;

import java.util.Scanner;


public class BibliotecaEletronicaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        
        float Minuto1, Minuto2, Minuto3;
        String Evento1, Evento2, Evento3;
        String Dado1, Dado2, Dado3;
        
        
        System.out.println("-----------------------Seja bem-Vindo a Agenda Eletronica-----------------------");
        System.out.println("1° Evento");
        System.out.print("Insira o nome do 1° Evento: ");
        Evento1 = ler.next();
        System.out.print("Insira a data (dd/mm/aaaa): ");
        Dado1 = ler.next();
        System.out.print("Insira a duração do evento em minutos (min): ");
        Minuto1 = Float.parseFloat(entrada.nextLine());
        System.out.println("-----1° Evento Agendado-----");
        System.out.println(" ");
        System.out.println("2° Evento");
        System.out.print("Insira o nome do 2° Evento: ");
        Evento2 = ler.next();
        System.out.print("Insira a data (dd/mm/aaaa): ");
        Dado2 = ler.next();
        System.out.print("Insira a duração do evento em minutos (min): ");
        Minuto2 = Float.parseFloat(entrada.nextLine());
        System.out.println("-----2° Evento Agendado-----");
        System.out.println(" ");
        System.out.println("3° Evento");
        System.out.print("Insira o nome do 3° Evento: ");
        Evento3 = ler.next();
        System.out.print("Insira a data (dd/mm/aaaa): ");
        Dado3 = ler.next();
        System.out.print("Insira a duração do evento em minutos (min): ");
        Minuto3 = Float.parseFloat(entrada.nextLine());
        System.out.println("-----3° Evento Agendado-----");
        System.out.println(" ");
        System.out.println("-----Eventos Agendados----");
        System.out.println("1° Evento");
        System.out.println("Nome do Evento: "+ Evento1+ " | Data Informada: "+Dado1+ " | Duração em minutos (min): "+Minuto1);
        System.out.println(" ");
        System.out.println("2° Evento");
        System.out.println("Nome do Evento: "+ Evento2+ " | Data Informada: "+Dado2+ " | Duração em minutos (min): "+Minuto2);
        System.out.println(" ");
        System.out.println("3° Evento");
        System.out.println("Nome do Evento: "+ Evento3+ " | Data Informada: "+Dado3+ " | Duração em minutos (min): "+Minuto3);
    }    
}
