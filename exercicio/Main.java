
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
                                            
        Scanner lerOpcao = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        int opcao;
    
        do { 
        
        listaDeOpcoes();

        System.out.println("Digite o número da opção desejada:");
        opcao = lerOpcao.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite o nome:"); // entrada de dados
                    pessoa1.setNome(lerOpcao.nextLine());
                
                    System.out.println("Digite a idade:");
                    pessoa1.setIdade(lerOpcao.nextInt());

                    System.out.println("Digite a idade:");
                    pessoa1.setEmail(lerOpcao.nextLine());

                    System.out.println("Pessoinha cadastrada com sucesso!;) ");
                break; 

                case 2:
                    System.out.println("Digite o novo nome:"); // entrada de dados
                    pessoa1.setNome(lerOpcao.nextLine());
                
                    System.out.println("Digite a nova idade:");
                    pessoa1.setIdade(lerOpcao.nextInt());

                    System.out.println("Digite a idade:");
                    pessoa1.setEmail(lerOpcao.nextLine());

                    System.out.println("Dados atualizados com sucesso!:) ");
                break; 

                case 3:
                    System.out.println(pessoa1.getNome()); // saída de dados
                    System.out.println(pessoa1.getIdade());
                    System.out.println(pessoa1.getEmail());
                break; 

                case 4:
                    pessoa1.setNome(nome:"Sem dados cadastrados");
                    pessoa1.setIdade(idade:"Sem dados cadastrados");
                    pessoa1.setEmail(email:"Sem dados cadastrados");

                    System.out.println("Pessoinha excluída com sucesso!:( ");     
                break; 

                case 5:
                    System.out.println("Você saiuu...:");     
                break; 

                default:
                    System.out.println("Opção não encontrada dentre as fornecidas pelo sistema!:");     
                break;
            }
            
        } while(opcao!= 5); // repetir enquanto não digita a opção 5
    }

        private static void listaDeOpcoes(){
        System.out.println("Oie, seja bem vind@ ao sistema de cadastro de Pessoa! Escolha uma operação:");
        System.out.println("1 - Cadastrar uma nova pessoinha:");
        System.out.println("2 - Editar os dados de uma pessoinha cadastrada:");
        System.out.println("3 - Apresentar os dados de uma pessoinha cadastrada:");
        System.out.println("4 - Excluir os dados de uma pessoinha cadastrada:");
        System.out.println("5 - Sair do sistema!");
        }
}
