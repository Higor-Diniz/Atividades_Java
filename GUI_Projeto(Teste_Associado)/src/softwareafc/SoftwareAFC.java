package softwareafc;

public class SoftwareAFC {
    
    public static void main(String[] args) {
       Associados associados=new Associados();
        
        associados.ID = "1";
        associados.Nome = "Associado1";
        associados.Logradouro = "Logadouro1";
        associados.Numero = "01";
        associados.CEP = "78000000";
        associados.Bairro = "Bairro1";
        associados.Cidade = "Cidade1";
        associados.UF = "MT";
        associados.Telefone = "(65) 0 0000-0000";
        associados.CPFCNPJ = "000000000-00";
        associados.Situacao = "Associado";
        associados.NumeroAssociado = "132";
        
        System.out.println("Nome:" +associados.Nome+ "\nLogradouro: " +associados.Logradouro+ "\nNúmero:" 
                +associados.Numero+ "\nCEP:" +associados.CEP+ "\nBairro:" +associados.Bairro+ "\nCidade:" 
                +associados.Cidade+ "\nUF:" +associados.UF+ "\nTelefone:" +associados.Telefone+ "\nCPF/CNPJ:" 
                +associados.CPFCNPJ+ "\nSituação:" +associados.Situacao+ "\nNúmero da Associação:" +associados.NumeroAssociado);
        System.out.println("--------------------------------------------------------------------------\n");
        
        
        Colaborador colaborador=new Colaborador();
        
        colaborador.ID = "2";
        colaborador.Nome = "Associado2";
        colaborador.Logradouro = "Rua das rosas";
        colaborador.Numero = "07";
        colaborador.CEP = "78000000";
        colaborador.Bairro = "Bairro2";
        colaborador.Cidade = "Cidade2";
        colaborador.UF = "MT";
        colaborador.Telefone = "(65) 9 0000-0000";
        colaborador.CPFCNPJ = "000000000-00";
        colaborador.CargoFuncao = "Gerente";
        
        System.out.println("Nome:" +colaborador.Nome+ "\nLogradouro: " +colaborador.Logradouro+ "\nNúmero:"
                +colaborador.Numero+ "\nCEP:" +colaborador.CEP+ "\nBairro:" +colaborador.Bairro+ "\nCidade:" 
                +colaborador.Cidade+ "\nUF:" +colaborador.UF+ "\nTelefone:" +colaborador.Telefone+ "\nCPF/CNPJ:" 
                +colaborador.CPFCNPJ+ "\nCargo:" +colaborador.CargoFuncao);
        System.out.println("--------------------------------------------------------------------------\n");
        
        
        Fornecedores fornecedores=new Fornecedores();
        
        fornecedores.ID = "3";
        fornecedores.Nome = "Associado3";
        fornecedores.Logradouro = "Rua Constelação";
        fornecedores.Numero = "09";
        fornecedores.CEP = "00000000";
        fornecedores.Bairro = "Bairro3";
        fornecedores.Cidade = "Cidade3";
        fornecedores.UF = "CE";
        fornecedores.Telefone = "(65) 9 0000-0000";
        fornecedores.CPFCNPJ = "000000000-00";
        fornecedores.NomeFantasia = "Sra.Sanches";    
        fornecedores.Website = "https://www.com.br";
        
        
        System.out.println("Nome:" +fornecedores.Nome+ "\nLogradouro: " +fornecedores.Logradouro+ "\nNúmero:"
                +fornecedores.Numero+ "\nCEP:" +fornecedores.CEP+ "\nBairro:" +fornecedores.Bairro+ "\nCidade:" 
                +fornecedores.Cidade+ "\nUF:" +fornecedores.UF+ "\nTelefone:" +fornecedores.Telefone+ "\nCPF/CNPJ:" 
                +fornecedores.CPFCNPJ+ "\nNome Fantasia:" +fornecedores.NomeFantasia+ "WebSite:" +fornecedores.Website);        
    }    
}
