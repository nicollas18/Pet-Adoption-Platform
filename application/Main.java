import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /*--------------------------- BASE DE DADOS------------------------- */

        // USUARIOS:
        Usuario usuario1 = new Usuario("João", "joao@email.com", "senha123");
        Usuario usuario2 = new Usuario("Maria", "maria@email.com", "456senha");
        Usuario usuario3 = new Usuario("Carlos", "carlos@email.com", "789senha");
        Usuario usuario4 = new Usuario("Ana", "ana@email.com", "ana321senha");
        Usuario usuario5 = new Usuario("Pedro", "pedro@email.com", "1234pedrosenha");
        Usuario usuario6 = new Usuario("Sofia", "sofia@email.com", "567sofiasenha");
        Usuario usuario7 = new Usuario("Lucas", "lucas@email.com", "lucas789senha");
        Usuario usuario8 = new Usuario("Laura", "laura@email.com", "890senha");
        Usuario usuario9 = new Usuario("Gabriel", "gabriel@email.com", "gabrielsenha");
        Usuario usuario10 = new Usuario("Clara", "clara@email.com", "4321clarasenha");
        
        // ANIMAIS:
        Animal animal1 = new Animal("Bolinha", 2, "Vira-lata", "Brincalhão");
        Animal animal2 = new Animal("Frajola", 3, "Siamês", "Calmo");
        Animal animal3 = new Animal("Rex", 5, "Labrador", "Amigável");
        Animal animal4 = new Animal("Luna", 1, "Persa", "Independente");
        Animal animal5 = new Animal("Thor", 4, "Golden Retriever", "Ativo");
        Animal animal6 = new Animal("Mia", 6, "Poodle", "Inteligente");
        Animal animal7 = new Animal("Simba", 2, "Bengal", "Curioso");
        Animal animal8 = new Animal("Nina", 3, "Boxer", "Energético");
        Animal animal9 = new Animal("Bob", 2, "Bulldog Francês", "Afetuoso");
        Animal animal10 = new Animal("Tobby", 4, "Dálmata", "Protetor");
        

        // ABRIGOS:
        Abrigo abrigo1 = new Abrigo("Abrigo Amigo dos Animais", "Rua das Flores, 123");

        abrigo1.adicionarUsuario(usuario1);
        abrigo1.adicionarUsuario(usuario2);
        abrigo1.adicionarUsuario(usuario3);
        abrigo1.adicionarUsuario(usuario4);
        abrigo1.adicionarUsuario(usuario5);
        abrigo1.adicionarUsuario(usuario6);
        abrigo1.adicionarUsuario(usuario7);
        abrigo1.adicionarUsuario(usuario8);
        abrigo1.adicionarUsuario(usuario9);
        abrigo1.adicionarUsuario(usuario10);


        abrigo1.adicionarAnimal(animal1);
        abrigo1.adicionarAnimal(animal2);
        abrigo1.adicionarAnimal(animal3);
        abrigo1.adicionarAnimal(animal4);
        abrigo1.adicionarAnimal(animal5);
        abrigo1.adicionarAnimal(animal6);
        abrigo1.adicionarAnimal(animal7);
        abrigo1.adicionarAnimal(animal8);
        abrigo1.adicionarAnimal(animal9);
        abrigo1.adicionarAnimal(animal10);

        // ------------------------------------------------------------------

        while(true){


            System.out.printf("\n");
            System.out.println("O que voce deseja fazer?");
            System.out.println("0 - Sair do programa");
            System.out.println("1 - Gereciamento de perfis de animais");
            System.out.println("2 - Processamento de Pedidos de Adocao");
            System.out.println("3 - Opcoes de pesquisa e filtro");
            System.out.printf("\n");
            

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            
            if (input == 0) {
                break;
            }

            System.out.printf("\n");
    
            switch (input) {

                // CASO 1 MAIS EXTERNO
                case 1:
                System.out.println("Informe a operacao desejada");
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

                // CASO 2 MAIS EXTERNO
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

                // CASO 3 MAIS EXTERNO
                case 3:
                System.out.println("Escolha uma opcao de pesquisa:");
                System.out.println("1 - Pesquisar por raca");
                System.out.println("2 - Pesquisar por idade");
                System.out.println("3 - Pesquisar por personalidade");
                
                int opcaoPesquisa = scan.nextInt();
                
                switch (opcaoPesquisa) {
                    case 1:
                        // Pesquisar por raça
                        System.out.println("Digite a raça para pesquisa:");
                        scan.nextLine(); // Limpar o buffer do scanner
                        String racaPesquisa = scan.nextLine();

                        
                        
                        List<Animal> animaisPorRaca = abrigo1.buscarAnimaisPorCriterio("raca", racaPesquisa);

                        if (!animaisPorRaca.isEmpty()) {
                            System.out.println("Animais encontrados com a raca '" + racaPesquisa + "':");
                            for (Animal animal : animaisPorRaca) {
                                System.out.println(animal);
                            }
                        } else {
                            System.out.println("Nenhum animal encontrado com a raca '" + racaPesquisa + "'.");
                        }
                        break;
                    case 2:
                        // Pesquisar por idade
                        System.out.println("Digite a idade para pesquisa:");
                        int idadePesquisa = scan.nextInt();
                        
                        List<Animal> animaisPorIdade = abrigo1.buscarAnimaisPorCriterio("idade", String.valueOf(idadePesquisa));
                        if (!animaisPorIdade.isEmpty()) {
                            System.out.println("Animais encontrados com a idade '" + idadePesquisa + "':");
                            for (Animal animal : animaisPorIdade) {
                                System.out.println(animal);
                            }
                        } else {
                            System.out.println("Nenhum animal encontrado com a idade '" + idadePesquisa + "'.");
                        }
                        break;
                    case 3:
                        // Pesquisar por personalidade
                        System.out.println("Digite a personalidade para pesquisa:");
                        scan.nextLine(); // Limpar o buffer do scanner
                        String personalidadePesquisa = scan.nextLine();
                        
                        List<Animal> animaisPorPersonalidade = abrigo1.buscarAnimaisPorCriterio("personalidade", personalidadePesquisa);
                        if (!animaisPorPersonalidade.isEmpty()) {
                            System.out.println("Animais encontrados com a personalidade '" + personalidadePesquisa + "':");
                            for (Animal animal : animaisPorPersonalidade) {
                                System.out.println(animal);
                            }
                        } else {
                            System.out.println("Nenhum animal encontrado com a personalidade '" + personalidadePesquisa + "'.");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                break;

                default:
                    break;
            }
        }
    }
}