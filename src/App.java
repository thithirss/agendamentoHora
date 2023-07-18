import java.util.HashMap; // biblioteca do map
import java.util.Map; //biblioteca do map (obrigatorio importar as duas)
import java.util.Scanner; //biblioteca do scanner
public class App {

    public static void main(String[] args) {
       Map<String, String> agendamento = new HashMap<>(); //função map é usada pra armazenar dados. Dentro do map éobrigado a definir o tipo de variavel usada, string, int, float etc...

        Scanner scanner = new Scanner(System.in); //Scanner funciona para interagir com o teclado do usuario.

        while (true) { //while/do funciona para apresentar o menu do usuario. Cada parte do menu transforma em "case"
            System.out.println("1. Agendar horário");//case 1
            System.out.println("2. Verificar agendamento");//case 2
            System.out.println("3. Sair");//case 3
            System.out.print("Escolha uma opção: ");// função vazia, apenas para interacao do usuario.
            int opcao = scanner.nextInt(); // cria a variavel opcao que retorna valor INTEIRO (Integer).
            scanner.nextLine();// nextLine funciona para ler a proxima linha do codigo e continuar a conversa

            switch (opcao) { // switch é a resposta de definiçoes do while, dentro do switch o case é criado para retornar valor ao usuario
                case 1:// case 1 é a alternativa 1 do menu do usuario
                    System.out.print("Digite o seu nome: ");// interação com o usuario
                    String nome = scanner.nextLine(); //cria a variavel nome e armazena, e o scanner le a proxima linha do codigo
                    System.out.print("Digite a data: (formato dd/MM/yyyy) ");//interação com o usuario || nesse codigo nao usei funcao data, entao a interação de data no codigo é somente STRING.
                    String data = scanner.nextLine();//cria a variavel data armazena e le a proxima linha.


                    if (agendamento.containsKey(data)) { // if e else é o SIM/ SE NAO/ primeiro passa pelo if, se for checkado para se nao for chegado vai pro else.
                        System.out.println("Desculpe, esse horário já está agendado.");
                    } else { // else é a negativa do if, se o if nao for cheackado o else entra em funcionamento
                        agendamento.put(data, nome); // put é o conjunto do MAP, o put pega o que foi escrito no map e armazena
                        System.out.println("Horário agendado com sucesso! Obrigado pela preferencia - Clinica xxxxx");
                    }
                    break; // para o proagama depois do if ou else ter funcionado.
                case 2: //caso 2 do while
                    System.out.print("Digite a data para verificar o agendamento: ");
                    data = scanner.nextLine(); //armazena a data e faz a leitura da proxima linha

                    if (agendamento.containsKey(data)) { //if vai buscar dentro da data se a data citada ja foi digitada antes
                        nome = agendamento.get(data); //o metodo GET le a variavel, caso quisessemos mudar usaria o Set
                        System.out.println("Agendamento para a data " + data + ": " + nome);
                    } else { //caso a data nao seja encontrado dentro da variavel retorna o else
                        System.out.println("Nenhum agendamento encontrado para a data " + data);
                    }
                    break; //para o programa apos finalizado
                case 3: 
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                default: //opção diferente de case1,2 ou 3 vai retornar default
                    System.out.println("Opção inválida. Tente novamente.");
                    break; //finaliza o programa
            }
        }
    }
}