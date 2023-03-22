package Gameshow;

import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String []args){
        String c1, c2, c3, c4, c5, c6, c7, c8;
        
        
        c1=JOptionPane.showInputDialog("Insira o Nome do personagem: ");
        c2=JOptionPane.showInputDialog("Insira a 1° habilidade: ");
        c3=JOptionPane.showInputDialog("Insira a 2° habilidade: ");
        c4=JOptionPane.showInputDialog("Insira a habilidade especial: ");
        JOptionPane.showMessageDialog(null, "Agora que terminou a criação do seu personagem, vamos criar o seu pet. Ok vamos lá!!!");
        c5=JOptionPane.showInputDialog("Insira o Nome do seu pet: ");
        c6=JOptionPane.showInputDialog("Insira a habilidade dele: ");
        c7=JOptionPane.showInputDialog("Você tem 3 opções de pet\n1- Mini Dragão\n2- Mini Leviatã\n3- Mini Bahamut\nPor gentileza, escolha o seu parceirinho: ");
        c8=JOptionPane.showInputDialog("Você tem 3 opções de cor para o seu pet\n1- Vermelho\n2- Azul\n3- Verde\nPor gentileza, escolha o a cor do seu parceirinho: ");    
        
        
        Personagens personagem1 = new Personagens();
        Habilidades habilidades1 = new Habilidades();
        Pet pet1 = new Pet();
        
        personagem1.Nome = c1;
        personagem1.Cod = "01";
        habilidades1.Habilidade1 = c2;
        habilidades1.Habilidade2 = c3;
        habilidades1.HabilidadeEspecial = c4;
        pet1.Nomepet = c5;
        pet1.Habilidadepet = c6;
        pet1.Opcaopet = c7;
        pet1.Corpet = c8;
        
        
        Personagens personagem2 = new Personagens();
        Habilidades habilidades2 = new Habilidades();
        Pet pet2 = new Pet();
        
        personagem2.Nome = "ZeroMark";
        personagem2.Cod = "02";
        habilidades2.Habilidade1 = "Insurgente";
        habilidades2.Habilidade2 = "Aumento de força";
        habilidades2.HabilidadeEspecial = "Grande V";
        pet2.Nomepet = "Zerphion";
        pet2.Habilidadepet = "Emboscada";
        pet2.Opcaopet = "Mini Dragão";
        pet2.Corpet = "Verde";
           
        
        Personagens personagem3 = new Personagens();
        Habilidades habilidades3 = new Habilidades();
        Pet pet3 = new Pet();
        
        personagem3.Nome = "Lotus";
        personagem3.Cod = "03";
        habilidades3.Habilidade1 = "Camuflagem";
        habilidades3.Habilidade2 = "Shuriken de gelo";
        habilidades3.HabilidadeEspecial = "SakuraGold";
        pet3.Nomepet = "Kitsune";
        pet3.Habilidadepet = "Esferas Douradas";
        pet3.Opcaopet = "Mini Leviatã";
        pet3.Corpet = "Azul";
        
        System.out.println("Nome: " +personagem1.Nome+ "\nCódigo do personagem: " +personagem1.Cod+ "\nHabilidade 1: " + habilidades1.Habilidade1+ "\nHabilidade 2: "
        + ""+habilidades1.Habilidade2+"\nHabilidade Especial: "+habilidades1.HabilidadeEspecial+"\nO nome do seu pet é: "+pet1.Nomepet+"\nA habilidade do seu pet é: "
        +pet1.Habilidadepet+"\nA raça/tipo do seu pet é: "+pet1.Opcaopet+"\nA cor do seu pet é: "+pet1.Corpet);
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\nNome: " +personagem2.Nome+ "\nCódigo do personagem: " +personagem2.Cod+ "\nHabilidade 1: " + habilidades2.Habilidade1+ "\nHabilidade 2: "
        +habilidades2.Habilidade2+"\nHabilidade Especial: "+habilidades2.HabilidadeEspecial+"\nO nome do seu pet é: "+pet2.Nomepet+"\nA habilidade do seu pet é: "
        +pet2.Habilidadepet+"\nA raça/tipo do seu pet é: "+pet2.Opcaopet+"\nA cor do seu pet é: "+pet2.Corpet );
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\nNome: " +personagem3.Nome+ "\nCódigo do personagem: " +personagem3.Cod+ "\nHabilidade 1: " + habilidades3.Habilidade1+ "\nHabilidade 2: "
        +habilidades3.Habilidade2+"\nHabilidade Especial: "+habilidades3.HabilidadeEspecial+"\nO nome do seu pet é: "+pet3.Nomepet+"\nA habilidade do seu pet é: "
        +pet3.Habilidadepet+"\nA raça/tipo do seu pet é: "+pet3.Opcaopet+"\nA cor do seu pet é: "+pet3.Corpet );               
    }
}
