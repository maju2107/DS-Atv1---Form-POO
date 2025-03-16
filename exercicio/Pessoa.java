package exercicio;

public class Pessoa {

    // características da classe
    private String nome;
    private int idade;
    private String email;


    // funções construtoras
    public Aluno() {}; // construtor padrão


    // métodos/funções
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void listaDeOpcoes(){
    System.out.println("Oie, seja bem vind@ ao sistema de cadastro de Pessoa! Escolha uma operação:");
    System.out.println("1 - Cadastrar uma nova pessoinha:");
    System.out.println("2 - Editar os dados de uma pessoinha cadastrada:");
    System.out.println("3 - Apresentar os dados de uma pessoinha cadastrada:");
    System.out.println("4 - Excluir os dados de uma pessoinha cadastrada:");
    System.out.println("5 - Sair do sistema!");
    }
}