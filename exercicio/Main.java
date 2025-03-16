package exercicio;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
//O programa principal contém um menu interativo que oferece as
// opções de "Cadastrar", "Editar", "Apresentar" ou "Excluir".

    Scanner lerOpcao = new Scanner(System.in);
    System.out.println("Oie, seja bem vind@ ao sistema de cadastro de Pessoa! Escolha uma operação:");
    System.out.println("1 - Cadastrar uma nova pessoinha:");
    System.out.println("2 - Editar os dados de uma pessoinha cadastrada:");
    System.out.println("3 - Apresentar os dados de uma pessoinha cadastrada:");
    System.out.println("4 - Excluir os dados de uma pessoinha cadastrada:");
    System.out.println("5 - Sair do sistema!");

    System.out.println("Digite o número da opção desejada:");
    int opcao = lerOpcao.nextInt();

    Pessoa pessoa1 = new Pessoa();

    switch(opcao){
        case 1:
        break; 
        case 2:
        break; 
        case 3:
        break; 
        case 4:
        break; 
        case 5:
        break;  
    }
        
    }
}