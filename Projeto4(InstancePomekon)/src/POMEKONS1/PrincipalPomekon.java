package POMEKONS1;

public class PrincipalPomekon {
    public static void main(String []args){
        
        Pomekons pomekon1 = new Pomekons();
        Treinadores treinador1 = new Treinadores();
         
        pomekon1.Nome = "SkyFly";
        pomekon1.Ataque = "100";
        pomekon1.defesa = "200"; 
        pomekon1.Habilidade1 = "Explosion";
        pomekon1.Habilidade2 = "Firepunch";
        treinador1.Nome = "Treinador B";
        treinador1.idade = "18";
        treinador1.Ginasio = "Vermelho";
        System.out.println("Nome: " +treinador1.Nome+ "\nIdade: " +treinador1.idade+ "\nGinásio: " +treinador1.Ginasio+ "\nNome do Pomekon 2: "+pomekon1.Nome+
         "\nAtaque do pomekon: "+pomekon1.Ataque+"\nDefesa do pomekon: "+pomekon1.defesa+"\nHabilidade 1: "+pomekon1.Habilidade1+"\nHabilidade 2: " + pomekon1.Habilidade2);
        
        
        Pomekons pomekon2 = new Pomekons();
        Treinadores treinador2 = new Treinadores();
        
        pomekon2.Nome = "HouseStorm";       
        pomekon2.Ataque = "200";
        pomekon2.defesa = "150"; 
        pomekon2.Habilidade1 = "Hydropump";
        pomekon2.Habilidade2 = "Jato de água";
        treinador2.Nome = "Treinadora A";
        treinador2.idade = "26";
        treinador2.Ginasio = "Azul";
        System.out.println("\nNome: " +treinador2.Nome+ "\nIdade: " +treinador2.idade+ "\nGinásio: " +treinador2.Ginasio+ "\nNome do Pomekon 2: "+pomekon2.Nome+
         "\nAtaque do pomekon: "+pomekon2.Ataque+"\nDefesa do pomekon: "+pomekon2.defesa+"\nHabilidade 1: "+pomekon2.Habilidade1+"\nHabilidade 2: " + pomekon2.Habilidade2);
    }
}
