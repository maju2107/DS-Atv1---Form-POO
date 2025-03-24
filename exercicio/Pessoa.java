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
    
   
}