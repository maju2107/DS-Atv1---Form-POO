package exercicio;

public class Pessoa {
// A classe Pessoa possui atributos como nome, idade e e-mail, além
// de um construtor para inicializar esses dados e métodos para editar, exibir e
// excluir as informações.
    // características da classe
    String nome;
    int idade;
    String email;

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