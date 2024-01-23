import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

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
            System.err.println("Erro ao configurar a codifica��o UTF-8: " + e.getMessage());
        }
    }

    public static void main(String[] args) {


        InicializadorDados.inicializadorBaseDados();

        List<Abrigo> abrigos = InicializadorDados.getAbrigos();
        Forum forum = InicializadorDados.getForum();

        while(true){

            System.out.println();
            System.out.println("Escolha um abrigo");
            System.out.println("0 - Sair do programa");
            
            int i = 1;

            for (Abrigo abrigo : abrigos) {
                System.out.println(i + " - " + abrigo.getNomeAbrigo());
                i++;
            }
    
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            Abrigo abrigoEscolhido = null;

            if (input == 0) {
                break;
            }

            switch (input) {

                case 1: 
                    abrigoEscolhido = abrigos.get(input - 1);
                    break;
                
                case 2:
                    abrigoEscolhido = abrigos.get(input - 1);
                    break;

                case 3:
                    abrigoEscolhido = abrigos.get(input - 1);
                    break;

                default:
                    System.out.println("\nOpcão Inválida.");
                    continue;
            }
            
            System.out.printf("\n");
            System.out.println("O que deseja fazer?");
            System.out.println(" 1 - Gereciamento de Perfis de Animais");
            System.out.println(" 2 - Processamento de Pedidos de Ado��o");
            System.out.println(" 3 - Opcoes de Pesquisa e Filtro");
            System.out.println(" 4 - Perfil de Organiza��es de Abrigo e Resgaste");
            System.out.println(" 5 - Recursos Educacionais");
            System.out.println(" 6 - Listagem e Gerenciamento de Eventos");
            System.out.println(" 7 - Gerenciamento de Contas de Usu�rio");
            System.out.println(" 8 - Fazer uma Doação");
            System.out.println(" 9 - Histórias de Sucesso e Depoimentos");
            System.out.println("10 - Fórum");
            System.out.printf("\n");

            input = scan.nextInt();
    
            switch (input) {

                // CASO 1 MAIS EXTERNO
                case 1:
                System.out.println("Informe a Operação Desejada");
                System.out.println("1 - Listar Animais Dispon�veis");
                System.out.println("2 - Adicionar Novo Animal");
                System.out.printf("\n");
                int opcaoAnimal = scan.nextInt();
            
            
                switch (opcaoAnimal) {
                    case 1:
                        // Listar animais dispon�veis
                        abrigoEscolhido.imprimirAnimaisDisponiveis();
                        break;

                    case 2:
                        // Adicionar novo animal
                        System.out.println("Digite o nome do animal:");
                        scan.nextLine(); // Limpar o buffer do scanner
                        String nomeAnimal = scan.nextLine();
                        System.out.println("Digite a idade do animal:");
                        int idadeAnimal = scan.nextInt();
                        System.out.println("Digite a ra�a do animal:");
                        scan.nextLine(); // Limpar o buffer do scanner
                        String racaAnimal = scan.nextLine();
                        System.out.println("Digite a personalidade do animal:");
                        String personalidadeAnimal = scan.nextLine();
                        
                        Animal novoAnimal = new Animal(nomeAnimal, idadeAnimal, racaAnimal, personalidadeAnimal);
                        abrigoEscolhido.adicionarAnimal(novoAnimal);
                        System.out.println("Novo animal adicionado com sucesso!");
                        break;

                    default:
                        System.out.println("Op��o Inv�lida.");
                        break;
                }
                break; // break do caso 1 mais externo

                // CASO 2 MAIS EXTERNO
                case 2:
                abrigoEscolhido.imprimirAnimaisDisponiveis();
                System.out.println("Selecione o numero do animal desejado para ado��o:");
                int numeroAnimal = scan.nextInt();
                
                // Verificar se o n�mero do animal � v�lido
                if (numeroAnimal >= 1 && numeroAnimal <= abrigoEscolhido.getAnimaisDisponiveis().size()) {
                    Animal animalSelecionado = abrigoEscolhido.getAnimaisDisponiveis().get(numeroAnimal - 1);
                    
                    // Simular o envio de pedido de ado��o por um usu�rio
                    System.out.println("Digite seu nome de usu�rio para enviar o pedido:");
                    scan.nextLine(); // Limpar o buffer do scanner
                    String nomeUsuario = scan.nextLine();
                    
                    // Verificar se o usu�rio est� relacionado ao abrigo
                    boolean usuarioExiste = abrigoEscolhido.getUsuariosRelacionados().stream().anyMatch(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario));
                    
                    if (usuarioExiste) {
                        Usuario usuarioPedido = abrigoEscolhido.getUsuariosRelacionados().stream().filter(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario)).findFirst().orElse(null);
                        
                        // Processamento do pedido de ado��o
                        boolean pedidoAceito = abrigoEscolhido.solicitarAdocao(usuarioPedido, animalSelecionado);
                        

                        if (pedidoAceito) {
                            System.out.println("Pedido de ado��o enviado com sucesso!");
                        } else {
                            System.out.println("Desculpe, o pedido de ado��o n�o pode ser conclu�do.");
                        }
                    } else {
                        System.out.println("Usu�rio n�o encontrado no abrigo.");
                    }
                } else {
                    System.out.println("N�mero de animal inv�lido.");
                }
                break;

                // CASO 3 MAIS EXTERNO
                case 3:
                System.out.println("Escolha uma opção de pesquisa:");
                System.out.println("1 - Pesquisar por Ra�a");
                System.out.println("2 - Pesquisar por Idade");
                System.out.println("3 - Pesquisar por Personalidade");
                
                int opcaoPesquisa = scan.nextInt();
                
                switch (opcaoPesquisa) {
                    case 1:
                        // Pesquisar por ra�a
                        System.out.println("Digite a ra�a para pesquisa:");
                        scan.nextLine(); // Limpar o buffer do scanner
                        String racaPesquisa = scan.nextLine();

                        
                        
                        List<Animal> animaisPorRaca = abrigoEscolhido.buscarAnimaisPorCriterio("raca", racaPesquisa);

                        if (!animaisPorRaca.isEmpty()) {
                            System.out.println("Animais encontrados com a ra�a '" + racaPesquisa + "':");
                            for (Animal animal : animaisPorRaca) {
                                System.out.println(animal);
                            }
                        } else {
                            System.out.println("Nenhum animal encontrado com a ra�a '" + racaPesquisa + "'.");
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
                        System.out.println("Op��o Inv�lida.");
                        break;
                }
                break;

                case 4:

                for (Abrigo abrigo : abrigos) {
                    abrigo.imprimirPerfilAbrigo();
                }

                break;

                case 5:
                System.out.println("Recursos Educacionais Dispon�veis:");
                System.out.println("1 - Cuidados B�sicos com Animais de Estima��o");
                System.out.println("2 - Guia de Ado��o Respons�vel");
                System.out.println("3 - Comportamento Animal");

                System.out.println();
                System.out.println("Sobre qual voc� deseja ler?");

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
                        System.out.println("Op��o Inv�lida!");
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

                case 7:
                    System.out.println("\nO que voce quer fazer?");
                    System.out.println("1 - Criar uma Conta");
                    System.out.println("2 - Atualizar os Dados");
                    System.out.println("3 - Excluir a Conta");

                    input = scan.nextInt();

                    switch (input) {
                        case 1:
                            System.out.println("Digite seu nome:");
                            scan.nextLine();
                            String nomeUsuario = scan.nextLine();
                            System.out.println("Digite o email");
                            String emailUsuario = scan.nextLine();
                            System.out.println("Digite a senha");
                            String senhaUsuario = scan.nextLine();

                            Usuario novoUsuario = new Usuario(nomeUsuario, emailUsuario, senhaUsuario);

                            abrigoEscolhido.adicionarUsuario(novoUsuario);
                            System.out.println("Usuario adicionado com sucesso!");
                        break;

                        case 2:
                            System.out.println("Digite os dados atuais:");
                            System.out.println("Digite seu nome:");
                            scan.nextLine();
                            String Nome = scan.nextLine();
                            System.out.println("Digite o email");
                            String Email = scan.nextLine();
                            System.out.println("Digite a senha");
                            String Senha = scan.nextLine();

                            System.out.println("\nDigite os novos dados:");
                            System.out.println("Digite seu nome:");
                            String novoNome = scan.nextLine();
                            System.out.println("Digite o email");
                            String novoEmail = scan.nextLine();
                            System.out.println("Digite a senha");
                            String novaSenha = scan.nextLine();

                            Usuario usuarioDesatualizado = new Usuario(Nome, Email, Senha);
                            Usuario usuarioAtualizado = new Usuario(novoNome, novoEmail, novaSenha);

                            abrigoEscolhido.atualizarContaUsuario(usuarioDesatualizado, usuarioAtualizado);

                        break;

                        case 3:
                            System.out.println("Digite os seus dados");
                            System.out.println("Digite seu nome:");
                            scan.nextLine();
                            String nome = scan.nextLine();
                            System.out.println("Digite o email");
                            String email = scan.nextLine();
                            System.out.println("Digite a senha");
                            String senha = scan.nextLine();

                            Usuario usuarioDelete = new Usuario(nome, email, senha);

                            abrigoEscolhido.excluirContaUsuario(usuarioDelete);

                        break;

                    default:
                        break;
                    }

                break; // break do caso 7

                case 8:

                System.out.println("Informe o valor que deseja doar");
                double valor;

                scan.useLocale(Locale.US); // Aceita . na entrada. Exemplo: 150.20

                valor = scan.nextDouble();

                abrigoEscolhido.receberDoacao(valor);
                //System.out.println(abrigoEscolhido.getDoacoes());

                break;

                case 9:

                System.out.println("O que desejar fazer");
                System.out.println("1 - Adicionar um Hist�ria");
                System.out.println("2 - Ver as Hist�rias");

                input = scan.nextInt();

                switch (input) {
                    case 1:
                        System.out.println("Conte sua hist�ria");
                        scan.nextLine();
                        String historia = scan.nextLine();

                        abrigoEscolhido.adicionarHistoriaSucesso(historia);
                        break;

                    case 2:
                        abrigoEscolhido.listarHistoriasSucesso();
                        break;
                    default:
                        break;
                }

                break;

                case 10:

                System.out.println();
                forum.exivirTopicos();
                System.out.println();
                //System.out.println();
                /* forum.exibirMensagensDoTopico(0);
                forum.exibirMensagensDoTopico(1);
                forum.exibirMensagensDoTopico(2);
                forum.exibirMensagensDoTopico(3);
                forum.exibirMensagensDoTopico(4); */

                System.out.println("O que desejar fazer?");
                System.out.println("1 - Falar sobre um T�pico");
                System.out.println("2 - Adicionar um T�pico");
                System.out.println("3 - Ver Mensagens de um T�pico");

                input = scan.nextInt();

                if (input == 1) {

                    System.out.println("Sobre qual t�pico voc� gostaria de falar?");
                    int topico = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Informe seu nome");
                    String nome = scan.nextLine();
                    System.out.println("Digite sua mensagem");
                    String mensagem = scan.nextLine();

                    forum.adicionarMensagemNoTopico(topico - 1, nome, mensagem);

                }

                else if (input == 2) {

                    System.out.println("Informe o titulo do t�pico");
                    String titulo = scan.nextLine();

                    forum.criarTopico(titulo);
                }

                else if (input == 3) {

                    System.out.println("Informe o t�pico que desejar ver as mensagens");
                    int topico = scan.nextInt();

                    forum.exibirMensagensDoTopico(topico - 1);
                }

                break;
                    

                default:
                    break;
            }
        }
    }
}