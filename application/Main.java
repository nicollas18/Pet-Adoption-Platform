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
        Animal animal1 = new Animal("Bolinha", 2, "Vira-lata", "Brincalh�o");
        Animal animal2 = new Animal("Frajola", 3, "Siam�s", "Calmo");
        Animal animal3 = new Animal("Rex", 5, "Labrador", "Amig�vel");
        Animal animal4 = new Animal("Luna", 1, "Persa", "Independente");
        Animal animal5 = new Animal("Thor", 4, "Golden Retriever", "Ativo");
        Animal animal6 = new Animal("Mia", 6, "Poodle", "Inteligente");
        Animal animal7 = new Animal("Simba", 2, "Bengal", "Curioso");
        Animal animal8 = new Animal("Nina", 3, "Boxer", "Energ�tico");
        Animal animal9 = new Animal("Bob", 2, "Bulldog Franc�s", "Afetuoso");
        Animal animal10 = new Animal("Tobby", 4, "D�lmata", "Protetor");
        Animal animal11 = new Animal("Pel�cia", 2, "Chow Chow", "Alegre");
        Animal animal12 = new Animal("Marley", 4, "Pastor Alem�o", "Protetor");
        Animal animal13 = new Animal("Luna", 3, "Shih Tzu", "Carinhosa");
        Animal animal14 = new Animal("Boris", 5, "Rottweiler", "Leal");
        Animal animal15 = new Animal("Miau", 1, "Gato Persa", "Curioso");

        Evento eventoAbrigo1_1 = new Evento("Campanha de Ado��o de Inverno",
        "Campanha especial para ado��o de animais durante o inverno. Descontos especiais e kits de boas-vindas para os novos donos",
        "15 de julho de 2024", "Campanha de Ado��o");

        Evento eventoAbrigo1_2 = new Evento("Arrecada��o de Fundos",
        "Evento para arrecadar fundos para a constru��o de novos canis. Rifa e bazares beneficentes ser�o realizados.",
        "30 de setembro de 2024", "Arrecada��o de Fundos");

        // Eventos para o Abrigo 2
        Evento eventoAbrigo2_1 = new Evento("Feira de Ado��o",
        "Feira com diversos animais dispon�veis para ado��o. Palestras e atividades para crian�as.",
        "5 de agosto de 2024", "Feira de Ado��o");

        Evento eventoAbrigo2_2 = new Evento("Campanha de Vacina��o",
        "Vacina��o gratuita para c�es e gatos. Todos s�o bem-vindos!",
        "20 de outubro de 2024", "Campanha de Sa�de");

        Evento eventoAbrigo3_1 = new Evento("Caminhada Solid�ria",
        "Caminhada com os animais dispon�veis para ado��o. Todos est�o convidados a participar!",
        "12 de agosto de 2024", "Caminhada Beneficente");

        Evento eventoAbrigo3_2 = new Evento("Feira de Ado��o Especial",
        "Feira especial com atividades para fam�lias. Ado��o de animais e brindes para os novos donos.",
        "25 de outubro de 2024", "Feira de Ado��o Especial");

        String historia1 = "Polly encontrou um lar amoroso! Ela era t�mida, mas com paci�ncia e carinho, se tornou a alegria da fam�lia. Adotada em 10/02/2023.";
        String historia2 = "Rex, agora Apollo, � um companheiro fiel! Ele veio cheio de energia e se tornou o melhor amigo de todas as horas. Adotado em 25/06/2023.";
        String historia3 = "Luna, a doce gatinha, encontrou seu lar perfeito. Ela adora dormir na janela e brincar com seus novos amigos felinos. Adotada em 05/11/2023.";

        
        //RepositorioAbrigos repositorioAbrigos = new RepositorioAbrigos();

        Abrigo abrigo1 = new Abrigo("Abrigo Amigos dos Animais", "Rua das Flores, 123", "abrigoamigo@email.com", "(11) 1234-5678", " Segunda a S�bado, das 10h �s 17h");

        Abrigo abrigo2 = new Abrigo("Abrigo Patinhas Felizes", "Avenida dos Anjos, 456", "patinhasfelizes@email.com", "(22) 9876-5432", "Segunda a S�bado, das 10h �s 17h");

        Abrigo abrigo3 = new Abrigo("Lar dos Peludos", "Endere�o: Travessa das Ruas, 789", "lardospeludos@email.com", "(33) 8765-4321", " Segunda a Domingo, das 8h �s 20h");

        Forum forum = new Forum();

        forum.criarTopico("Dicas para cuidar de animais");
        forum.criarTopico("Compartilhe sua hist�ria de ado��o");
        forum.criarTopico("Dicas de Treinamento");
        forum.criarTopico("Sa�de e Bem-Estar");
        forum.criarTopico("Comportamento Animal");

        // T�pico 1
        forum.adicionarMensagemNoTopico(0, "Carol", "Sempre ofere�a �gua fresca para seus pets!");
        forum.adicionarMensagemNoTopico(0, "Pedro", "� importante manter uma rotina de alimenta��o para os animais.");

        // T�pico 2
        forum.adicionarMensagemNoTopico(1, "Mariana", "Adotei um gato no abrigo e ele se tornou meu melhor amigo!");
        forum.adicionarMensagemNoTopico(1, "Rafael", "Minha hist�ria de ado��o mudou minha vida para sempre.");

        // T�pico 3
        forum.adicionarMensagemNoTopico(2, "Marcos", "Algu�m tem dicas para treinar um filhote?");
        forum.adicionarMensagemNoTopico(2, "Bruno", "Eu costumo usar refor�o positivo para treinar meu cachorro. Funciona muito bem!");

        // T�pico 4
        forum.adicionarMensagemNoTopico(3, "Luiza", "Como manter a sa�de do meu gato em dia?");
        forum.adicionarMensagemNoTopico(3, "Daniel", "Consultas regulares ao veterin�rio s�o essenciais para a sa�de dos pets.");

        forum.adicionarMensagemNoTopico(4, "Ithalo", "Meu cachorro est� agindo de maneira estranha, algu�m j� passou por isso?");
        forum.adicionarMensagemNoTopico(4, "Leticia", "Pode ser estresse. Tente entender se algo mudou na rotina dele.");

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

        abrigo1.adicionarHistoriaSucesso(historia1);
        

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

        abrigo2.adicionarHistoriaSucesso(historia2);


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

        abrigo3.adicionarHistoriaSucesso(historia3);


        

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
                    System.out.println("\nOpcao invalida.");
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
            System.out.println(" 8 - Fazer uma Doa��o");
            System.out.println(" 9 - Hist�rias de Sucesso e Depoimentos");
            System.out.println("10 - F�rum");
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
                abrigo1.imprimirPerfilAbrigo();
                abrigo2.imprimirPerfilAbrigo();
                abrigo3.imprimirPerfilAbrigo();

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