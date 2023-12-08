import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /*--------------------------- BASE DE DADOS------------------------- */

        // USUARIOS:
        Usuario usuario1 = new Usuario("Joao", "joao@email.com", "senha123");
        Usuario usuario2 = new Usuario("Maria", "maria@email.com", "senha456");
        Usuario usuario3 = new Usuario("Camila", "camila@email.com", "senha789");

        // ANIMAIS:
        Animal animal1 = new Animal("Bolinha", 2, "Vira-lata", "Brincalhao");
        Animal animal2 = new Animal("Frajola", 3, "Siames", "Calmo");
        Animal animal3 = new Animal("Rex", 5, "Labrador", "Amigavel");

        // ABRIGOS:
        Abrigo abrigo1 = new Abrigo("Abrigo Amigo dos Animais", "Rua das Flores, 123");

        abrigo1.adicionarUsuario(usuario1);
        abrigo1.adicionarUsuario(usuario2);
        abrigo1.adicionarUsuario(usuario3);

        abrigo1.adicionarAnimal(animal1);
        abrigo1.adicionarAnimal(animal2);
        abrigo1.adicionarAnimal(animal3);

        // ------------------------------------------------------------------


        System.out.printf("\n");
        System.out.println("O que voce deseja fazer?");
        System.out.println("1 - Gereciamento de perfis de animais");
        System.out.println("2 - Processamento de Pedidos de Adocao");
        System.out.println("3 - Opcoes de pesquisa e filtro");
        System.out.printf("\n");


        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.printf("\n");

        switch (input) {

            case 1:
            System.out.println("Informe a operaçao desejada");
            System.out.println("1 - Listar animais disponiveis");
            System.out.println("2 - Adicionar novo animal");
            System.out.printf("\n");
            int opcaoAnimal = scan.nextInt();
            
            
            switch (opcaoAnimal) {
                case 1:
                    // Listar animais disponíveis
                    abrigo1.imprimirAnimaisDisponiveis();
                    break;

                case 2:
                    // Adicionar novo animal
                    System.out.println("Digite o nome do animal:");
                    scan.nextLine(); // Limpar o buffer do scanner
                    String nomeAnimal = scan.nextLine();
                    System.out.println("Digite a idade do animal:");
                    int idadeAnimal = scan.nextInt();
                    System.out.println("Digite a raça do animal:");
                    scan.nextLine(); // Limpar o buffer do scanner
                    String racaAnimal = scan.nextLine();
                    System.out.println("Digite a personalidade do animal:");
                    String personalidadeAnimal = scan.nextLine();
                    
                    Animal novoAnimal = new Animal(nomeAnimal, idadeAnimal, racaAnimal, personalidadeAnimal);
                    abrigo1.adicionarAnimal(novoAnimal);
                    System.out.println("Novo animal adicionado com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            break; // break do caso 1 mais externo

            case 2:
            System.out.println("Animais disponiveis para adocao:");
            abrigo1.imprimirAnimaisDisponiveis();
            System.out.println("Selecione o numero do animal desejado para adocao:");
            int numeroAnimal = scan.nextInt();
            
            // Verificar se o número do animal é válido
            if (numeroAnimal >= 1 && numeroAnimal <= abrigo1.getAnimaisDisponiveis().size()) {
                Animal animalSelecionado = abrigo1.getAnimaisDisponiveis().get(numeroAnimal - 1);
                
                // Simular o envio de pedido de adoção por um usuário
                System.out.println("Digite seu nome de usuario para enviar o pedido:");
                scan.nextLine(); // Limpar o buffer do scanner
                String nomeUsuario = scan.nextLine();
                
                // Verificar se o usuário está relacionado ao abrigo
                boolean usuarioExiste = abrigo1.getUsuariosRelacionados().stream().anyMatch(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario));
                
                if (usuarioExiste) {
                    Usuario usuarioPedido = abrigo1.getUsuariosRelacionados().stream().filter(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario)).findFirst().orElse(null);
                    
                    // Processamento do pedido de adoção
                    boolean pedidoAceito = abrigo1.solicitarAdocao(usuarioPedido, animalSelecionado);
                    
                    if (pedidoAceito) {
                        System.out.println("Pedido de adocao enviado com sucesso!");
                    } else {
                        System.out.println("Desculpe, o pedido de adocao não pode ser concluido.");
                    }
                } else {
                    System.out.println("Usuario nao encontrado no abrigo.");
                }
            } else {
                System.out.println("Numero de animal invalido.");
            }
            break;
        

            default:
                break;
        }
    }
}