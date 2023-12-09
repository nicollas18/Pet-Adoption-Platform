import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static void imprimirRecursoEducacional(String caminhoDoArquivo) {
        File arquivo = new File(caminhoDoArquivo);

        try {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
        Usuario usuario11 = new Usuario("Gabriela", "gabriela@email.com", "789senha");
        Usuario usuario12 = new Usuario("Renato", "renato@email.com", "renato123senha");
        Usuario usuario13 = new Usuario("Beatriz", "beatriz@email.com", "456beatrizsenha");
        Usuario usuario14 = new Usuario("Ricardo", "ricardo@email.com", "ricardo987senha");
        Usuario usuario15 = new Usuario("Amanda", "amanda@email.com", "amanda321senha");

        
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
        Animal animal11 = new Animal("Pelúcia", 2, "Chow Chow", "Alegre");
        Animal animal12 = new Animal("Marley", 4, "Pastor Alemão", "Protetor");
        Animal animal13 = new Animal("Luna", 3, "Shih Tzu", "Carinhosa");
        Animal animal14 = new Animal("Boris", 5, "Rottweiler", "Leal");
        Animal animal15 = new Animal("Miau", 1, "Gato Persa", "Curioso");

        Evento eventoAbrigo1_1 = new Evento("Campanha de Adoção de Inverno",
        "Campanha especial para adoção de animais durante o inverno. Descontos especiais e kits de boas-vindas para os novos donos",
        "15 de julho de 2024", "Campanha de Adoção");

        Evento eventoAbrigo1_2 = new Evento("Arrecadação de Fundos",
        "Evento para arrecadar fundos para a construção de novos canis. Rifa e bazares beneficentes serão realizados.",
        "30 de setembro de 2024", "Arrecadação de Fundos");

        // Eventos para o Abrigo 2
        Evento eventoAbrigo2_1 = new Evento("Feira de Adoção",
        "Feira com diversos animais disponíveis para adoção. Palestras e atividades para crianças.",
        "5 de agosto de 2024", "Feira de Adoção");

        Evento eventoAbrigo2_2 = new Evento("Campanha de Vacinação",
        "Vacinação gratuita para cães e gatos. Todos são bem-vindos!",
        "20 de outubro de 2024", "Campanha de Saúde");

        Evento eventoAbrigo3_1 = new Evento("Caminhada Solidária",
        "Caminhada com os animais disponíveis para adoção. Todos estão convidados a participar!",
        "12 de agosto de 2024", "Caminhada Beneficente");

        Evento eventoAbrigo3_2 = new Evento("Feira de Adoção Especial",
        "Feira especial com atividades para famílias. Adoção de animais e brindes para os novos donos.",
        "25 de outubro de 2024", "Feira de Adoção Especial");

        
        //RepositorioAbrigos repositorioAbrigos = new RepositorioAbrigos();

        Abrigo abrigo1 = new Abrigo("Abrigo Amigos dos Animais", "Rua das Flores, 123", "abrigoamigo@email.com", "(11) 1234-5678", " Segunda a Sábado, das 10h às 17h");

        Abrigo abrigo2 = new Abrigo("Abrigo Patinhas Felizes", "Avenida dos Anjos, 456", "patinhasfelizes@email.com", "(22) 9876-5432", "Segunda a Sábado, das 10h às 17h");

        Abrigo abrigo3 = new Abrigo("Lar dos Peludos", "Endereço: Travessa das Ruas, 789", "lardospeludos@email.com", "(33) 8765-4321", " Segunda a Domingo, das 8h às 20h");



        // ABRIGO 1
        abrigo1.adicionarUsuario(usuario1);
        abrigo1.adicionarUsuario(usuario2);
        abrigo1.adicionarUsuario(usuario3);
        abrigo1.adicionarUsuario(usuario4);
        abrigo1.adicionarUsuario(usuario5);

        abrigo1.adicionarAnimal(animal1);
        abrigo1.adicionarAnimal(animal2);
        abrigo1.adicionarAnimal(animal3);
        abrigo1.adicionarAnimal(animal4);
        abrigo1.adicionarAnimal(animal5);

        abrigo1.adicionarEvento(eventoAbrigo1_1);
        abrigo1.adicionarEvento(eventoAbrigo1_2);
        

        // ABRIGO 2
        
        abrigo2.adicionarUsuario(usuario6);
        abrigo2.adicionarUsuario(usuario7);
        abrigo2.adicionarUsuario(usuario8);
        abrigo2.adicionarUsuario(usuario9);
        abrigo2.adicionarUsuario(usuario10);
        
        abrigo2.adicionarAnimal(animal6);
        abrigo2.adicionarAnimal(animal7);
        abrigo2.adicionarAnimal(animal8);
        abrigo2.adicionarAnimal(animal9);
        abrigo2.adicionarAnimal(animal10);

        abrigo2.adicionarEvento(eventoAbrigo2_1);
        abrigo2.adicionarEvento(eventoAbrigo2_2);


        // ABRIGO 3

        abrigo1.adicionarUsuario(usuario11);
        abrigo1.adicionarUsuario(usuario12);
        abrigo1.adicionarUsuario(usuario13);
        abrigo1.adicionarUsuario(usuario14);
        abrigo1.adicionarUsuario(usuario15);

   
        abrigo3.adicionarAnimal(animal11);
        abrigo3.adicionarAnimal(animal12);
        abrigo3.adicionarAnimal(animal13);
        abrigo3.adicionarAnimal(animal14);
        abrigo3.adicionarAnimal(animal15);

        abrigo3.adicionarEvento(eventoAbrigo3_1);
        abrigo3.adicionarEvento(eventoAbrigo3_2);


        

        // ------------------------------------------------------------------

        while(true){

            System.out.println();
            System.out.println("Escolha um abrigo");
            System.out.println("0 - Sair do programa");
            System.out.println("1 - Abrigo Amigos dos Animais");
            System.out.println("2 - Abrigo Patinhas Felizes");
            System.out.println("3 - Lar dos Peludos");

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            Abrigo abrigoEscolhido = new Abrigo(null, null, null, null, null);

            if (input == 0) {
                break;
            }

            switch (input) {
                case 1:
                    abrigoEscolhido = abrigo1;
                    break;

                case 2:
                    abrigoEscolhido = abrigo2;
                    break;

                case 3:
                    abrigoEscolhido = abrigo3;
                    break;

                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
            
            System.out.printf("\n");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Gereciamento de perfis de animais");
            System.out.println("2 - Processamento de Pedidos de Adocao");
            System.out.println("3 - Opcoes de pesquisa e filtro");
            System.out.println("4 - Perfil de organizações de abrigo e resgaste");
            System.out.println("5 - Recursos Educacionais");
            System.out.println("6 - Listagem e Gerenciamento de Eventos");
            System.out.printf("\n");

            input = scan.nextInt();
    
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
                        abrigoEscolhido.imprimirAnimaisDisponiveis();
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
                        abrigoEscolhido.adicionarAnimal(novoAnimal);
                        System.out.println("Novo animal adicionado com sucesso!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                break; // break do caso 1 mais externo

                // CASO 2 MAIS EXTERNO
                case 2:
                abrigoEscolhido.imprimirAnimaisDisponiveis();
                System.out.println("Selecione o numero do animal desejado para adocao:");
                int numeroAnimal = scan.nextInt();
                
                // Verificar se o número do animal é válido
                if (numeroAnimal >= 1 && numeroAnimal <= abrigoEscolhido.getAnimaisDisponiveis().size()) {
                    Animal animalSelecionado = abrigoEscolhido.getAnimaisDisponiveis().get(numeroAnimal - 1);
                    
                    // Simular o envio de pedido de adoção por um usuário
                    System.out.println("Digite seu nome de usuario para enviar o pedido:");
                    scan.nextLine(); // Limpar o buffer do scanner
                    String nomeUsuario = scan.nextLine();
                    
                    // Verificar se o usuário está relacionado ao abrigo
                    boolean usuarioExiste = abrigoEscolhido.getUsuariosRelacionados().stream().anyMatch(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario));
                    
                    if (usuarioExiste) {
                        Usuario usuarioPedido = abrigoEscolhido.getUsuariosRelacionados().stream().filter(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario)).findFirst().orElse(null);
                        
                        // Processamento do pedido de adoção
                        boolean pedidoAceito = abrigoEscolhido.solicitarAdocao(usuarioPedido, animalSelecionado);
                        

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

                        
                        
                        List<Animal> animaisPorRaca = abrigoEscolhido.buscarAnimaisPorCriterio("raca", racaPesquisa);

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
                        
                        List<Animal> animaisPorIdade = abrigoEscolhido.buscarAnimaisPorCriterio("idade", String.valueOf(idadePesquisa));
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
                        
                        List<Animal> animaisPorPersonalidade = abrigoEscolhido.buscarAnimaisPorCriterio("personalidade", personalidadePesquisa);
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

                case 4:
                abrigo1.imprimirPerfilAbrigo();
                abrigo2.imprimirPerfilAbrigo();
                abrigo3.imprimirPerfilAbrigo();

                break;

                case 5:
                System.out.println("Recursos Educacionais Disponíveis:");
                System.out.println("1 - Cuidados Básicos com Animais de Estimação");
                System.out.println("2 - Guia de Adoção Responsável");
                System.out.println("3 - Comportamento Animal");

                System.out.println();
                System.out.println("Sobre qual você deseja ler?");

                int opcao = scan.nextInt();
                String caminhoDoArquivo = "";

                switch (opcao) {
                    case 1:
                        caminhoDoArquivo = "1 - Cuidados Basicos.txt";
                        break;
                    case 2:
                        caminhoDoArquivo = "2 - Guia de Adocao Responsavel.txt";
                        break;
                    case 3:
                        caminhoDoArquivo = "3 - Comportamento Animal.txt";
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }

                imprimirRecursoEducacional(caminhoDoArquivo);
                break;

                case 6:
                System.out.println("\nO que voce quer?");
                System.out.println("1 - Adicionar um Evento");
                System.out.println("2 - Lista dos Eventos");

                input = scan.nextInt();

                switch (input) {
                    case 1:
                    System.out.println("Digite o nome do Evento:");
                    scan.nextLine();
                    String nomeEvento = scan.nextLine();
                    System.out.println("Digite a descricao do Evento");
                    
                    String descricao = scan.nextLine();
                    System.out.println("Digite a data do Evento");
                    
                    String data = scan.nextLine();
                    System.out.println("Digite o tipo do Evento");
                    
                    String tipo = scan.nextLine();

                    Evento novoEvento = new Evento(nomeEvento, descricao, data, tipo);

                    abrigoEscolhido.adicionarEvento(novoEvento);

                        break;

                    case 2:
                    abrigoEscolhido.listarEventos();
                        break;
                    default:
                        break;
                }
                break;

                default:
                    break;
            }
        }
    }
}