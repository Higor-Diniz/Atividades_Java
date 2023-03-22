package supermercadoblackfriday;

import java.util.Scanner;

public class SupermercadoBlackFriday {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        int NomeProduto, CodigoProduto;
        float ValorProdutoNovo, ValorProduto, Porcentagem;
        System.out.println("Por Gentileza, Digite o código da categoria que deseja: \n(1) - Limpeza \n(2) - Padaria \n(3) - Bebidas ");
        NomeProduto = Integer.parseInt(entrada.nextLine());
        System.out.println(" ");
        System.out.println("Informe o codigo do produto: \n Categoria Limpeza (1): \n Codigo (1) - Desinfetante \n Codigo (2) - Sabão Liquído \n Codigo (3) - Esponja ");
        System.out.println("\n Categoria Padaria (2): \n Codigo (1) - Sonho \n Codigo (2) - Pão Frânces \n Codigo (3) - Salgadinho ");
        System.out.println("\n Categoria Bebidas (3): \n Codigo (1) - Refrigerante \n Codigo (2) - Suco Tang \n Codigo (3) - Saque ");
        CodigoProduto = Integer.parseInt(entrada.nextLine());
        System.out.println(" ");
        System.out.print("Digite o preço do produto: ");
        ValorProduto = Float.parseFloat(entrada.nextLine());
        System.out.print("Digite a porcentagem do desconto: ");
        Porcentagem = Integer.parseInt(entrada.nextLine());
        ValorProdutoNovo = ValorProduto-((ValorProduto*Porcentagem)/100);
        switch (NomeProduto) {
            case 1:
                System.out.println("A Categoria: " +NomeProduto+ " | com o codigo: " +CodigoProduto+" | obteve um desconto de: "+ValorProdutoNovo+ "R$");
                break;
            case 2:
                System.out.println("A Categoria: " +NomeProduto+ " | com o codigo: " +CodigoProduto+" | obteve um desconto de: "+ValorProdutoNovo+ "R$");
                break;
            case 3: 
                System.out.println("A Categoria: " +NomeProduto+ " | com o codigo: " +CodigoProduto+" | obteve um desconto de: "+ValorProdutoNovo+ "R$");
                break;
            default:
                System.out.println("Te parada errada no código ae meu nobre, tente novamente...");
                break;
        }
    }
}
